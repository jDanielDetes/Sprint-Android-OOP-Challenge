package com.example.sprintchallenge_oop.model

class civilizations {


    data class Civilization(
        val army_type: String = "defensive",
        val unique_tech: String = "logistica"

    ) : hierarchy("Bizantines", "Dark age", true) {
        override fun description(): String {
            return "this $name is definitely one of my favorites which is $isFavorite the special skill they have called $unique_tech  "
        }
    }
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


 */