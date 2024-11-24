package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel // Import for `viewModel()`
import com.example.artspace.ui.AppScreen
import com.example.artspace.ui.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Retrieve the ViewModel instance
            val viewModel: AppViewModel = viewModel()

            // Pass the ViewModel to the AppScreen
            AppScreen(
                images = viewModel.uiState.value.images,
                viewModel = viewModel
            )
        }
    }
}
