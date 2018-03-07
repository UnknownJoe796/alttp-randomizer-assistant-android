package com.ivieleague.randomizer.logic

data class Item(
        var name: String = "",
        var categories: List<String> = listOf(),
        var images:List<String> = listOf(),
        var imageText:String = "",
        var count:Int = 1
) {
    fun toCreateCode(): String = "Item(name=\"$name\",images=listOf(${images.joinToString { "\"$it\"" }}),categories=listOf(${categories.joinToString { "\"$it\"" }}))"
}

/*
OPTIONS
Layer multiple images?
Show text?
*/