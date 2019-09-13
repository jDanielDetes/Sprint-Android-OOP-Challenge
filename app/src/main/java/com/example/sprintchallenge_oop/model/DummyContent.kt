package com.example.sprintchallenge_oop.model

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<hierarchy> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, hierarchy> = HashMap()
init {
    ITEMS.add(civilizations.Civilization("Defensive","logistica"))
    ITEMS.add(structures.Structure(35,1000))
    ITEMS.add(technologies.Technology(45,"Age of Kings"))
    ITEMS.add(units.Unit(5,27))

    ITEM_MAP[ITEMS[0].name] = ITEMS[0]

    ITEM_MAP[ITEMS[1].name] = ITEMS[1]

    ITEM_MAP[ITEMS[2].name] = ITEMS[2]

    ITEM_MAP[ITEMS[3].name] = ITEMS[3]

    ITEM_MAP[ITEMS[4].name] = ITEMS[4]

    ITEM_MAP[ITEMS[5].name] = ITEMS[5]
}

}
