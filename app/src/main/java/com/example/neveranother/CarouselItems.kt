package com.example.neveranother

import androidx.annotation.DrawableRes

//Maja
data class CarouselItems(val id: Int, @DrawableRes val imageRes: Int, val description: String)

val HomepagePictures = listOf(
    CarouselItems(0,R.drawable.bk_1, "picture 1"),
    CarouselItems(1,R.drawable.bk_2,"Picture 2"),
    CarouselItems(2,R.drawable.bk_3,"Picture 3"),
    CarouselItems(3,R.drawable.bk_4,"Picture 4"),
    CarouselItems(4,R.drawable.bk_5,"Picture 5"),
    CarouselItems(5,R.drawable.bk_6,"Picture 6"),
    CarouselItems(6,R.drawable.bk_7,"Picture 7"),
    CarouselItems(7,R.drawable.bk_8,"Picture 8"),
    CarouselItems(8,R.drawable.bk_9,"Picture 9"),
    CarouselItems(9,R.drawable.bk_10,"Picture 10"),
    CarouselItems(10,R.drawable.bk_11,"Picture 11"),
    CarouselItems(11,R.drawable.bk_12,"Picture 12"),
    CarouselItems(12,R.drawable.bk_13,"Picture 13"),
    CarouselItems(13,R.drawable.bk_14,"Picture 14"),
    CarouselItems(14,R.drawable.bk_15,"Picture 15"),
)

val ProductpagePictures = listOf(
    CarouselItems(0,R.drawable.sort_bh_front,"Picture 1"),
    CarouselItems(1,R.drawable.sort_bh_ryg,"Picture 2"),
    CarouselItems(2, R.drawable.hvid_bh_front, "Picture 3"),
    CarouselItems(3, R.drawable.hvid_bh_side,"Picture 4")
)

val MeasurementpagePictures = listOf(
    CarouselItems(0, R.drawable.ovre_omkreds_front,"Picture 1 DKK"),
    CarouselItems(1, R.drawable.ovre_omkreds_ryg, "Picture 2 DKK"),
    CarouselItems(2, R.drawable.nedre_omkreds, "Picture 3 DKK"),
    CarouselItems(3, R.drawable.nedre_omkreds_ryg, "Picture 4 DKK"),
    CarouselItems(4, R.drawable.bryst_bredde, "Picture 5 DKK"),
    CarouselItems(5, R.drawable.bryst_hojde, "Picture 6 DKK")
)
