package com.example.sprintchallenge_oop.model

 class units {


    data class Unit(

        val attack: Int = 5,
        val build_time: Int = 27

    ) : hierarchy("Crossbowman", "Castle age", true) {
        override fun description(): String {
            return "my favorite unit on the battlefield is definitely $name he is also in the $age age and has a max attack of $attack and you can guess its $isFavorite he is my fav"
        }
    }
}
/*



"id": 2,
"name": "Crossbowman",
"description": "Upgraded archer",
"expansion": "Age of Kings",
"age": "Castle",
"created_in": "https://age-of-empires-2-api.herokuapp.com/api/v1/structure/archery_range",
"cost": {
"Wood": 25,
"Gold": 45
},
"build_time": 27,
"reload_time": 2,
"attack_delay": 0.35,
"movement_rate": 0.96,
"line_of_sight": 7,
"hit_points": 35,
"range": 5,
"attack": 5,
"armor": "0/0",
"attack_bonus": [
"+3 spearmen"


 */