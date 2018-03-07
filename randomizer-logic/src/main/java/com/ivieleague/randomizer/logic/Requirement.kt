package com.ivieleague.randomizer.logic

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.module.SimpleModule

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(
        JsonSubTypes.Type(value = Requirement.None::class, name = "satisfied"),
        JsonSubTypes.Type(value = Requirement.Or::class, name = "or"),
        JsonSubTypes.Type(value = Requirement.And::class, name = "and"),
        JsonSubTypes.Type(value = Requirement.Has::class, name = "has"),
        JsonSubTypes.Type(value = Requirement.HasMultiple::class, name = "hasMultiple")
)
sealed class Requirement() {
    abstract fun accessible(inventory: Map<String, Int>, aliases: Map<String, Requirement>): Float
    open fun simplify(aliases: Map<String, Requirement>): Requirement = this
    abstract fun toCreateCode(): String

    object JacksonModule : SimpleModule("Requirement"){
//        init{
//            addSerializer(object : StdSerializer<Requirement.None>(Requirement.None::class.java){
//                override fun serialize(value: Requirement.None, gen: JsonGenerator, serializers: SerializerProvider) {
//                    gen.writeString("None")
//                }
//            })
//            addSerializer(object : StdSerializer<Requirement.Or>(Requirement.Or::class.java){
//                override fun serialize(value: Requirement.Or, gen: JsonGenerator, serializers: SerializerProvider) {
//                    gen.writeStartArray()
//                    gen.writeString("or")
//                    for(item in value.sub){
//                        serializers.findValueSerializer(item.javaClass).serialize(item, gen, serializers)
//                    }
//                    gen.writeEndArray()
//                }
//            })
//            addSerializer(object : StdSerializer<Requirement.And>(Requirement.And::class.java){
//                override fun serialize(value: Requirement.And, gen: JsonGenerator, serializers: SerializerProvider) {
//                    gen.writeStartArray()
//                    gen.writeString("and")
//                    for(item in value.sub){
//                        serializers.findValueSerializer(item.javaClass).serialize(item, gen, serializers)
//                    }
//                    gen.writeEndArray()
//                }
//            })
//            addSerializer(object : StdSerializer<Requirement.Has>(Requirement.Has::class.java){
//                override fun serialize(value: Requirement.Has, gen: JsonGenerator, serializers: SerializerProvider) {
//                    gen.writeString(value.item)
//                }
//            })
//            addSerializer(object : StdSerializer<Requirement.HasMultiple>(Requirement.HasMultiple::class.java){
//                override fun serialize(value: Requirement.HasMultiple, gen: JsonGenerator, serializers: SerializerProvider) {
//                    gen.writeString(value.item + "/" + value.minCount + "/" + value.sureCount)
//                }
//            })
//            addDeserializer(Requirement::class.java, object : StdDeserializer<Requirement>(Requirement::class.java){
//                override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Requirement {
//                    return when(p.currentToken){
//                        JsonToken.START_ARRAY -> {
//                            p.nextToken()
//                            val operation = p.valueAsString.toLowerCase()
//                            val components = ArrayList<Requirement>()
//                            p.nextToken()
//                            while(p.tokenLocation != JsonToken.END_ARRAY){
//                                components.add(deserialize(p, ctxt))
//                            }
//                            p.nextToken()
//                            when(operation){
//                                "and" -> Requirement.And(components)
//                                "or" -> Requirement.Or(components)
//                                else -> throw IllegalArgumentException("Operation '${operation}' not recognized.")
//                            }
//                        }
//                        JsonToken.VALUE_STRING -> TODO()
//                        else -> throw IllegalArgumentException()
//                    }
//                }
//            })
//        }
    }

    object None : Requirement() {
        @JsonCreator @JvmStatic fun gen() = None
        override fun accessible(
                inventory: Map<String, Int>,
                aliases: Map<String, Requirement>
        ) = 1f
        override fun toString(): String = "None"
        override fun toCreateCode(): String = "Requirement.None"
    }

    class Or(var sub: List<Requirement> = listOf()) : Requirement() {
        override fun accessible(
                inventory: Map<String, Int>,
                aliases: Map<String, Requirement>
        ) = sub.map { it.accessible(inventory, aliases) }.max() ?: 0f

        override fun simplify(aliases: Map<String, Requirement>): Requirement {
            val less = sub
                    .map { it.simplify(aliases) }
                    .flatMap {
                        if (it is Or) it.sub
                        else listOf(it)
                    }
                    .filter { it != None }
            return when (less.size) {
                0 -> None
                1 -> less.first()
                else -> Or(less)
            }
        }

        override fun toString(): String = sub.joinToString(" or ", "(", ")")
        override fun toCreateCode(): String = "Requirement.Or(listOf(${sub.joinToString { it.toCreateCode() }}))"
    }

    class And(var sub: List<Requirement> = listOf()) : Requirement() {
        override fun accessible(
                inventory: Map<String, Int>,
                aliases: Map<String, Requirement>
        ) = sub.map { it.accessible(inventory, aliases) }.reduce { a, b -> a * b }

        override fun simplify(aliases: Map<String, Requirement>): Requirement {
            val less = sub
                    .map { it.simplify(aliases) }
                    .flatMap {
                        if (it is And) it.sub
                        else listOf(it)
                    }
                    .filter { it != None }
            return when (less.size) {
                0 -> None
                1 -> less.first()
                else -> And(less)
            }
        }

        override fun toString(): String = sub.joinToString(" and ", "(", ")")
        override fun toCreateCode(): String = "Requirement.And(listOf(${sub.joinToString { it.toCreateCode() }}))"
    }

    class Has(var item: String = "") : Requirement() {
        override fun accessible(
                inventory: Map<String, Int>,
                aliases: Map<String, Requirement>
        ): Float = aliases[item]?.accessible(inventory, aliases) ?: if (inventory.getOrDefault(item, 0) > 0) 1f else 0f

        override fun simplify(aliases: Map<String, Requirement>): Requirement = aliases[item]?.simplify(aliases) ?: this

        override fun toString(): String = item
        override fun equals(other: Any?): Boolean = other is Has && other.item == item
        override fun hashCode(): Int = item.hashCode() * 2
        override fun toCreateCode(): String = "Requirement.Has(\"$item\")"
    }

    class HasMultiple(var item: String = "", var minCount: Int = 1, var sureCount: Int = minCount) : Requirement() {
        override fun accessible(
                inventory: Map<String, Int>,
                aliases: Map<String, Requirement>
        ): Float {
            if(minCount == sureCount){
                return if (inventory.getOrDefault(item, 0) >= sureCount) 1f else 0f
            } else {
                //0-1-2 -> 0/2
                //1-1-2 -> 1/2
                //2-1-2 -> 2/2
                return ((inventory.getOrDefault(item, 0).toFloat() - minCount + 1) / (sureCount - minCount + 1)).coerceIn(0f, 1f)
            }
        }

        override fun toString(): String = item + "x$sureCount"
        override fun equals(other: Any?): Boolean
                = other is HasMultiple &&
                other.item == item &&
                other.minCount == minCount &&
                other.sureCount == sureCount
        override fun hashCode(): Int = item.hashCode() xor minCount.hashCode() xor sureCount.hashCode()
        override fun toCreateCode(): String = "Requirement.HasMultiple(\"$item\", $minCount, $sureCount)"
    }
}