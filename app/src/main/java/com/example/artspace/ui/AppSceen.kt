package com.example.artspace.ui

import android.provider.MediaStore.Images
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.model.Image

import com.example.artspace.data.DataSource
import com.example.artspace.ui.theme.ArtistTextStyle
import com.example.artspace.ui.theme.YearTextStyle

@Composable
fun AppScreen(
    images: List<Image>,
    viewModel: AppViewModel
) {
    val uiState by viewModel.uiState.collectAsState()
    val currentImage = images[uiState.currentImage]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        DisplayArtwork(image = currentImage)

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { viewModel.previousImage() }) {
                Text("Previous")
            }

            Button(onClick = { viewModel.nextImage() }) {
                Text("Next")
            }
        }
    }
}

@Composable
fun DisplayArtwork(image: Image) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = image.drawableResId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(id = image.titleResId),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = stringResource(id = image.titleResId),
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = stringResource(id = image.artistResId),
            style = ArtistTextStyle
        )
        Text(
            text = stringResource(id = image.yearResId),
            style = YearTextStyle
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAppScreen() {

    val Images = DataSource.Images
    val viewModel = AppViewModel()
    AppScreen(images = Images, viewModel = viewModel)
}