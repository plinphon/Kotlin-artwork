package com.example.artspace.data


import com.example.artspace.R
import com.example.artspace.model.Image


object DataSource {
    val Images = listOf(
        Image(
            drawableResId = R.drawable.monalisa,
            titleResId = R.string.monalisa,
            artistResId = R.string.artist_davinci,
            yearResId = R.string.year_monalisa
        ),
        Image(
            drawableResId = R.drawable.starry_night,
            titleResId = R.string.starry_night,
            artistResId = R.string.artist_van_gogh,
            yearResId = R.string.year_starry_night
        ),
        Image(
            drawableResId = R.drawable.the_scream,
            titleResId = R.string.the_scream,
            artistResId = R.string.artist_edvard_munch,
            yearResId = R.string.year_the_scream
        ),
        Image(
            drawableResId = R.drawable.van_gogh,
            titleResId = R.string.van_gogh,
            artistResId = R.string.artist_van_gogh,
            yearResId = R.string.year_van_gogh
        )
    )
}