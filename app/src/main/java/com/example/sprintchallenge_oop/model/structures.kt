package com.example.sprintchallenge_oop.model

data class structures(
    val structures: List<Structure>
)

data class Structure(

    val armor: String,
    val attack: Int,
    val build_time: Int,
    val description: String,
    val expansion: String,
    val hit_points: Int = 1000,
    val id: Int,
    val line_of_sight: Int,

    val range: String,
    val reload_time: Int,
    val special: List<String>
) : hierarchy ("Mining Camp","Dark age",true) {
    override fun description(): String {
        return "the $name is  available to make during the $age age and this one although people think this is my favorite thats actually $isFavorite because" +
                "the HP is $hit_points"
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