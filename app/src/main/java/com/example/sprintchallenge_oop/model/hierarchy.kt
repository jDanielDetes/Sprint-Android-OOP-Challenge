package com.example.sprintchallenge_oop.model

open class hierarchy(val  name: String, val age: Int, val isFavorite: Boolean) {

open fun description():String {
    return "this lovely thing is called $name"
}

class civilizations(name: String,age: Int,isFavorite: Boolean, val uniqueTech:String):hierarchy(name,age,isFavorite){
    override fun description(): String {
        return "this $name is definitely one of my favorites which is $isFavorite the special skill they have called $uniqueTech  "
    }
}


    class structures(name: String,age: Int,isFavorite: Boolean, val hitPoints:Int):hierarchy(name,age,isFavorite){
        override fun description(): String {
            return "the $name is  available to make during the $age age and this one although people think this is my favorite thats actually $isFavorite because" +
                    "the HP is $hitPoints"
        }
    }

    class technologies(name: String,age: Int,isFavorite: Boolean):hierarchy(name,age,isFavorite) {
        override fun description(): String {
         return "i love tech especially this one called $name"
        }

    }


    class units(name: String,age: Int,isFavorite: Boolean):hierarchy(name,age,isFavorite)

}

/*
"id": 3,
"name": "Bizantines",
"expansion": "Age of Kings",
"army_type": "Defensive",
"unique_unit": [
"https://age-of-empires-2-api.herokuapp.com/api/v1/unit/cataphract"
],
"unique_tech": [
"https://age-of-empires-2-api.herokuapp.com/api/v1/technology/logistica"
],
"team_bonus": "Monks +50% heal speed",
"civilization_bonus": [
"Buildings (except gates) have +10% HP in Dark Age / +20% HP in Feudal Age  / +30% in Castle Age / +40% in Imperial Age",
"Spearman skirmisher and camel lines cost 25% less",
"Fire Ships attack 20% faster",
"Imperial Age costs -33%",
"Town Watch is free"

"id": 8,
"name": "Mining Camp",
"expansion": "Age of Kings",
"age": "Dark",
"cost": {},
"build_time": 35,
"hit_points": 1000,
"line_of_sight": 5,
"armor": "0/7"


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