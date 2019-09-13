package com.example.sprintchallenge_oop.model

data class structures(
    val structures: List<Structure>
)

data class Structure(
    val age: String,
    val armor: String,
    val attack: Int,
    val build_time: Int,
    val description: String,
    val expansion: String,
    val hit_points: Int,
    val id: Int,
    val line_of_sight: Int,
    val name: String,
    val range: String,
    val reload_time: Int,
    val special: List<String>
)

