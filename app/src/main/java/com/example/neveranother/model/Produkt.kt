package com.example.neveranother.model

import androidx.compose.ui.graphics.Color

data class Produkt(
    val name: String,
    val description: String,
    val materialsList: List<String>,
    val cleaningGuide: String,
    val imageList: List<Billede>,
    val colors: List<Color>,
    val chosenColor: Color
    ) {
}