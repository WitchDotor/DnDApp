package com.example.dndapp.components


import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.dndapp.theme.DnDIcons
import com.example.dndapp.theme.DnDTheme


@Composable
fun DnDNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = DnDTheme.colors.primary,
        content = content,
    )
}

@Composable
fun RowScope.DnDNavigationBarItem(
    label: String,
    icon: ImageVector,
    selected: Boolean,
    onClick: () -> Unit,
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = label,
            )
        },
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = DnDTheme.colors.onBackground,
            selectedTextColor = DnDTheme.colors.onBackground,
            unselectedIconColor = DnDTheme.colors.onPrimary,
            unselectedTextColor = DnDTheme.colors.onPrimary,
            indicatorColor = DnDTheme.colors.primary,
        ),
    )
}

@Preview
@Composable
private fun Preview() {
    DnDTheme {
        DnDNavigationBar {
            repeat(5) {
                DnDNavigationBarItem(
                    label = "",
                    icon = DnDIcons.Spells,
                    selected = it == 1,
                    onClick = {},
                )
            }
        }
    }
}
