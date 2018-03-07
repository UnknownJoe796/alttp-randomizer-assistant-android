package com.ivieleague.randomizer.logic

import org.junit.Assert
import org.junit.Test

/**
 * Created by josep on 1/14/2018.
 */
class HasMultipleTest{
    @Test
    fun testSimple(){
        val req = Requirement.HasMultiple("A", 2, 2)
        Assert.assertEquals(
                1f,
                req.accessible(
                        inventory = mapOf("A" to 2),
                        aliases = mapOf()
                )
        )
    }
}