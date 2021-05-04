package com.phongbm.tictactoe.android.presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.phongbm.tictactoe.android.R

/**
 * Create by @{USER} on @{DATE}
 */

@Composable
fun HomeScreenComposable() {
    Column(
        modifier = Modifier.background(
            brush = Brush.linearGradient(
                colors = listOf(Color(0xFF402DA7), Color(0xFF1E0F4D))
            )
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_logo_1
            ),
            contentDescription = null,
            modifier = Modifier.wrapContentSize()
        )
        Button(
            onClick = {
            }
        ) {
            Text("PLAY GAME")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun HomeScreenComposablePreview() {
    HomeScreenComposable()
}