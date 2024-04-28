package com.example.dndapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Default app screen.
 *
 * @param appBar The app bar to display at the top of the screen. Usually a [DnDAppBar].
 * @param navigationBar The navigation bar to display at the bottom of the screen. Usually a [DnDNavigationBar].
 * @param content The content to display.
 */
@Composable
fun DnDScreen(
    appBar: @Composable () -> Unit = {},
    navigationBar: @Composable () -> Unit = {},
    snackbarHostState: SnackbarHostState? = null,
    content: @Composable BoxScope.() -> Unit,
) {

    Scaffold(
        topBar = appBar,
        bottomBar = navigationBar,
        snackbarHost = { if (snackbarHostState != null) DnDSnackbarHost(snackbarHostState) },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            content = content,
        )
    }
}
@Composable
fun DnDSnackbarHost(snackbarHostState: SnackbarHostState) {
    SnackbarHost(
        hostState = snackbarHostState,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    )
}

