package com.example.neveranother.view

import androidx.annotation.DrawableRes
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.neveranother.R

//Maja
data class CarouselItems(val id: Int, @DrawableRes val imageRes: Int, val description: String, val pictureHeight: Dp, val pictureWidth: Dp)

val HomepagePictures = listOf(
    CarouselItems(0, R.drawable.bk_1, "picture 1", 395.dp,414.dp),
    CarouselItems(1, R.drawable.bk_2,"Picture 2", 207.dp, 414.dp),
    CarouselItems(2, R.drawable.bk_3,"Picture 3", 593.dp,414.dp),
    CarouselItems(3, R.drawable.bk_4,"Picture 4", 493.dp, 414.dp),
    CarouselItems(4, R.drawable.bk_5,"Picture 5", 395.dp, 414.dp),
    CarouselItems(5, R.drawable.bk_6,"Picture 6", 592.dp, 414.dp),
    CarouselItems(6, R.drawable.bk_7,"Picture 7", 494.dp, 414.dp),
    CarouselItems(7, R.drawable.bk_8,"Picture 8", 494.dp, 414.dp),
    CarouselItems(8, R.drawable.bk_9,"Picture 9", 618.dp,414.dp),
    CarouselItems(9, R.drawable.bk_10,"Picture 10", 592.dp,414.dp),
    CarouselItems(10, R.drawable.bk_11,"Picture 11", 593.dp,414.dp),
    CarouselItems(11, R.drawable.bk_12,"Picture 12", 263.dp,414.dp),
    CarouselItems(12, R.drawable.bk_13,"Picture 13", 494.dp,414.dp),
    CarouselItems(13, R.drawable.bk_14,"Picture 14", 395.dp, 414.dp),
    CarouselItems(14, R.drawable.bk_15,"Picture 15",593.dp, 414.dp),
)

val ProductpagePictures= listOf(
    CarouselItems(0, R.drawable.sort_bh_front,"Picture 1", 520.dp, 414.dp),
    CarouselItems(1, R.drawable.sort_bh_ryg,"Picture 2", 520.dp, 414.dp),
    CarouselItems(2, R.drawable.hvid_bh_front, "Picture 3", 520.dp,414.dp),
    CarouselItems(3, R.drawable.hvid_bh_side,"Picture 4", 520.dp, 414.dp)
)

val MeasurementpagePictures = listOf(
    CarouselItems(0, R.drawable.ovre_omkreds_front,"Picture 1 DKK",520.dp, 414.dp),
    CarouselItems(1, R.drawable.ovre_omkreds_ryg, "Picture 2 DKK", 520.dp, 414.dp),
    CarouselItems(2, R.drawable.nedre_omkreds, "Picture 3 DKK", 520.dp,414.dp),
    CarouselItems(3, R.drawable.nedre_omkreds_ryg, "Picture 4 DKK", 520.dp, 414.dp),
    CarouselItems(4, R.drawable.bryst_bredde, "Picture 5 DKK", 520.dp, 414.dp),
    CarouselItems(5, R.drawable.bryst_hojde, "Picture 6 DKK", 520.dp, 414.dp)
)
