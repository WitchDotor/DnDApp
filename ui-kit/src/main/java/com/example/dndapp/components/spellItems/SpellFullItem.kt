package com.example.dndproject.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dndapp.theme.DnDTheme


@Composable
fun SpellFullItem(
    name: String,
    level: String,
    school: String,
    components: String,
    castingTime: String,
    range: String,
    duration: String,
    classes: String,
    subClasses: String,
    desc: String,
    onHigherLevels: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .background(DnDTheme.colors.secondary, RoundedCornerShape(16.dp))
            .absolutePadding(16.dp, 8.dp, 16.dp, 8.dp)
            .clickable(onClick = onClick)
    ) {
        Column {
            SpellTitle(title = name)
            Row {
                Level(level = "$level level")
                Text(text = ", ")
                School(school = school)
            }
            Components(components = components)
            CastingTime(castingTime = castingTime)
            Range(range = range)
            Duration(duration = duration)
            Classes(classes = classes)
            SubClasses(subClasses = subClasses)
            Row {
                SpellDesc(desc = desc)
            }
            OnHigherLevels(onHigherLevels = onHigherLevels)
        }
    }
}


@Composable
private fun SpellTitle(title: String) {
    Text(
        text = title,
        style = DnDTheme.typography.titlePrimary
    )
}

@Composable
private fun SpellDesc(desc: String) {
    Text(text = desc)
}

@Composable
private fun Level(level: String) {
    Text(text = level)
}

@Composable
private fun School(school: String) {
    Text(text = school)
}

@Composable
private fun CastingTime(castingTime: String) {
    Row {
        Text(
            text = "Casting time: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = castingTime)
    }
}

@Composable
private fun Range(range: String) {
    Row {
        Text(
            text = "Range: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = range)
    }
}

@Composable
private fun Components(components: String) {

    Row {
        Text(
            text = "Components: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = components)
    }
}

@Composable
private fun Duration(duration: String) {

    Row {
        Text(
            text = "Duration: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = duration)
    }
}

@Composable
private fun Classes(classes: String) {

    Row {
        Text(
            text = "Classes: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = classes)
    }
}

@Composable
private fun SubClasses(subClasses: String) {

    Row {
        Text(
            text = "SubClasses: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = subClasses)
    }
}

@Composable
private fun OnHigherLevels(onHigherLevels: String) {
    Text(
        text = "On Higher Levels: ",
        fontWeight = FontWeight.Bold
    )
    Text(text = onHigherLevels)
}

@Preview
@Composable
private fun ThisPreview() {

    DnDTheme {

        SpellFullItem(
            name = "Name",
            level = "1",
            school = "School",
            components = "v, s, m",
            castingTime = "action",
            range = "30 f",
            duration = "10 min",
            classes = "warlock",
            subClasses = "inferno",
            desc = " Very long desc",
            onHigherLevels = "a lot of"
        ) {}
    }
}