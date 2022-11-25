package io.github.seoj17.footballscore.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.imageLoad(uri: String) {
    Glide.with(this.context).load(uri).into(this)
}