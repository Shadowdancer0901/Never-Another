package com.example.neveranother.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.neveranother.ui.theme.White
import androidx.navigation.NavController
import com.example.neveranother.R
import com.example.neveranother.viewModel.HomePage
import com.example.neveranother.viewModel.MeasurementPage
import com.example.neveranother.viewModel.ProductPage

//Maja

@Composable
fun HomepageNavbar(navController: NavController){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(White),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {navController.navigate(HomePage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.home_highligted_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {navController.navigate(MeasurementPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {navController.navigate(ProductPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun BuyNavbar(navController: NavController){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(White),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {navController.navigate(HomePage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {navController.navigate(MeasurementPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {navController.navigate(ProductPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.highlight_kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun MeasurementNavbar(navController: NavController){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(White),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {navController.navigate(HomePage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {navController.navigate(MeasurementPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.mol_highlited_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {navController.navigate(ProductPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun ProfileNavbar(navController: NavController){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(White),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {navController.navigate(HomePage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {navController.navigate(MeasurementPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {navController.navigate(ProductPage)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = White,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id= R.drawable.profile_highlighted_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}