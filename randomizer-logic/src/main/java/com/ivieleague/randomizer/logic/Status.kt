package com.ivieleague.randomizer.logic

data class Status(
        val setAliases:Map<String, Requirement> = mapOf(),
        val locationsFound:Set<String> = setOf(),
        val inventory: Map<String, Int> = mapOf()
){
    fun availableLocations(game: Game) = game.locations.filter { it.requires.accessible(inventory, game.aliases + setAliases) > 0f }
    fun obtain(item:String): Status {
        val newCount:Int = inventory.getOrDefault(item, 0) + 1
        return copy(inventory = inventory + (item to newCount))
    }
    fun cycle(game: Game, item:String): Status {
        var newCount:Int = inventory.getOrDefault(item, 0) + 1
        if(newCount > game.items[item]?.count ?: 0){
            newCount = 0
        }
        return copy(inventory = inventory + (item to newCount))
    }
    fun found(location:String): Status {
        return copy(locationsFound = locationsFound + location)
    }
    fun setAlias(key:String, requirement: Requirement): Status {
        return copy(
                setAliases = setAliases + (key to requirement)
        )
    }
}