package com.ivieleague.randomizer.logic

import com.fasterxml.jackson.databind.ObjectMapper

fun main(vararg args:String){


    val game = Keysanity.game
    val simplified = game.locations.map { it.copy(requires = it.requires.simplify(game.aliases)) }

    println("---Aliases---")
    println(game.aliases.entries.joinToString("\n"))
    println()

    println("---Simplified Locations---")
    println(simplified.joinToString("\n"))
    println()

    println("---Item Value Analysis---")
    println(
            simplified.asSequence().flatMap {
                it.requires.flattenRecursive<Requirement>({
                    when (it) {
                        is Requirement.And -> it.sub
                        is Requirement.Or -> it.sub
                        else -> listOf<Requirement>()
                    }
                })
            }.mapNotNull {
                when (it) {
                    Requirement.None -> null
                    is Requirement.Or -> null
                    is Requirement.And -> null
                    is Requirement.Has -> it.item
                    is Requirement.HasMultiple -> it.item
                }
            }.groupBy { it }.mapValues { it.value.size }.entries.sortedBy { it.value }.joinToString("\n")
    )
    println()

    println("---Location Options---")
    println(game.locations.joinToString("\n") {
        it.name + it.requires.options().simplifyOptions().joinToString("\n\t", "\n\t", "\n") {
            it.joinToString()
        }
    })
    println()

    println("---JSON---")
    println(ObjectMapper().registerModule(Requirement.JacksonModule).writeValueAsString(game))
    println()

    println("---Create---")
    println(game.toCreateCode())
    println()

    println(Status().availableLocations(game))
}

fun Game.itemValues(): List<Pair<Item, Int>> {
    val simplified = this.locations.map { it.copy(requires = it.requires.simplify(this.aliases)) }
    return simplified.asSequence().flatMap {
        it.requires.flattenRecursive<Requirement>({
            when (it) {
                is Requirement.And -> it.sub
                is Requirement.Or -> it.sub
                else -> listOf<Requirement>()
            }
        })
    }.mapNotNull {
        when (it) {
            Requirement.None -> null
            is Requirement.Or -> null
            is Requirement.And -> null
            is Requirement.Has -> it.item
            is Requirement.HasMultiple -> it.item
        }
    }.groupBy { it }
            .mapValues { it.value.size }
            .mapKeys { this.items[it.key] }
            .entries
            .sortedByDescending { it.value }
            .mapNotNull { if(it.key == null) null else it.key!! to it.value }
}