package com.example.neveranother

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
import com.example.neveranother.ui.theme.tempColor1
import com.example.neveranother.ui.theme.tempColor2

//Maja

@Composable
fun HomepageNavbar(){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(tempColor1),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.home_highligted_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun BuyNavbar(){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(tempColor1),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.highlight_kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun MeasurementNavbar(){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(tempColor1),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.mol_highlited_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.profile_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}

@Composable
fun ProfileNavbar(){
    val buttonNavmod = Modifier
        .height(75.dp)
        .width(50.dp)

    Box(
        modifier = Modifier
            .background(tempColor1),
        contentAlignment = Alignment.Center
    ){
        Row( modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.home_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.maal_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.kurv_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier){
                Image(
                    painter = painterResource(id=R.drawable.profile_highlighted_button),
                    contentDescription = "",
                    modifier = buttonNavmod
                )
            }
        }
    }
}