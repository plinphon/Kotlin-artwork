package com.example.artspace.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Image(
    @DrawableRes val drawableResId: Int,
    @StringRes val titleResId: Int,
    @StringRes val artistResId: Int,
    @StringRes val yearResId: Int
)