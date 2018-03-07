package com.ivieleague.randomizer.logic


data class RenderConfiguration(
        var locations: List<RLocation>,
        var nodes: List<RNode>,
        var locationUnopened: String? = null,
        var locationOpen: String? = null,
        var map: String? = null,
        var locationMapUnopened: String? = null,
        var locationMapOpen: String? = null
) {
    constructor(game: Game) : this(
            locations = game.locations.map { RLocation(it.name, 0, 0) },
            nodes = game.items.values.map { RItem(it.name, listOf(), "", it.count > 1) }
    )
}

interface RNode

data class RItem(
        var name: String,
        var images: List<String>,
        var subtext: String,
        var showCount: Boolean
) : RNode

data class RCategory(
        var name: String,
        var image: String,
        var children: RItem
) : RNode

data class RLocation(
        var name: String,
        var x: Int,
        var y: Int
)