package com.example.neveranother

import android.R.attr.contentDescription
import android.R.attr.onClick
import android.R.attr.textStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.ui.theme.Cream
import com.example.neveranother.ui.theme.Gray
import com.example.neveranother.ui.theme.NeverAnotherTheme
import com.example.neveranother.ui.theme.Salmon
import com.example.neveranother.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent() {
            App()

        }
    }
}

//Chris
@Preview
@Composable
fun App() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            val neverAnotherLogo = painterResource(R.drawable.never_another_logo)
            Image(
                painter = neverAnotherLogo,
                contentDescription = "Never Another Logo"
            )

            val meassurementPic = painterResource(R.drawable.oevre_omkreds_front)
            Image(
                painter = meassurementPic,
                contentDescription = "Øvre omkreds Front"
            )

            Text("Mål", modifier = Modifier.padding(6.dp))

            Row(
                modifier = Modifier
                    .padding(24.dp)
            ) {

                //Brugt dette link til at style OutlinedTextField:
                // https://stackoverflow.com/questions/66453775/how-to-change-the-outline-color-of-outlinedtextfield-from-jetpack-compose
                OutlinedTextField(
                    "", label = { Text("Øvre omkreds", fontSize = 8.sp) }, onValueChange = {},
                    placeholder = { Text("XX", color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon)
                )

                val firstInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = firstInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 50.dp)
                        .size(15.dp),
                    alignment = Alignment.Center
                )

                OutlinedTextField(
                    "", label = { Text("Nedre omkreds", fontSize = 8.sp) }, onValueChange = {},
                    placeholder = { Text("XX", color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon)
                )

                val secondInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = secondInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp)
                        .size(15.dp),
                    alignment = Alignment.Center
                )
            }

            Row(
                modifier = Modifier
                    .padding(24.dp)
            ) {
                OutlinedTextField(
                    "", label = { Text("Øvre omkreds", fontSize = 8.sp) }, onValueChange = {},
                    placeholder = { Text("XX", color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon)
                )

                val thirdInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = thirdInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 50.dp)
                        .size(15.dp),
                    alignment = Alignment.Center
                )

                OutlinedTextField(
                    "", label = { Text("Nedre omkreds", fontSize = 8.sp) }, onValueChange = {},
                    placeholder = { Text("XX", color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon)
                )

                val forthInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = forthInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp)
                        .size(15.dp),
                    alignment = Alignment.Center
                )
            }

            //Brugt dette link til at lave underline til Text element:
            // https://developer.android.com/develop/ui/compose/text/style-text
            Text("Usikker på størrelsen?", fontSize = 8.sp)
            Text("Bestil free fitting", fontSize = 8.sp, textDecoration = TextDecoration.Underline)


            //Brugt dette link til at lave style knappen:
            // https://kotlinandroid.org/android-jetpack-compose-set-button-background-color/
            Button(
                onClick = {}, modifier = Modifier
                    .padding(24.dp)
                    .size(width = 120.dp, height = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Salmon)
            ) {
                Text("Bestil")
            }
            Column(modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ){HomepageNavbar()}

        }

}

//Maja
@Composable
fun HomepageNavbar() {
    val miniPadding = Modifier.padding(1.dp)
    val NavbuttonColors = ButtonDefaults.buttonColors(containerColor = White)
    Box(
        modifier = Modifier
            .background(White)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {},
                colors = NavbuttonColors,
                shape = RoundedCornerShape(0.dp),
                modifier = miniPadding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_button),
                    contentDescription = "Highlighted home button dkk"
                )
            }
            Button(
                onClick = {},
                colors = NavbuttonColors,
                shape = RoundedCornerShape(0.dp),
                modifier = miniPadding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.maal_button),
                    contentDescription = "Measurement button dkk"
                )
            }
            Button(
                onClick = {},
                colors = NavbuttonColors,
                shape = RoundedCornerShape(0.dp),
                modifier = miniPadding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kurv_button),
                    contentDescription = "basket button dkk"
                )
            }
            Button(
                onClick = {},
                colors = NavbuttonColors,
                shape = RoundedCornerShape(0.dp),
                modifier = miniPadding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_button),
                    contentDescription = "Profile button dkk"
                )
            }
        }
    }
}