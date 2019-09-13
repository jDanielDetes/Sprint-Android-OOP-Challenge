package com.example.sprintchallenge_oop.model

open class civilizations(
    val civilizations: List<Civilization>
)

open class Civilization(
    val army_type: String,
    val civilization_bonus: List<String>,
    val expansion: String,
    val id: Int,
    val name: String,
    val team_bonus: String,
    val unique_tech: String,
    val unique_unit: String
)