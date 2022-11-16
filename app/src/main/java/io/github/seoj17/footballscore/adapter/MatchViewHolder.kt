package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.seoj17.footballscore.data.Matches
import io.github.seoj17.footballscore.databinding.ViewHolderMatchBinding
import io.github.seoj17.footballscore.utils.StatusSet

class MatchViewHolder(
    private val binding: ViewHolderMatchBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(matches: Matches) {
        with(binding) {
            Glide.with(root.context).load(matches.homeTeam.crest).into(homeTeam)
            homeName.text = matches.homeTeam.shortName
            homeScore.text = matches.score.fullTime.home?.toString() ?: StatusSet.DEFAULT_SCORE

            gameStatus.text = StatusSet.getStatus(matches.status)
            leagueName.text = matches.competition.code

            Glide.with(root.context).load(matches.awayTeam.crest).into(awayTeam)
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