package com.example.neveranother

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
@Composable
fun ProductPageScreen(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars) // i have added this to make my app not overlap with top bar on phones

    ) {
        item {
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
        }
        item{
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
        }
        item{
            // space between picture and title
            Spacer(Modifier.height(15.dp))
        }
        item{
            // title
            Text (
                text = "Bra no. 1",
                fontSize = 32.sp,
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFFEE9981),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red),
                textAlign = TextAlign.Center
            )
        }
        item{
            // space between title and paragraf
            Spacer(Modifier.height(15.dp))
        }
        item{
            // description
            Text(
                text = "Mød din nye yndlings-bh - skabt ved hjælp af vores algoritme til brugerdefineret pasform og skræddersyet til at passe perfekt til dine mål. Denne bh er skabt til dig.",
                fontSize = 14.sp,
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 62.dp)
                    .background(Color.Blue))
        }
        item{
            // space between title and paragraf
            Spacer(Modifier.height(15.dp))
        }
        item {
            val itemsListMaterialerVask = listOf(
                "Materialer" to "Hvid bh:\n" +
                        "41% Filea cupro (regenereret cellulosefiber udvundet af bomuldsfibre) 25% elastan\n" +
                        "\n" +
                        "Sort bh: 34% Sensil® EcoCare genbrugt nylon 34% Otex nylon",
                "Vaske guide" to "Brug din bh i maksimalt 3 dage i træk, før du vasker den. Regelmæssig vask forlænger bh'ens levetid.\n" +
                        "\n"+
                        "30 graders finvask\n" +

                        "Brug en vaskepose, hvis det er muligt\n" +

                        "Vask med lignende farvet tøj\n" +

                        "Må ikke tørretumbles\n" +

                        "Brug ikke skyllemiddel\n" +

                        "Må ikke bleges"
            )
            ExpandableSection(itemsListMaterialerVask)
        }
        item{
            Spacer(Modifier.height(15.dp))
        }
        item {
            ColorSelection()
        }
        item {
            "tilføj til kurv del"
            AddToCartSection()
        }
        item{
            val itemsListForsendelse = listOf(
                "Garanti & forsendelse" to "Vi ønsker, at du skal elske din bh. Er pasformen ikke perfekt? Vi tilbyder en gratis størrelsesgaranti!\n" +
                        "\n" +
                        "Vi bestræber os på at levere din bh inden for 6 uger. NEVER ANOTHER er en startup, og da vi arbejder med produktionsvinduer og skræddersyede produkter, er leveringstiderne længere end, hvad fast fashion-branchen normalt kan tilbyde. Vi gør vores bedste for at minimere ventetiden, og vi takker dig for din tålmodighed."
            )
            ExpandableSection(itemsListForsendelse)
        }













    }
}

@Composable
private fun ExpandableSection(itemsList: List<Pair<String, String>>){

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    ){
        itemsList.forEach { item ->
            ExpandableItem(item.first, item.second)
        }
    }
}

@Composable
fun ExpandableItem(title: String, text: String){
    var isExpanded by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize()
            .clickable {
                isExpanded = !isExpanded
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                fontSize = 16.sp
            )
            Image(
                painter = if (isExpanded) painterResource(R.drawable.arrow_up) else painterResource(R.drawable.arrow_down),
                contentDescription = "Collapsable item",
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(Modifier.height(15.dp))

        if (isExpanded){
            Text(
                text = text,
                Modifier.width(300.dp),
                fontSize = 14.sp,
            )
            Spacer(Modifier.height(16.dp))

        }

    }
}

@Composable
fun ColorSelection() {
    val colorOptions = listOf(
        "Hvid" to Color.White,
        "Sort" to Color.Black
    )
    var selectedColor by remember { mutableStateOf("Hvid") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Color:",
            fontSize = 20.sp,
            color = Color(0xFFEE9981),
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            colorOptions.forEach { (name, color) ->
                ColorCircle(
                    color = color,
                    isSelected = selectedColor == name,
                    onClick = { selectedColor = name }
                )
            }
        }
    }
}

@Composable
fun ColorCircle(
    color: Color,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(color)
            .border(
                width = if (isSelected) 2.dp else 1.dp,
                color = if (isSelected) Color(0xFFEE9981) else Color.LightGray,
                shape = CircleShape
            )
            .clickable { onClick() }
    )
}

@Composable
fun AddToCartSection() {
    var quantity by remember { mutableStateOf(1) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Minus knap
        Box(
            modifier = Modifier
                .size(36.dp)
                .border(1.5.dp, Color(0xFFEE9981), RoundedCornerShape(8.dp))
                .clickable { if (quantity > 1) quantity-- },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "−",
                color = Color(0xFFEE9981),
                fontSize = 20.sp
            )
        }

        // Antal
        Text(
            text = quantity.toString(),
            fontSize = 18.sp,
            color = Color.Black
        )

        // Plus knap
        Box(
            modifier = Modifier
                .size(36.dp)
                .border(1.5.dp, Color(0xFFEE9981), RoundedCornerShape(8.dp))
                .clickable { quantity++ },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "+",
                color = Color(0xFFEE9981),
                fontSize = 20.sp
            )
        }

        // Tilføj til kurv knap
//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .height(44.dp)
//                .border(1.5.dp, Color(0xFFEE9981), RoundedCornerShape(50.dp))
//                .clickable {  }, /* TODO: tilføj til kurv logik */
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = "Tilføj til kurv",
//                color = Color(0xFFEE9981),
//                fontSize = 14.sp
//            )
//        }
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .height(44.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFFEE9981),
                containerColor = Color.Transparent
            ),
            border = BorderStroke(1.5.dp, Color(0xFFEE9981)),
            shape = RoundedCornerShape(50.dp)
        ) {
            Text(text = "Tilføj til kurv", fontSize = 14.sp)
        }
    }
}