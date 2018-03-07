package com.ivieleague.randomizer.logic

data class Location(
        var name: String = "",
        var region: String = "",
        var requires: Requirement = Requirement.None,
        var glitchRequires: Requirement = requires
) {
    fun toCreateCode(): String = "Location(name=\"$name\",region=\"$region\",requires=${requires.toCreateCode()})"
}