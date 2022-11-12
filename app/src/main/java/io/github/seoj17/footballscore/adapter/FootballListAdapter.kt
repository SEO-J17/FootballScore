package io.github.seoj17.footballscore.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FootballListAdapter(
    private val dataSet: List<String> = listOf(),
) : RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(parent)

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        with(holder){
            bind(dataSet[position])
        }
    }

    override fun getItemCount(): Int = dataSet.size
}