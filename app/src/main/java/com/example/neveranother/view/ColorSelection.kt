package com.example.neveranother.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.viewModel.MeasurementViewModel

// Mathias
@Composable
fun ColorSelection(viewModel: MeasurementViewModel) {
    val colorOptions = listOf(  // TODO skal hoistes ud fra her og så skal den have en liste(af farver, fra en produkt model) som parameter
        "Hvid" to Color.White,
        "Sort" to Color.Black
    )
    var selectedColor by remember { mutableStateOf("Hvid") }
    viewModel.tempProductColor = selectedColor

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Color: $selectedColor",
            fontSize = 20.sp,
            color = Color(0xFFEE9981),
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            colorOptions.forEach { (name, color) ->
                ColorCircle(
                    color = color,
                    isSelected = selectedColor == name,
                    onClick = { selectedColor = name }
                )
            }
        }
    }
}

@Composable
fun ColorCircle(
    color: Color,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(color)
            .border(
                width = if (isSelected) 2.dp else 1.dp,
                color = if (isSelected) Color(0xFFEE9981) else Color.LightGray,
                shape = CircleShape
            )
            .clickable { onClick() }
    )
}