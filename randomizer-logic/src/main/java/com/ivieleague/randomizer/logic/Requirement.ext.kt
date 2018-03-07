package com.ivieleague.randomizer.logic

fun Requirement.options(): Sequence<List<Requirement>> {
    return when (this) {
        Requirement.None -> sequenceOf()
        is Requirement.Or -> sub.asSequence().flatMap { it.options() }
        is Requirement.And -> {
            var current = sequenceOf(listOf<Requirement>())

            for (item in sub) {
                current = current.flatMap { a -> item.options().map { b -> a + b } }
            }

            current.asSequence()
        }
        is Requirement.Has -> sequenceOf(listOf(this))
        is Requirement.HasMultiple -> sequenceOf(listOf(this))
    }
}

fun Sequence<List<Requirement>>.simplifyOptions():Sequence<List<Requirement>>{
    return map{
        it.distinct()
    }.distinct()
}

//fun main(vararg args: String) {
//    val req = Requirement.And(listOf(
//            Requirement.Or(listOf(
//                    Requirement.Has("A"),
//                    Requirement.Has("B")
//            )),
//            Requirement.Or(listOf(
//                    Requirement.Has("C"),
//                    Requirement.Has("D")
//            )),
//            Requirement.Or(listOf(
//                    Requirement.Has("E"),
//                    Requirement.Has("F")
//            ))
//    ))
//    println(req.options().joinToString("\n"){ it.joinToString()})
//}