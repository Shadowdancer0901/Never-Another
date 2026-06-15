package com.example.neveranother.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.unit.Dp

data class PngAssetData(
    val id: Int,
    @DrawableRes val imageRes: Int,
    val description: String,
    val pictureHeight: Dp,
    val pictureWidth: Dp
)