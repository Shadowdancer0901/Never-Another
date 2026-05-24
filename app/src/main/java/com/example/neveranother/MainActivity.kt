package com.example.neveranother

import android.R.attr.contentDescription
import android.R.attr.onClick
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.neveranother.ui.theme.NeverAnotherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    Column(modifier = Modifier
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
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
        ){
            TextField("XX", onValueChange = {}, modifier = Modifier
                .size(100.dp, 50.dp)
                .padding(end = 24.dp))

            TextField("XX", onValueChange = {}, modifier = Modifier
                .size(100.dp, 50.dp)
                .padding(start = 24.dp))
        }

        Row(
            modifier = Modifier
                .padding(24.dp)
        ){
            TextField("XX", onValueChange = {}, modifier = Modifier
                .size(100.dp, 50.dp)
                .padding(end = 24.dp))

            TextField("XX", onValueChange = {}, modifier = Modifier
                .size(100.dp, 50.dp)
                .padding(start = 24.dp))
        }

        Text("Usikker på størrelsen?")
        Text("Bestil free fitting")

        Button(onClick = {}, modifier = Modifier
            .padding(24.dp)
        ){
            Text("Bestil")
        }
}
}