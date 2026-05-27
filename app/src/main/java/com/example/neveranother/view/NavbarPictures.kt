package com.example.neveranother.view

import androidx.annotation.DrawableRes
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.neveranother.R

//Maja
data class NavbarPictures(val id: Int, @DrawableRes val imageRes: Int, val description: String, val pictureHeight: Dp, val pictureWidth: Dp)

val NavbuttonPictures = listOf(
    NavbarPictures(0, R.drawable.home_highligted_button,"Highlighted home button", 75.dp,50.dp),
    NavbarPictures(1,
        R.drawable.mol_highlited_button,"Highlighted measurement button in DKK", 75.dp,50.dp),
    NavbarPictures(2, R.drawable.highlight_kurv_button,"Highlighted basket button in DKK", 75.dp,50.dp),
    NavbarPictures(3, R.drawable.profile_highlighted_button,"Highlighted profile button", 75.dp,50.dp),
    NavbarPictures(4, R.drawable.home_button,"Home button", 75.dp,50.dp),
    NavbarPictures(5, R.drawable.maal_button,"Measurement button in DKK", 75.dp,50.dp),
    NavbarPictures(6, R.drawable.kurv_button,"Basket button in DKK", 75.dp,50.dp),
    NavbarPictures(7, R.drawable.profile_button,"Profile button", 75.dp,50.dp),
)