package io.github.seoj17.footballscore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.seoj17.footballscore.databinding.ViewHolderMatchBinding

//TODO:리스트 뷰 홀더 구현하기
class MatchViewHolder(
    private val binding: ViewHolderMatchBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(dataSet: String) {
        //TODO: API 데이터 작성하기
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