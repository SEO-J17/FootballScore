package io.github.seoj17.footballscore.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FootballListAdapter(
    private val dataSet: List<String> = listOf(),
) : RecyclerView.Adapter<MatchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MatchViewHolder(parent)

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        with(holder){
            bind(dataSet[position])
        }
    }

    override fun getItemCount(): Int = dataSet.size
}