package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.seoj17.footballscore.data.Matches
import io.github.seoj17.footballscore.databinding.ViewHolderMatchBinding

class MatchViewHolder(
    private val binding: ViewHolderMatchBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(matches: Matches) {
        with(binding) {
            Glide.with(root).load(matches.homeTeam.crest).into(homeTeam)
            homeName.text = matches.homeTeam.shortName
            homeScore.text = matches.score.fullTime.home?.toString() ?: DEFAULT_SCORE

            gameStatus.text = matches.status.setStatus()
            leagueName.text = matches.competition.code

            Glide.with(root).load(matches.awayTeam.crest).into(awayTeam)
            awayName.text = matches.awayTeam.shortName
            awayScore.text = matches.score.fullTime.away?.toString() ?: DEFAULT_SCORE

        }
    }

    private fun String.setStatus(): String {
        return if (this == GAME_STATE) {
            GAME_PROGRESS
        } else {
            GAME_FINISH
        }
    }

    companion object {
        private const val GAME_STATE = "TIMED"
        private const val GAME_PROGRESS = "진행중"
        private const val GAME_FINISH = "종료"
        private const val DEFAULT_SCORE = "-"

        operator fun invoke(parent: ViewGroup): MatchViewHolder {
            return MatchViewHolder(
                ViewHolderMatchBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }
}