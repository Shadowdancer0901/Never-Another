package com.example.neveranother

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

//Maja
data class CarouselItems(val id: Int, @DrawableRes val imageRes: Int, val description: String, val pictureHeight: Dp, val pictureWidth: Dp)



val ProductpagePictures = listOf(
    CarouselItems(0,R.drawable.sort_bh_front,"Picture 1", 520.dp, 414.dp),
    CarouselItems(1,R.drawable.sort_bh_ryg,"Picture 2", 520.dp, 414.dp),
    CarouselItems(2, R.drawable.hvid_bh_front, "Picture 3", 520.dp,414.dp),
    CarouselItems(3, R.drawable.hvid_bh_side,"Picture 4", 520.dp, 414.dp)
)

