package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.data.Squad
import io.github.seoj17.footballscore.databinding.TeamSquadItemBinding

class SquadViewHolder(
    private val binding: TeamSquadItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(squad: Squad) {

    }

    companion object {
        operator fun invoke(parent: ViewGroup): SquadViewHolder {
            return SquadViewHolder(
                TeamSquadItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }
}