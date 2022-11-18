package io.github.seoj17.footballscore.data

data class Squad(
    val dateOfBirth: String,
    val id: Int,
    val name: String,
    val nationality: String,
    val position: String
) {
    companion object {
        operator fun invoke(detailTeam: Squad): Squad {
            return with(detailTeam) {
                Squad(
                    dateOfBirth,
                    id,
                    name,
                    nationality,
                    position
                )
            }
        }
    }
}