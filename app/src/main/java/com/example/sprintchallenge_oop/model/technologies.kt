package com.example.sprintchallenge_oop.model

data class technologies(
    val technologies: List<Technology>
)

data class Technology(
    val age: String,
    val applies_to: List<String>,
    val build_time: Int,
    val description: String,
    val develops_in: String,
    val expansion: String,
    val id: Int,
    val name: String
)

