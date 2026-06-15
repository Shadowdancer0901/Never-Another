package com.example.neveranother.viewModel

import androidx.lifecycle.ViewModel
import com.example.neveranother.view.SupabaseMockData

//Maja
class PngCaller: ViewModel(){
    val dataSource = SupabaseMockData()
    val HomepageCarouselPictures =  dataSource.getAllHPCaruselAssets()
    val MeasurementpageCarouselPictures = dataSource.getAllMPCaruselAssets()
    val ProductpageCarouselPictures = dataSource.getAllPPCaruselAssets()
    val NavbarIcons = dataSource.getAllNavbarIconAssets()
}
/*
Through this viewModel we call the fun we made in our supabase mock database
that would query for the data we request from the database. We then call them
again in their respective pages to be to acces the data needed
*/