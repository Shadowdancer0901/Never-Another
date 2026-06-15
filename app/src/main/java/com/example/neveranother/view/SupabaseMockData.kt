package com.example.neveranother.view

import androidx.compose.ui.unit.dp
import com.example.neveranother.R
import com.example.neveranother.model.PngAssetData

//Maja
class SupabaseMockData {

        /*
        This class represents a rough mockup of how/where our supabase requests would lie
        if we had had the time to properly set it up. Essentially PngAssetData represents
        how the rows and columns would look on an actual data table. I'ts a representation of
        how we would have liked to properly store the data.
        */
    val HomepageCarouselPng= listOf(
        PngAssetData(0, R.drawable.bk_1, "picture 1", 395.dp, 414.dp),
        PngAssetData(1, R.drawable.bk_2, "Picture 2", 207.dp, 414.dp),
        PngAssetData(2, R.drawable.bk_3, "Picture 3", 593.dp, 414.dp),
        PngAssetData(3, R.drawable.bk_4, "Picture 4", 493.dp, 414.dp),
        PngAssetData(4, R.drawable.bk_5, "Picture 5", 395.dp, 414.dp),
        PngAssetData(5, R.drawable.bk_6, "Picture 6", 592.dp, 414.dp),
        PngAssetData(6, R.drawable.bk_7, "Picture 7", 494.dp, 414.dp),
        PngAssetData(7, R.drawable.bk_8, "Picture 8", 494.dp, 414.dp),
        PngAssetData(8, R.drawable.bk_9, "Picture 9", 618.dp, 414.dp),
        PngAssetData(9, R.drawable.bk_10, "Picture 10", 592.dp, 414.dp),
        PngAssetData(10, R.drawable.bk_11, "Picture 11", 593.dp, 414.dp),
        PngAssetData(11, R.drawable.bk_12, "Picture 12", 263.dp, 414.dp),
        PngAssetData(12, R.drawable.bk_13, "Picture 13", 494.dp, 414.dp),
        PngAssetData(13, R.drawable.bk_14, "Picture 14", 395.dp, 414.dp),
        PngAssetData(14, R.drawable.bk_15, "Picture 15", 593.dp, 414.dp),
    )

    val ProductpageCaruselPng = listOf(
        PngAssetData(0, R.drawable.sort_bh_front, "Picture 1", 520.dp, 414.dp),
        PngAssetData(1, R.drawable.sort_bh_ryg, "Picture 2", 520.dp, 414.dp),
        PngAssetData(2, R.drawable.hvid_bh_front, "Picture 3", 520.dp, 414.dp),
        PngAssetData(3, R.drawable.hvid_bh_side, "Picture 4", 520.dp, 414.dp)
    )

    val MeasurementpageCaruselPng = listOf(
        PngAssetData(0, R.drawable.ovre_omkreds_front, "Picture 1 DKK", 520.dp, 414.dp),
        PngAssetData(1, R.drawable.ovre_omkreds_ryg, "Picture 2 DKK", 520.dp, 414.dp),
        PngAssetData(2, R.drawable.nedre_omkreds, "Picture 3 DKK", 520.dp, 414.dp),
        PngAssetData(3, R.drawable.nedre_omkreds_ryg, "Picture 4 DKK", 520.dp, 414.dp),
        PngAssetData(4, R.drawable.bryst_bredde, "Picture 5 DKK", 520.dp, 414.dp),
        PngAssetData(5, R.drawable.bryst_hojde, "Picture 6 DKK", 520.dp, 414.dp)
    )

    val NavbarIconPng = listOf(
        PngAssetData(0, R.drawable.home_highligted_button,"Highlighted home button", 75.dp,50.dp),
        PngAssetData(1, R.drawable.mol_highlited_button,"Highlighted measurement button in DKK", 75.dp,50.dp),
        PngAssetData(2, R.drawable.highlight_kurv_button,"Highlighted basket button in DKK", 75.dp,50.dp),
        PngAssetData(3, R.drawable.profile_highlighted_button,"Highlighted profile button", 75.dp,50.dp),
        PngAssetData(4, R.drawable.home_button,"Home button", 75.dp,50.dp),
        PngAssetData(5, R.drawable.maal_button,"Measurement button in DKK", 75.dp,50.dp),
        PngAssetData(6, R.drawable.kurv_button,"Basket button in DKK", 75.dp,50.dp),
        PngAssetData(7, R.drawable.profile_button,"Profile button", 75.dp,50.dp),
    )

        /*
        The fun in this section mimics how a call to supabase would look. If the database
        had been setup there would be a proper query in place of the val names for it to
        return the data we would request.
        */
    fun getAllHPCaruselAssets(): List<PngAssetData>{
        return HomepageCarouselPng
    }

    fun getAllPPCaruselAssets(): List<PngAssetData>{
        return ProductpageCaruselPng
    }

    fun getAllMPCaruselAssets(): List<PngAssetData>{
        return MeasurementpageCaruselPng
    }

    fun getAllNavbarIconAssets(): List <PngAssetData>{
        return NavbarIconPng
    }
}