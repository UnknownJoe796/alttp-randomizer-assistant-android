package com.ivieleague.randomizer.logic

import org.junit.Test

class StatusTest{

    @Test
    fun testStart(){
        println(Status().availableLocations(Keysanity.game))
    }

    @Test
    fun testDouble(){
        val game = Game(
                aliases = mapOf(),
                locations = listOf(
                        Location("Need Dubba Gloves", requires = Requirement.HasMultiple("Glove", 2))
                ),
                items = mapOf(
                        "Glove" to Item("Glove")
                ),
                alternativeAliases = mapOf()
        )
        println(Status(inventory = mapOf("Glove" to 2)).availableLocations(game))
    }
}