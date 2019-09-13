package com.example.sprintchallenge_oop.model

data class units(
    val units: List<Unit>
)

data class Unit(
    val accuracy: String,
    val age: String,
    val armor: String,
    val armor_bonus: List<String>,
    val attack: Int,
    val attack_bonus: List<String>,
    val attack_delay: Int,
    val blast_radius: Int,
    val build_time: Int,
    val created_in: String,
    val description: String,
    val expansion: String,
    val hit_points: Int,
    val id: Int,
    val line_of_sight: Int,
    val movement_rate: Int,
    val name: String,
    val range: String,
    val reload_time: Int,
    val search_radius: Int
)

