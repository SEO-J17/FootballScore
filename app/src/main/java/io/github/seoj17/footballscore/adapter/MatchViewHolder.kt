package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.data.Matches
import io.github.seoj17.footballscore.databinding.ViewHolderMatchBinding
import io.github.seoj17.footballscore.extensions.imageLoad
import io.github.seoj17.footballscore.utils.StatusSet

class MatchViewHolder(
    private val binding: ViewHolderMatchBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(matches: Matches) {
        with(binding) {
            homeTeam.imageLoad(matches.homeTeam.crest)
            homeName.text = matches.homeTeam.shortName
            homeScore.text = matches.score.fullTime.home?.toString() ?: StatusSet.DEFAULT_SCORE

            gameStatus.text = StatusSet.getStatus(matches.status)
            leagueName.text = matches.competition.code

            awayTeam.imageLoad(matches.awayTeam.crest)
            awayName.text = matches.awayTeam.shortName
            awayScore.text = matches.score.fullTime.away?.toString() ?: StatusSet.DEFAULT_SCORE

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