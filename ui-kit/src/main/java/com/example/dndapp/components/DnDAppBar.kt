package com.example.dndapp.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dndapp.theme.DnDIcons
import com.example.dndapp.theme.DnDTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DnDAppBar(
    title: String,
    onNavigateUp: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            if (onNavigateUp != null)
                IconButton(onClick = onNavigateUp) {
                    Icon(
                        imageVector = DnDIcons.ArrowBack,
                        contentDescription = "",
                    )
                }
        },
        actions = actions,
        title = {
            Text(
                text = title,
                style = DnDTheme.typography.titlePrimary,
            )
        },
    )
}

@Preview
@Composable
private fun Preview(){
    DnDTheme {
        DnDAppBar(title = "DnDAppBar")
    }
}