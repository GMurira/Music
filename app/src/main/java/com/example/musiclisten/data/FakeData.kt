package com.example.musiclisten.data

import androidx.annotation.DrawableRes
import com.example.musiclisten.R

data class Music (
    val songName: String,
     @DrawableRes val songImage: Int,
    val artistName: String,
    val songLength: Int
)


val musicData = mutableListOf<Music>(
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123),
    Music("In the dm", R.drawable.ic_launcher_background, "John Doe", 123)
)