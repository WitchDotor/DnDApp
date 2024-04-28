package com.example.dndproject.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dndapp.theme.DnDTheme


@Composable
fun SpellListItem(
    name: String, level: String, school: String, desc: String, onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .clickable(onClick = onClick)
            .background(DnDTheme.colors.secondary, RoundedCornerShape(16.dp))
            .absolutePadding(16.dp, 8.dp, 16.dp, 8.dp)
    ) {
        Column {
            SpellTitle(title = name)
            Row {
                Level(level = "$level level, ")
                School(school = school)
            }
            SpellDesc(desc = desc)
        }
    }
}

@Composable
private fun FavouriteButton(onClick: () -> Unit) {
    androidx.compose.material3.Icon(imageVector = Icons.Default.Favorite,
        contentDescription = "Favourite",
        modifier = Modifier.clickable { onClick })
}

@Composable
private fun SpellTitle(title: String) {
    Text(
        text = title, style = DnDTheme.typography.titlePrimary
    )
}

@Composable
private fun SpellDesc(desc: String) {
    Text(text = "${desc.dropLast((desc.length / 1.3).toInt())}...")
}

@Composable
private fun Level(level: String) {
    Text(text = level)
}

@Composable
private fun School(school: String) {
    Text(text = school)
}

@Preview
@Composable
private fun thisPreview() {

    DnDTheme {

        SpellListItem(
            name = "Name", level = "1", school = "School", desc = " Very long desc"
        ) {
            TODO()
        }
    }
}