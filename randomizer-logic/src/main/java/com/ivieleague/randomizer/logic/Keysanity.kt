package com.ivieleague.randomizer.logic

object Keysanity {
    val game = Game(
            aliases = mapOf(
                    "East Dark World Death Mountain" to Requirement.And(
                            listOf(
                                    Requirement.Has("canLiftDarkRocks"),
                                    Requirement.Has("East Death Mountain")
                            )
                    ),
                    "West Dark World Death Mountain" to Requirement.None,
                    "Mire Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("canFly"),
                                    Requirement.Has("canLiftDarkRocks")
                            )
                    ),
                    "North East Dark World" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Agahnim Defeated"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("Hammer"),
                                                    Requirement.Has("canLiftRocks"),
                                                    Requirement.Has("Moon Pearl")
                                            )
                                    ),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("canLiftDarkRocks"),
                                                    Requirement.Has("Flippers"),
                                                    Requirement.Has("Moon Pearl")
                                            )
                                    )
                            )
                    ),
                    "North West Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("North East Dark World"),
                                                                    Requirement.And(
                                                                            listOf(
                                                                                    Requirement.Has("Hookshot"),
                                                                                    Requirement.Or(
                                                                                            listOf(
                                                                                                    Requirement.Has("Flippers"),
                                                                                                    Requirement.Has("canLiftRocks"),
                                                                                                    Requirement.Has("Hammer")
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    ),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("canLiftRocks")
                                                            )
                                                    ),
                                                    Requirement.Has("canLiftDarkRocks")
                                            )
                                    )
                            )
                    ),
                    "South Dark World" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("North East Dark World"),
                                                                    Requirement.Or(
                                                                            listOf(
                                                                                    Requirement.Has("Hammer"),
                                                                                    Requirement.And(
                                                                                            listOf(
                                                                                                    Requirement.Has("Hookshot"),
                                                                                                    Requirement.Or(
                                                                                                            listOf(
                                                                                                                    Requirement.Has("Flippers"),
                                                                                                                    Requirement.Has("canLiftRocks")
                                                                                                            )
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    ),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("canLiftRocks")
                                                            )
                                                    ),
                                                    Requirement.Has("canLiftDarkRocks")
                                            )
                                    )
                            )
                    ),
                    "East Death Mountain" to Requirement.And(
                            listOf(
                                    Requirement.Has("West Death Mountain"),
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hammer"),
                                                                    Requirement.Has("Magic Mirror")
                                                            )
                                                    ),
                                                    Requirement.Has("Hookshot")
                                            )
                                    )
                            )
                    ),
                    "West Death Mountain" to Requirement.Or(
                            listOf(
                                    Requirement.Has("canFly"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("canLiftRocks"),
                                                    Requirement.Has("Lamp")
                                            )
                                    )
                            )
                    ),
                    "Desert Palace" to Requirement.Or(
                            listOf(
                                    Requirement.Has("BookOfMudora"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("Magic Mirror"),
                                                    Requirement.Has("canLiftDarkRocks"),
                                                    Requirement.Has("canFly")
                                            )
                                    )
                            )
                    ),
                    "Eastern Palace" to Requirement.None,
                    "Ganon's Tower" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Crystal 1"),
                                    Requirement.Has("Crystal 2"),
                                    Requirement.Has("Crystal 3"),
                                    Requirement.Has("Crystal 4"),
                                    Requirement.Has("Crystal 5"),
                                    Requirement.Has("Crystal 6"),
                                    Requirement.Has("Crystal 7"),
                                    Requirement.Has("East Dark World Death Mountain")
                            )
                    ),
                    "Escape" to Requirement.None,
                    "Agahnim's Tower" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Cape"),
                                    Requirement.Has("hasUpgradedSword"),
                                    Requirement.And(
                                            listOf(
                                                    Requirement.Has("configSwordless"),
                                                    Requirement.Has("Hammer")
                                            )
                                    )
                            )
                    ),
                    "Ice Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Flippers"),
                                    Requirement.Has("canLiftDarkRocks"),
                                    Requirement.Has("canMeltThings")
                            )
                    ),
                    "Light World" to Requirement.None,
                    "Misery Mire" to Requirement.And(listOf(
                            Requirement.HasMultiple("Medallion", 1, 3),
                            Requirement.Has("Mire Dark World")
                    )),
                    "Dark Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North East Dark World")
                            )
                    ),
                    "Skull Woods" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North West Dark World")
                            )
                    ),
                    "Swamp Palace" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("Magic Mirror"),
                                    Requirement.Has("Flippers"),
                                    Requirement.Has("South Dark World")
                            )
                    ),
                    "Thieves Town" to Requirement.And(
                            listOf(
                                    Requirement.Has("Moon Pearl"),
                                    Requirement.Has("North West Dark World")
                            )
                    ),
                    "Tower of Hera" to Requirement.And(
                            listOf(
                                    Requirement.Or(
                                            listOf(
                                                    Requirement.Has("Magic Mirror"),
                                                    Requirement.And(
                                                            listOf(
                                                                    Requirement.Has("Hookshot"),
                                                                    Requirement.Has("Hammer")
                                                            )
                                                    )
                                            )
                                    ),
                                    Requirement.Has("West Death Mountain")
                            )
                    ),
                    "Turtle Rock" to Requirement.HasMultiple("Medallion", 1, 3),
                    "canLightTorches" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Fire Rod"),
                                    Requirement.Has("Lamp")
                            )
                    ),
                    "hasUpgradedSword" to Requirement.HasMultiple("Sword",
                            2,
                            2),
                    "canExtendMagic" to Requirement.None,
                    "canLiftDarkRocks" to Requirement.HasMultiple("Gloves",
                            2,
                            2),
                    "canLiftRocks" to Requirement.Has("Gloves"),
                    "configSwordless" to Requirement.None,
                    "configCanTakeDamage" to Requirement.None,
                    "canBlockLasers" to Requirement.HasMultiple("Shield",
                            3,
                            3),
                    "canFly" to Requirement.Has("Flute"),
                    "canShootArrows" to Requirement.Has("Bow"),
                    "hasSword" to Requirement.HasMultiple("Sword",
                            1,
                            1),
                    "canMeltThings" to Requirement.Or(
                            listOf(
                                    Requirement.Has("Bombos"),
                                    Requirement.Has("Fire Rod")
                            )
                    ),
                    "hasABottle" to Requirement.HasMultiple("Sword",
                            1,
                            1)
            ),
            locations = listOf(
                    Location(
                            name = "Hookshot Cave - Top Left",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Top Right",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Bottom Left",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Superbunny Cave - Top",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Superbunny Cave - Bottom",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Hookshot Cave - Bottom Right",
                            region = "East Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Has("Pegasus Boots")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Spike Cave",
                            region = "West Dark World Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Dark World Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("canExtendMagic"),
                                                                                            Requirement.Has("Magic Cape")
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("Cane of Byrna")
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Mire Shed - Right",
                            region = "Mire Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Mire Dark World"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Mire Shed - Left",
                            region = "Mire Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Mire Dark World"),
                                            Requirement.Has("Moon Pearl")
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Bow",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Left",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Catfish",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("canLiftRocks")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.Has("Agahnim 2 Defeated"))
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Sword",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("hasSword"),
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Pyramid Fairy - Right",
                            region = "North East Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North East Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Crystal 5"),
                                                            Requirement.Has("Crystal 6"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("South Dark World"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Agahnim Defeated")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Brewery",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blacksmith",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.Has("canLiftDarkRocks")
                                    )
                            )
                    ),
                    Location(
                            name = "Purple Chest",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.Has("canLiftDarkRocks")
                                    )
                            )
                    ),
                    Location(
                            name = "Bumper Cave",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Magic Cape")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "C-Shaped House",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hammer Pegs",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Chest Game",
                            region = "North West Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("North West Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Bottom",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - NPC",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Middle Left",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Digging Game",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Middle Right",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Stumpy",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Hype Cave - Top",
                            region = "South Dark World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("South Dark World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Middle",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Spiral Cave",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Upper - Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Far Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mimic Cave",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2),
                                                            Requirement.Has("Turtle Rock")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Paradox Cave Lower - Far Left",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Paradox Cave Upper - Right",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Floating Island",
                            region = "East Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("East Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("canLiftDarkRocks")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ether Tablet",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Book of Mudora"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Spectacle Rock",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.Has("Magic Mirror")
                                    )
                            )
                    ),
                    Location(
                            name = "Spectacle Rock Cave",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Old Man",
                            region = "West Death Mountain",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("West Death Mountain"),
                                            Requirement.Has("Lamp")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Torch",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Big Key Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Prize",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Book of Mudora"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                                            Requirement.Has("canFly")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Desert Palace Big Key"),
                                                            Requirement.Has("Desert Palace Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Big Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Map Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Desert Palace - Lanmolas",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Book of Mudora"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                                            Requirement.Has("canFly")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Desert Palace Big Key"),
                                                            Requirement.Has("Desert Palace Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Palace - Compass Chest",
                            region = "Desert Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Desert Palace"),
                                            Requirement.Has("Desert Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Map Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Armos Knights",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Eastern Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Big Key Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.Has("Lamp")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Cannonball Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Big Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.Has("Eastern Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Prize",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Eastern Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Eastern Palace - Compass Chest",
                            region = "Eastern Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Eastern Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Firesnake Room",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Map Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Pegasus Boots"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Bottom Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Bob's Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Mini Helmasaur Room - Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Top Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Bottom Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Top Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Top Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Tile Room",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.Has("Cane of Somaria")
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Bob's Torch",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Bottom Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Randomizer Room - Bottom Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Pre-Moldorm Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Top Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Top Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Room - Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Bottom Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Hope Room - Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Hope Room - Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Compass Room - Bottom Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - DMs Room - Top Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Big Key Room - Right",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hammer"),
                                                                                            Requirement.Has("Hookshot")
                                                                                    )
                                                                            ),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Fire Rod"),
                                                                                            Requirement.Has("Cane of Somaria")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Mini Helmasaur Room - Left",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ganon's Tower - Moldorm Chest",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hookshot"),
                                                            Requirement.Has("canShootArrows"),
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.Has("Ganon's Tower Big Key"),
                                                            Requirement.HasMultiple("Ganon's Tower Key",
                                                                    4,
                                                                    4)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim 2",
                            region = "Ganon's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ganon's Tower"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sewers - Dark Cross",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Escape Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Escape - Zelda's Cell",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.Has("Escape Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Right",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Escape Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Escape - Boomerang Chest",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.Has("Escape Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Middle",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Escape Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Sanctuary",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Escape - Map Chest",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sewers - Secret Room - Left",
                            region = "Escape",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Escape"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("Lamp"),
                                                                            Requirement.Has("Escape Key")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim",
                            region = "Agahnim's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Agahnim's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Agahnim's Tower Key",
                                                                    2,
                                                                    2),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Hammer"),
                                                                                                            Requirement.Has("Bug Catching Net")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim's Tower - Dark Maze",
                            region = "Agahnim's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Agahnim's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Agahnim's Tower Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Agahnim's Tower - Room 03",
                            region = "Agahnim's Tower",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Agahnim's Tower"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Agahnim's Tower Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Big Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.Has("Ice Palace Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Spike Room",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Prize",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Ice Palace Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Cane of Somaria"),
                                                                                            Requirement.Has("Ice Palace Key")
                                                                                    )
                                                                            ),
                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                    2,
                                                                                    2)
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Big Key Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Freezor Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.Has("canMeltThings")
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Kholdstare",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canMeltThings"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Ice Palace Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Cane of Somaria"),
                                                                                            Requirement.Has("Ice Palace Key")
                                                                                    )
                                                                            ),
                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                    2,
                                                                                    2)
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Map Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("configCanTakeDamage"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hookshot"),
                                                                            Requirement.Or(
                                                                                    listOf(
                                                                                            Requirement.And(
                                                                                                    listOf(
                                                                                                            Requirement.Has("Ice Palace Big Key"),
                                                                                                            Requirement.Has("Hookshot")
                                                                                                    )
                                                                                            ),
                                                                                            Requirement.HasMultiple("Ice Palace Key",
                                                                                                    1,
                                                                                                    1)
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Ice Palace - Compass Chest",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ice Palace - Iced T Room",
                            region = "Ice Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Ice Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Bombos Tablet",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Book of Mudora"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("South Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Link's Uncle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Ice Rod Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Master Sword Pedestal",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Pendant of Power"),
                                                            Requirement.Has("Pendant of Wisdom"),
                                                            Requirement.Has("Pendant of Courage")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "King Zora",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("canLiftRocks"),
                                                            Requirement.Has("Flippers")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Lake Hylia Island",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Flippers"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("South Dark World"),
                                                                            Requirement.Has("North East Dark World")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - NPC",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakariko Tavern",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Checkerboard Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canFly"),
                                                            Requirement.Has("canLiftDarkRocks"),
                                                            Requirement.Has("Magic Mirror")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Link's House",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Secret Passage",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "King's Tomb",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Pegasus Boots"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("canLiftDarkRocks"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("Moon Pearl"),
                                                                                            Requirement.Has("North West Dark World")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Hobo",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Cave 45",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("South Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Desert Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Desert Palace")
                                    )
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Far Left ",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Zora's Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Flute Spot",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Shovel")
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Top",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sick Kid",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("hasABottle")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Far Right ",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Floodgate Chest",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Aginah's Cave",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Bottle Merchant",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Library",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Middle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Bottom",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Potion Shop",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Mushroom")
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pendant of Courage")
                                    )
                            )
                    ),
                    Location(
                            name = "Blind's Hideout - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Far Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Magic Bat",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Powder"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Moon Pearl"),
                                                                                            Requirement.Has("Magic Mirror"),
                                                                                            Requirement.Has("canLiftDarkRocks")
                                                                                    )
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sahasrahla's Hut - Middle",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Mushroom",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Waterfall Fairy - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Maze Race",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Sunken Treasure",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Pegasus Rocks",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Pegasus Boots")
                                    )
                            )
                    ),
                    Location(
                            name = "Mini Moldorm Cave - Far Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Left",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Lumberjack Tree",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Agahnim Defeated"),
                                                            Requirement.Has("Pegasus Boots")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Kakriko Well - Top",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Chicken House",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Graveyard Ledge",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Magic Mirror"),
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Waterfall Fairy - Right",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.Has("Flippers")
                                    )
                            )
                    ),
                    Location(
                            name = "Lost Woods Hideout",
                            region = "Light World",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Light World"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Misery Mire - Spike Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("configCanTakeDamage"),
                                                            Requirement.Has("Cane of Byrna"),
                                                            Requirement.Has("Magic Cape")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Big Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Has("Misery Mire Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Bridge Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Misery Mire - Main Lobby",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Misery Mire Key"),
                                                            Requirement.Has("Misery Mire Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Prize",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Misery Mire Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("canShootArrows")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Compass Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.HasMultiple("Misery Mire Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Map Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Misery Mire Key"),
                                                            Requirement.Has("Misery Mire Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Vitreous",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Misery Mire Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("canShootArrows")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Misery Mire - Big Key Chest",
                            region = "Misery Mire",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Misery Mire"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.HasMultiple("Misery Mire Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Prize",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Stalfos Basement",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Palace of Darkness Key"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("canShootArrows"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Maze - Bottom",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Basement - Left",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Big Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Helmasaur King",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - The Arena - Bridge",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Or(
                                                    listOf(
                                                            Requirement.Has("Palace of Darkness Key"),
                                                            Requirement.And(
                                                                    listOf(
                                                                            Requirement.Has("canShootArrows"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Big Key Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Basement - Right",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - The Arena - Ledge",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Has("canShootArrows")
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Compass Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    3,
                                                    3)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Map Chest",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.Has("canShootArrows")
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Harmless Hellway",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                    5,
                                                    5)
                                    )
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Shooter Room",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Palace of Darkness - Dark Maze - Top",
                            region = "Dark Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Dark Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.HasMultiple("Palace of Darkness Key",
                                                                    5,
                                                                    5)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Big Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.Has("Skull Woods Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Compass Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Pot Prison",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Mothula",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("canExtendMagic"),
                                                                                                            Requirement.Has("Hammer")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Skull Woods Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Map Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Prize",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("configSwordless"),
                                                                                            Requirement.Or(
                                                                                                    listOf(
                                                                                                            Requirement.Has("canExtendMagic"),
                                                                                                            Requirement.Has("Hammer")
                                                                                                    )
                                                                                            )
                                                                                    )
                                                                            ),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            ),
                                                            Requirement.HasMultiple("Skull Woods Key",
                                                                    3,
                                                                    3)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Bridge Room",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("Fire Rod")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Skull Woods - Pinball Room",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Skull Woods - Big Key Chest",
                            region = "Skull Woods",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Skull Woods"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Map Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.Has("Swamp Palace Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Compass Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Big Key Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - West Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Big Chest",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Swamp Palace Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Flooded Room - Left",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Prize",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Entrance",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Flooded Room - Right",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Arrghus",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Swamp Palace - Waterfall Room",
                            region = "Swamp Palace",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Swamp Palace"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Swamp Palace Key"),
                                                            Requirement.Has("Hammer"),
                                                            Requirement.Has("Hookshot")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Ambush Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Attic",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Big Key Chest",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Blind",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World"),
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("Cane of Somaria"),
                                                                            Requirement.Has("Cane of Byrna")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Prize",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Moon Pearl"),
                                                            Requirement.Has("North West Dark World"),
                                                            Requirement.Has("Theives' Town Key"),
                                                            Requirement.Has("Theives' Town Big Key"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("Cane of Somaria"),
                                                                            Requirement.Has("Cane of Byrna")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Map Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Compass Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Big Chest ",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Thieves' Town - Blind's Cell",
                            region = "Thieves Town",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Thieves Town"),
                                            Requirement.Has("Theives' Town Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Compass Chest",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.Has("Tower of Hera Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Map Chest",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Prize",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hookshot"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            ),
                                                            Requirement.Has("Tower of Hera Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Big Key Chest",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("canLightTorches"),
                                                            Requirement.Has("Tower of Hera Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Basement Cage",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.None)
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Moldorm",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Mirror"),
                                                                            Requirement.And(
                                                                                    listOf(
                                                                                            Requirement.Has("Hookshot"),
                                                                                            Requirement.Has("Hammer")
                                                                                    )
                                                                            )
                                                                    )
                                                            ),
                                                            Requirement.Has("West Death Mountain"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("hasSword"),
                                                                            Requirement.Has("Hammer")
                                                                    )
                                                            ),
                                                            Requirement.Has("Tower of Hera Big Key")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Tower of Hera - Big Chest",
                            region = "Tower of Hera",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Tower of Hera"),
                                            Requirement.Has("Tower of Hera Big Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Compass Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.Has("Cane of Somaria")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Prize",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    4,
                                                                    4),
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Ice Rod"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Chain Chomps",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.Has("Turtle Rock Key")
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Bottom Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Roller Room - Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Trinexx",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Medallion"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    4,
                                                                    4),
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Ice Rod"),
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Hammer"),
                                                                            Requirement.Has("hasUpgradedSword"),
                                                                            Requirement.Has("hasSword")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Big Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Cane of Somaria"),
                                                                            Requirement.Has("Hookshot")
                                                                    )
                                                            ),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Top Right",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Crystaroller Room",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    2,
                                                                    2)
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Roller Room - Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Fire Rod"),
                                                            Requirement.Has("Cane of Somaria")
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Big Key Chest",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.HasMultiple("Turtle Rock Key",
                                                    2,
                                                    2)
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Bottom Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key", 3, 3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    ),
                    Location(
                            name = "Turtle Rock - Eye Bridge - Top Left",
                            region = "Turtle Rock",
                            requires = Requirement.And(
                                    listOf(
                                            Requirement.Has("Turtle Rock"),
                                            Requirement.And(
                                                    listOf(
                                                            Requirement.Has("Lamp"),
                                                            Requirement.Has("Cane of Somaria"),
                                                            Requirement.Has("Turtle Rock Big Key"),
                                                            Requirement.HasMultiple("Turtle Rock Key",
                                                                    3,
                                                                    3),
                                                            Requirement.Or(
                                                                    listOf(
                                                                            Requirement.Has("Magic Cape"),
                                                                            Requirement.Has("Cane of Byrna"),
                                                                            Requirement.Has("canBlockLasers")
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    )
            ),
            items = mapOf(
                    "Eastern Palace Big Key" to Item(
                            name = "Eastern Palace Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Eastern Palace"),
                            imageText = "EP"
                    ),
                    "Eastern Palace Key" to Item(
                            name = "Eastern Palace Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Eastern Palace"),
                            imageText = "EP"
                    ),
                    "Eastern Palace Compass" to Item(
                            name = "Eastern Palace Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Eastern Palace"),
                            imageText = "EP"
                    ),
                    "Eastern Palace Complete" to Item(
                            name = "Eastern Palace Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Eastern Palace"),
                            imageText = "EP"
                    ),
                    "Eastern Palace Map" to Item(
                            name = "Eastern Palace Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Eastern Palace"),
                            imageText = "EP"
                    ),

                    "Desert Palace Big Key" to Item(
                            name = "Desert Palace Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Desert Palace"),
                            imageText = "DP"
                    ),
                    "Desert Palace Key" to Item(
                            name = "Desert Palace Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Desert Palace"),
                            imageText = "DP"
                    ),
                    "Desert Palace Compass" to Item(
                            name = "Desert Palace Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Desert Palace"),
                            imageText = "DP"
                    ),
                    "Desert Palace Map" to Item(
                            name = "Desert Palace Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Desert Palace"),
                            imageText = "DP"
                    ),
                    "Desert Palace Complete" to Item(
                            name = "Desert Palace Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Desert Palace"),
                            imageText = "DP"
                    ),

                    "Tower of Hera Big Key" to Item(
                            name = "Tower of Hera Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Tower of Hera"),
                            imageText = "TH"
                    ),
                    "Tower of Hera Key" to Item(
                            name = "Tower of Hera Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Tower of Hera"),
                            imageText = "TH"
                    ),
                    "Tower of Hera Compass" to Item(
                            name = "Tower of Hera Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Tower of Hera"),
                            imageText = "TH"
                    ),
                    "Tower of Hera Complete" to Item(
                            name = "Tower of Hera Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Tower of Hera"),
                            imageText = "TH"
                    ),
                    "Tower of Hera Map" to Item(
                            name = "Tower of Hera Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Tower of Hera"),
                            imageText = "TH"
                    ),

                    "Escape Big Key" to Item(
                            name = "Escape Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Escape"),
                            imageText = "HC"
                    ),
                    "Escape Key" to Item(
                            name = "Escape Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Escape"),
                            imageText = "HC"
                    ),
                    "Escape Map" to Item(
                            name = "Escape Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Escape"),
                            imageText = "HC"
                    ),
                    "Escape Compass" to Item(
                            name = "Escape Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Escape"),
                            imageText = "HC"
                    ),
                    "Escape Complete" to Item(
                            name = "Escape Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Escape"),
                            imageText = "HC"
                    ),

                    "Agahnim Defeated" to Item(
                            name = "Agahnim Defeated",
                            images = listOf("Agahnim Defeated.png"),
                            categories = listOf("Dungeon", "Prize", "Agahnim's Tower")
                    ),
                    "Agahnim's Tower Big Key" to Item(
                            name = "Agahnim's Tower Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Agahnim's Tower"),
                            imageText = "AT"
                    ),
                    "Agahnim's Tower Map" to Item(
                            name = "Agahnim's Tower Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Agahnim's Tower"),
                            imageText = "AT"
                    ),
                    "Agahnim's Tower Compass" to Item(
                            name = "Agahnim's Tower Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Agahnim's Tower"),
                            imageText = "AT"
                    ),
                    "Agahnim's Tower Key" to Item(
                            name = "Agahnim's Tower Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Agahnim's Tower"),
                            imageText = "AT"
                    ),

                    "Palace of Darkness Complete" to Item(
                            name = "Palace of Darkness Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Palace of Darkness"),
                            imageText = "PD"
                    ),
                    "Palace of Darkness Big Key" to Item(
                            name = "Palace of Darkness Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Palace of Darkness"),
                            imageText = "PD"
                    ),
                    "Palace of Darkness Key" to Item(
                            name = "Palace of Darkness Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Palace of Darkness"),
                            imageText = "PD",
                            count = 6
                    ),
                    "Palace of Darkness Map" to Item(
                            name = "Palace of Darkness Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Palace of Darkness"),
                            imageText = "PD"
                    ),
                    "Palace of Darkness Compass" to Item(
                            name = "Palace of Darkness Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Palace of Darkness"),
                            imageText = "PD"
                    ),

                    "Swamp Palace Complete" to Item(
                            name = "Swamp Palace Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Swamp Palace"),
                            imageText = "SP"
                    ),
                    "Swamp Palace Big Key" to Item(
                            name = "Swamp Palace Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Swamp Palace"),
                            imageText = "SP"
                    ),
                    "Swamp Palace Key" to Item(
                            name = "Swamp Palace Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Swamp Palace"),
                            imageText = "SP"
                    ),
                    "Swamp Palace Map" to Item(
                            name = "Swamp Palace Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Swamp Palace"),
                            imageText = "SP"
                    ),
                    "Swamp Palace Compass" to Item(
                            name = "Swamp Palace Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Swamp Palace"),
                            imageText = "SP"
                    ),

                    "Skull Woods Complete" to Item(
                            name = "Skull Woods Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Skull Woods"),
                            imageText = "SW"
                    ),
                    "Skull Woods Big Key" to Item(
                            name = "Skull Woods Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Skull Woods"),
                            imageText = "SW"
                    ),
                    "Skull Woods Key" to Item(
                            name = "Skull Woods Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Skull Woods"),
                            imageText = "SW",
                            count = 3
                    ),
                    "Skull Woods Map" to Item(
                            name = "Skull Woods Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Skull Woods"),
                            imageText = "SW"
                    ),
                    "Skull Woods Compass" to Item(
                            name = "Skull Woods Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Skull Woods"),
                            imageText = "SW"
                    ),

                    "Theives' Town Complete" to Item(
                            name = "Theives' Town Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Theives' Town"),
                            imageText = "TT"
                    ),
                    "Theives' Town Big Key" to Item(
                            name = "Theives' Town Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Theives' Town"),
                            imageText = "TT"
                    ),
                    "Theives' Town Key" to Item(
                            name = "Theives' Town Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Theives' Town"),
                            imageText = "TT"
                    ),
                    "Theives' Town Map" to Item(
                            name = "Theives' Town Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Theives' Town"),
                            imageText = "TT"
                    ),
                    "Theives' Town Compass" to Item(
                            name = "Theives' Town Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Theives' Town"),
                            imageText = "TT"
                    ),

                    "Ice Palace Complete" to Item(
                            name = "Ice Palace Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Ice Palace"),
                            imageText = "IP"
                    ),
                    "Ice Palace Big Key" to Item(
                            name = "Ice Palace Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Ice Palace"),
                            imageText = "IP"
                    ),
                    "Ice Palace Key" to Item(
                            name = "Ice Palace Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Ice Palace"),
                            imageText = "IP",
                            count = 2
                    ),
                    "Ice Palace Map" to Item(
                            name = "Ice Palace Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Ice Palace"),
                            imageText = "IP"
                    ),
                    "Ice Palace Compass" to Item(
                            name = "Ice Palace Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Ice Palace"),
                            imageText = "IP"
                    ),

                    "Misery Mire Complete" to Item(
                            name = "Misery Mire Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Misery Mire"),
                            imageText = "MM"
                    ),
                    "Misery Mire Big Key" to Item(
                            name = "Misery Mire Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Misery Mire"),
                            imageText = "MM"
                    ),
                    "Misery Mire Key" to Item(
                            name = "Misery Mire Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Misery Mire"),
                            imageText = "MM",
                            count = 3
                    ),
                    "Misery Mire Map" to Item(
                            name = "Misery Mire Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Misery Mire"),
                            imageText = "MM"
                    ),
                    "Misery Mire Compass" to Item(
                            name = "Misery Mire Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Misery Mire"),
                            imageText = "MM"
                    ),

                    "Turtle Rock Complete" to Item(
                            name = "Turtle Rock Complete",
                            images = listOf("Complete.png"),
                            categories = listOf("Dungeon", "Turtle Rock"),
                            imageText = "TR"
                    ),
                    "Turtle Rock Big Key" to Item(
                            name = "Turtle Rock Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Turtle Rock"),
                            imageText = "TR"
                    ),
                    "Turtle Rock Key" to Item(
                            name = "Turtle Rock Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Turtle Rock"),
                            imageText = "TR",
                            count = 4
                    ),
                    "Turtle Rock Map" to Item(
                            name = "Turtle Rock Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Turtle Rock"),
                            imageText = "TR"
                    ),
                    "Turtle Rock Compass" to Item(
                            name = "Turtle Rock Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Turtle Rock"),
                            imageText = "TR"
                    ),

                    "Ganon's Tower Map" to Item(
                            name = "Ganon's Tower Map",
                            images = listOf("Map.png"),
                            categories = listOf("Dungeon", "Ganon's Tower"),
                            count = 4,
                            imageText = "GT"
                    ),
                    "Ganon's Tower Big Key" to Item(
                            name = "Ganon's Tower Big Key",
                            images = listOf("Big Key.png"),
                            categories = listOf("Dungeon", "Ganon's Tower"),
                            imageText = "GT"
                    ),
                    "Agahnim 2 Defeated" to Item(
                            name = "Agahnim 2 Defeated",
                            images = listOf("Agahnim 2 Defeated.png"),
                            categories = listOf("Dungeon", "Ganon's Tower", "Prize")
                    ),
                    "Ganon's Tower Compass" to Item(
                            name = "Ganon's Tower Compass",
                            images = listOf("Compass.png"),
                            categories = listOf("Dungeon", "Ganon's Tower"),
                            imageText = "GT"
                    ),
                    "Ganon's Tower Key" to Item(
                            name = "Ganon's Tower Key",
                            images = listOf("Key.png"),
                            categories = listOf("Dungeon", "Ganon's Tower"),
                            imageText = "GT",
                            count = 4
                    ),

                    "Pendant of Wisdom" to Item(
                            name = "Pendant of Wisdom",
                            images = listOf("Pendant of Wisdom.png"),
                            categories = listOf("Prize")
                    ),
                    "Pendant of Courage" to Item(
                            name = "Pendant of Courage",
                            images = listOf("Pendant of Courage.png"),
                            categories = listOf("Prize")
                    ),
                    "Pendant of Power" to Item(
                            name = "Pendant of Power",
                            images = listOf("Pendant of Power.png"),
                            categories = listOf("Prize")
                    ),

                    "Crystal 1" to Item(
                            name = "Crystal 1",
                            images = listOf("Crystal 1.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 2" to Item(
                            name = "Crystal 2",
                            images = listOf("Crystal 2.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 3" to Item(
                            name = "Crystal 3",
                            images = listOf("Crystal 3.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 4" to Item(
                            name = "Crystal 4",
                            images = listOf("Crystal 4.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 5" to Item(
                            name = "Crystal 5",
                            images = listOf("Crystal 5.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 6" to Item(
                            name = "Crystal 6",
                            images = listOf("Crystal 6.png"),
                            categories = listOf("Prize")
                    ),
                    "Crystal 7" to Item(
                            name = "Crystal 7",
                            images = listOf("Crystal 7.png"),
                            categories = listOf("Prize")
                    ),

                    "Mail" to Item(
                            name = "Mail",
                            images = listOf("Mail2.png", "Mail3.png"),
                            categories = listOf(),
                            count = 2
                    ),
                    "Shield" to Item(
                            name = "Shield",
                            images = listOf("Shield1.png", "Shield2.png", "Shield3.png"),
                            categories = listOf(),
                            count = 3
                    ),
                    "Sword" to Item(
                            name = "Sword",
                            images = listOf("Sword1.png", "Sword2.png", "Sword3.png", "Sword4.png"),
                            categories = listOf(),
                            count = 4
                    ),

                    "Half Magic" to Item(
                            name = "Half Magic",
                            images = listOf("Half Magic.png"),
                            categories = listOf()
                    ),
                    "Quarter Magic" to Item(
                            name = "Quarter Magic",
                            images = listOf("Quarter Magic.png"),
                            categories = listOf()
                    ),

                    "Heart Piece" to Item(
                            name = "Heart Piece",
                            images = listOf("Heart Piece.png"),
                            categories = listOf()
                    ),
                    "Heart Container" to Item(
                            name = "Heart Container",
                            images = listOf("Heart Container.png"),
                            categories = listOf()
                    ),

                    "Pegasus Boots" to Item(
                            name = "Pegasus Boots",
                            images = listOf("Pegasus Boots.png"),
                            categories = listOf()
                    ),
                    "Flippers" to Item(
                            name = "Flippers",
                            images = listOf("Flippers.png"),
                            categories = listOf()
                    ),
                    "Gloves" to Item(
                            name = "Gloves",
                            images = listOf("Gloves1.png", "Gloves2.png"),
                            categories = listOf(),
                            count = 2
                    ),
                    "Moon Pearl" to Item(
                            name = "Moon Pearl",
                            images = listOf("Moon Pearl.png"),
                            categories = listOf()
                    ),

                    "Cane of Byrna" to Item(
                            name = "Cane of Byrna",
                            images = listOf("Cane of Byrna.png"),
                            categories = listOf()
                    ),
                    "Cane of Somaria" to Item(
                            name = "Cane of Somaria",
                            images = listOf("Cane of Somaria.png"),
                            categories = listOf()
                    ),

                    "Fire Rod" to Item(
                            name = "Fire Rod",
                            images = listOf("Fire Rod.png"),
                            categories = listOf()
                    ),
                    "Ice Rod" to Item(
                            name = "Ice Rod",
                            images = listOf("Ice Rod.png"),
                            categories = listOf()
                    ),

                    "Quake" to Item(
                            name = "Quake",
                            images = listOf("Quake.png"),
                            categories = listOf(
                                    "Medallion"
                            )
                    ),
                    "Bombos" to Item(
                            name = "Bombos",
                            images = listOf("Bombos.png"),
                            categories = listOf("Medallion")
                    ),
                    "Ether" to Item(
                            name = "Ether",
                            images = listOf("Ether.png"),
                            categories = listOf("Medallion")
                    ),

                    "Shovel" to Item(
                            name = "Shovel",
                            images = listOf("Shovel.png"),
                            categories = listOf()
                    ),
                    "Flute" to Item(
                            name = "Flute",
                            images = listOf("Flute.png"),
                            categories = listOf()
                    ),

                    "Bottle" to Item(
                            name = "Bottle",
                            images = listOf("Bottle.png"),
                            categories = listOf()
                    ),
                    "Bug Catching Net" to Item(
                            name = "Bug Catching Net",
                            images = listOf("Bug Catching Net.png"),
                            categories = listOf()
                    ),

                    "Mushroom" to Item(
                            name = "Mushroom",
                            images = listOf("Mushroom.png"),
                            categories = listOf()
                    ),
                    "Magic Powder" to Item(
                            name = "Magic Powder",
                            images = listOf("Magic Powder.png"),
                            categories = listOf()
                    ),

                    "Hookshot" to Item(
                            name = "Hookshot",
                            images = listOf("Hookshot.png"),
                            categories = listOf()
                    ),
                    "Boomerang" to Item(
                            name = "Boomerang",
                            images = listOf("Boomerang.png"),
                            categories = listOf()
                    ),
                    "Magic Boomerang" to Item(
                            name = "Magic Boomerang",
                            images = listOf("Magic Boomerang.png"),
                            categories = listOf()
                    ),

                    "Bow" to Item(
                            name = "Bow",
                            images = listOf("Bow.png"),
                            categories = listOf()
                    ),
                    "Silver Arrows" to Item(
                            name = "Silver Arrows",
                            images = listOf("Silver Arrows.png"),
                            categories = listOf()
                    ),

                    "Book of Mudora" to Item(
                            name = "Book of Mudora",
                            images = listOf("Book of Mudora.png"),
                            categories = listOf()
                    ),
                    "Magic Mirror" to Item(
                            name = "Magic Mirror",
                            images = listOf("Magic Mirror.png"),
                            categories = listOf()
                    ),
                    "Bombs" to Item(
                            name = "Bombs",
                            images = listOf("Bombs.png"),
                            categories = listOf()
                    ),
                    "Hammer" to Item(
                            name = "Hammer",
                            images = listOf("Hammer.png"),
                            categories = listOf()
                    ),
                    "Lamp" to Item(
                            name = "Lamp",
                            images = listOf("Lamp.png"),
                            categories = listOf()
                    ),
                    "Magic Cape" to Item(
                            name = "Magic Cape",
                            images = listOf("Magic Cape.png"),
                            categories = listOf()
                    )
            ),
            alternativeAliases = mapOf(
                    "Turtle Rock" to listOf(
                            Requirement.Has("Bombos"),
                            Requirement.Has("Ether"),
                            Requirement.Has("Quake")
                    ),
                    "Misery Mire" to listOf(
                            Requirement.Has("Bombos"),
                            Requirement.Has("Ether"),
                            Requirement.Has("Quake")
                    )
            ),
            organizeBy = listOf(
                    Category(name = "Escape", image = "Escape.png"),
                    Category(name = "Eastern Palace", image = "Eastern Palace.png"),
                    Category(name = "Desert Palace", image = "Desert Palace.png"),
                    Category(name = "Tower of Hera", image = "Tower of Hera.png"),
                    Category(name = "Agahnim's Tower", image = "Agahnim's Tower.png"),
                    Category(name = "Palace of Darkness", image = "Palace of Darkness.png"),
                    Category(name = "Swamp Palace", image = "Swamp Palace.png"),
                    Category(name = "Skull Woods", image = "Skull Woods.png"),
                    Category(name = "Theives' Town", image = "Theives' Town.png"),
                    Category(name = "Ice Palace", image = "Ice Palace.png"),
                    Category(name = "Misery Mire", image = "Misery Mire.png"),
                    Category(name = "Turtle Rock", image = "Turtle Rock.png"),
                    Category(name = "Ganon's Tower", image = "Ganon's Tower.png")
            )
    )


}