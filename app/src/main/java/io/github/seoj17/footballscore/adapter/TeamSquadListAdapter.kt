package io.github.seoj17.footballscore.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.data.Squad

class TeamSquadListAdapter(
    private val teamSquad: List<Squad> = mutableListOf()
) : RecyclerView.Adapter<SquadViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SquadViewHolder(parent)

    override fun onBindViewHolder(holder: SquadViewHolder, position: Int) {
        with(holder) {
            bind(teamSquad[position])
        }
    }

    override fun getItemCount(): Int = teamSquad.size
}