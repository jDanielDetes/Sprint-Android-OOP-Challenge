package com.example.sprintchallenge_oop.model

class structures {


    data class Structure(

        val build_time: Int = 35,

        val hit_points: Int = 1000,
        val isFavorite2: Boolean = true


    ) : hierarchy("Mining Camp", "Dark age", true) {
        override fun description(): String {
            return "the $name is  available to make during the $age age and this one although people think this is my favorite thats actually $isFavorite because" +
                    "the HP is $hit_points"
        }
    }
}
/*


"id": 8,
"name": "Mining Camp",
"expansion": "Age of Kings",
"age": "Dark",
"cost": {},
"build_time": 35,
"hit_points": 1000,
"line_of_sight": 5,
"armor": "0/7"




 */