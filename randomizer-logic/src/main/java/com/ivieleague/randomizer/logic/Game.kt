package com.ivieleague.randomizer.logic

data class Game(
        val aliases:Map<String, Requirement>,
        val locations:List<Location>,
        val items:Map<String, Item>,
        val alternativeAliases:Map<String, List<Requirement>>,
        val organizeBy:List<Category> = listOf()
) {
    fun toCreateCodeAliases() = "mapOf(" + aliases.entries.joinToString{"\"${it.key}\" to ${it.value.toCreateCode()}"} + ")"
    fun toCreateCodeLocations() = "listOf(" + locations.joinToString{it.toCreateCode()} + ")"
    fun toCreateCodeItems() = "mapOf(" + items.entries.joinToString{"\"${it.key}\" to ${it.value.toCreateCode()}"} + ")"
    fun toCreateCodeAlternativeAliases() = "mapOf(" + alternativeAliases.entries.joinToString{"\"${it.key}\" to ${toCreateCodeAlternativeAliasesList(it.value)}"} + ")"
    private fun toCreateCodeAlternativeAliasesList(list:List<Requirement>) = "listOf(" + list.joinToString{it.toCreateCode()} + ")"
    fun toCreateCode() = "Game(aliases=${toCreateCodeAliases()}, locations=${toCreateCodeLocations()}, items=${toCreateCodeItems()}, alternativeAliases=${toCreateCodeAlternativeAliases()})"
}