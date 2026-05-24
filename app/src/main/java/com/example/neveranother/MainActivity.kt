package com.example.neveranother

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.ui.theme.NeverAnotherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeverAnotherTheme {
                ProductPageScreen()
            }
        }
    }
}

//Mathias
@Composable
fun ProductPageScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .windowInsetsPadding(WindowInsets.statusBars) // i have added this to make my app not overlap with top bar on phones

    ) {
        //Logo
        val neverAnotherLogo = painterResource(R.drawable.never_another_logo)
        Image(
            painter = neverAnotherLogo,
            contentDescription = "neverAnother logo",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 6.dp)
                .background(Color.Green),
            contentScale = ContentScale.FillWidth
        )

        // picture carousel
        val headerPicture = painterResource(R.drawable.bk_7)
        Image(
            painter = headerPicture,
            contentDescription = "girl laying on a bed in her NeverAnother white bra",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.Red),
            contentScale = ContentScale.FillWidth
        )
        // space between picture and title
        Spacer(modifier = Modifier.height(15.dp))
        // title
        Text (
            text = "Bra no. 1",
            fontSize = 32.sp,
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xFFEE9981),
            modifier = Modifier.fillMaxWidth().background(Color.Red),
            textAlign = TextAlign.Center
        )
        // space between title and paragraf
        Spacer(modifier = Modifier.height(15.dp))

        // description
        Text(
            text = "Mød din nye yndlings-bh - skabt ved hjælp af vores algoritme til brugerdefineret pasform og skræddersyet til at passe perfekt til dine mål. Denne bh er skabt til dig.",
            fontSize = 14.sp,
            color = Color(0xFF000000),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 62.dp).background(Color.Blue))

        // space between title and paragraf
        Spacer(modifier = Modifier.height(15.dp))

    }
}