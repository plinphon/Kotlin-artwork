package com.example.artspace.ui

import com.example.artspace.model.Image

data class AppUiState(
    val currentImage: Int = 0,
    val images: List<Image> = emptyList()
)
