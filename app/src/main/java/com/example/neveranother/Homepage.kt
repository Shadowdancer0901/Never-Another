package com.example.neveranother

import android.content.ClipData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.ui.theme.NeverAnotherTheme

//Maja
@Composable
fun HomepageUi(){
    val White = Color(0xFFFFFFFF) //Tilføjet for at gøre det nemmere at indsætte farve senere hen, bliver ved med at glemme at skrive 0xFF istedet for #
    val tempColor1 = Color(0xFF96D6DA) //brug for tydligere kunne se "box" omkring hvert afsnit
    val tempColor2 = Color(0xFF01C1CC)
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            Image(
                painter = painterResource(id= R.drawable.never_another_logo),
                "Never another logo",
                modifier = Modifier
            )
        }

        item {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier
            ){
                Image(
                    painter = painterResource(id=R.drawable.kobs_billede_homepage),
                    contentDescription = "Billede af kvinde i en hvid bh, med en 'køb' knap",
                    modifier = Modifier
                )
            }
        }

        item {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier
            ){
                Image(
                    painter = painterResource(id=R.drawable.book_fitting_homepage),
                    contentDescription = "Billede af kvinde i en hvid bh, med en 'book fitting' knap",
                    modifier = Modifier
                )
            }
        }
    }
}