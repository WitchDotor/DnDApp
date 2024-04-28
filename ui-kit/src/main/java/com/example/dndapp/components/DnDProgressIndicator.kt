package com.example.dndapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dndapp.theme.DnDTheme


@Composable
fun ProgressIndicator() {
    CircularProgressIndicator(
        modifier = Modifier.padding(4.dp),
        color = DnDTheme.colors.primary
    )
}

@Preview
@Composable
private fun Preview() {
    DnDTheme {
        ProgressIndicator()
    }

}