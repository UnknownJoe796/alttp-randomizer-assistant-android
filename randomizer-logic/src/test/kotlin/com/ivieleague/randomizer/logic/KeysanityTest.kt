package com.ivieleague.randomizer.logic

import com.lightningkite.kotlin.networking.jackson.jacksonToString
import org.junit.Assert.*
import org.junit.Test
/**
 *
 * Created by josep on 1/16/2018.
 */
class KeysanityTest {
    @Test
    fun toJson(){
        println(Keysanity.game.jacksonToString())
    }
    @Test
    fun testGanon(){
        val simplified = Keysanity.game.locations.map { it.copy(requires = it.requires.simplify(Keysanity.game.aliases)) }
        println( simplified.asSequence().flatMap {
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
        }.distinct().joinToString("\n"))
    }
}