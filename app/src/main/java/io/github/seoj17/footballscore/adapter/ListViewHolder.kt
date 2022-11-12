package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.databinding.MatchListItemBinding

//TODO:리스트 뷰 홀더 구현하기
class ListViewHolder(
    private val binding: MatchListItemBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(dataSet: String) {
        //TODO: API 데이터 작성하기
    }
    companion object {
        operator fun invoke(parent: ViewGroup): ListViewHolder {
            return ListViewHolder(
                MatchListItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }
}