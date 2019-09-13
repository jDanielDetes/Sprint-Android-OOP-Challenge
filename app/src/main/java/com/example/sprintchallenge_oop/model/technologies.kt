package com.example.sprintchallenge_oop.model

data class technologies(
    val technologies: List<Technology>
)

data class Technology(

    val applies_to: List<String>,
    val build_time: Int,
    val description: String,
    val develops_in: String,
    val expansion: String,
    val id: Int

): hierarchy ("Thumb Ring","Castle age",true) {
    override fun description(): String {
        return "i love tech especially this one called $name its only in the expansion $expansion and during the $age age and yes thats $isFavorite this is my favorite"
    }
}

/*


"id": 2,
"name": "Thumb Ring",
"description": "Faster reload time (10-20%) and 100% accuracy",
"expansion": "Age of Kings",
"age": "Castle",
"develops_in": "https://age-of-empires-2-api.herokuapp.com/api/v1/structure/archery_range",
"cost": {
"Food": 300,
"Wood": 250
},
"build_time": 45,
"applies_to": [
"https://age-of-empires-2-api.herokuapp.com/api/v1/unit/archer",
"https://age-of-empires-2-api.herokuapp.com/api/v1/unit/cavalry_archer"
]




 */