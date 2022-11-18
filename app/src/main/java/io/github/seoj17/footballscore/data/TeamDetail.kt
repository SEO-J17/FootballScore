package io.github.seoj17.footballscore.data

data class TeamDetail(
    val address: String,
    val area: Area,
    val crest: String,
    val id: Int,
    val name: String,
    val shortName: String,
    val squad: List<Squad>,
    val venue: String,
    val website: String
)