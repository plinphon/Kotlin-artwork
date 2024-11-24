package com.example.artspace.ui

import androidx.lifecycle.ViewModel
import com.example.artspace.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(
        AppUiState(
            currentImage = 0,
            images = DataSource.Images
        )
    )
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()

    fun nextImage() {
        val currentIndex = _uiState.value.currentImage
        val nextIndex = (currentIndex + 1) % _uiState.value.images.size
        _uiState.value = _uiState.value.copy(currentImage = nextIndex)
        println("Next Image Index: $nextIndex") // Debug
    }

    fun previousImage() {
        val currentIndex = _uiState.value.currentImage
        val previousIndex = if (currentIndex - 1 < 0) {
            _uiState.value.images.size - 1
        } else {
            currentIndex - 1
        }
        _uiState.value = _uiState.value.copy(currentImage = previousIndex)
        println("Next Image Index: $previousIndex") // Debug
    }
}