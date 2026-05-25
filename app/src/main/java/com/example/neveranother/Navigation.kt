package com.example.neveranother

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
// Mathias
@Serializable
object ProductPage

@Serializable
object HomePage

@Serializable
object MeasurementPage

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = HomePage
    ) {
        composable<ProductPage> {
            ProductPageScreen(navController = navController)
        }
        composable<HomePage> {
            Homepage(navController = navController)
        }
        composable<MeasurementPage> {
            MeasurementPage(navController = navController)
        }
    }
}