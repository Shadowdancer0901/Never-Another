package com.example.neveranother.viewModel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranother.view.Booking
import com.example.neveranother.view.Homepage
import com.example.neveranother.view.MeasurementPage
import com.example.neveranother.view.ProductPageScreen
import kotlinx.serialization.Serializable
// Mathias
@Serializable
object ProductPage

@Serializable
object HomePage

@Serializable
object MeasurementPage

@Serializable
object BookingPage {
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val measurementViewModel: MeasurementVM = viewModel()

    NavHost(
        navController = navController,
        startDestination = HomePage
    ) {
        composable<ProductPage> {
            ProductPageScreen(navController = navController, measurementViewModel)
        }
        composable<HomePage> {
            Homepage(navController = navController)
        }
        composable<MeasurementPage> {
            MeasurementPage(navController = navController, measurementViewModel)
        }
        composable<BookingPage> {
            Booking(navController = navController)
        }
    }
}