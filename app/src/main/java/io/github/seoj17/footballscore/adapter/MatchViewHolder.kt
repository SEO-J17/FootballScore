package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.data.Matches
import io.github.seoj17.footballscore.databinding.ViewHolderMatchBinding
import io.github.seoj17.footballscore.extensions.imageLoad

class MatchViewHolder(
    private val binding: ViewHolderMatchBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(matches: Matches) {
        with(binding) {
            homeTeam.imageLoad(matches.homeTeam.crest)
            homeName.text = matches.homeTeam.shortName
            homeScore.text = "${matches.score.fullTime.getHomeScore()}"

            gameStatus.text = matches.getState()
            leagueName.text = matches.competition.code

            awayTeam.imageLoad(matches.awayTeam.crest)
            awayName.text = matches.awayTeam.shortName
            awayScore.text = "${matches.score.fullTime.getAwayScore()}"

        }
    }

    companion object {
        operator fun invoke(parent: ViewGroup): MatchViewHolder {
            return MatchViewHolder(
                ViewHolderMatchBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }
}