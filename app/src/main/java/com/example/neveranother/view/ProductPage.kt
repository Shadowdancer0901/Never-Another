package com.example.neveranother.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.neveranother.R
import com.example.neveranother.ui.theme.Black
import com.example.neveranother.ui.theme.Salmon
import com.example.neveranother.ui.theme.White
import com.example.neveranother.viewModel.PngCaller
import com.example.neveranother.viewModel.MeasurementViewModel

// Mathias
@Composable
fun ProductPageScreen(
    navController: NavController,
    measurementViewModel: MeasurementViewModel,
    pngCaller: PngCaller = viewModel()
    ){ // TODO hoist ud alt tekst

    //Carousel values
    val itemCount = pngCaller.ProductpageCarouselPictures.size
    val loops = 1000
    val virtualCount = itemCount * loops
    val initialPage = (virtualCount / 2 - ((virtualCount / 2) % itemCount))
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { virtualCount })

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White)
            { (BuyNavbar(navController)) }
        }
    ) { innerPadding ->
    LazyColumn(
        modifier = Modifier
            .background(White)
            .padding(innerPadding)
            .fillMaxSize()
            //.windowInsetsPadding(WindowInsets.statusBars) // i have added this to make my app not overlap with top bar on phones

    ) {
        item {
            //Logo
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id= R.drawable.never_another_logo),
                    contentDescription = "Never another logo",
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                )
            }
        }

        //Our Picture carousel
        item {
            //Maja's carousel template
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(618.dp)
                    .padding(vertical = 10.dp)
            ) { i ->
                val actualIndex = i % itemCount
                val PkList = pngCaller.ProductpageCarouselPictures[actualIndex]

                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(id = PkList.imageRes),
                        contentDescription = PkList.description,
                        modifier = Modifier
                            .width(PkList.pictureWidth)
                            .height(PkList.pictureHeight)
                    )
                }
            }
        }

        item{
            // title
            Text (
                text = "Bra no. 1",
                fontSize = 32.sp,
                style = MaterialTheme.typography.titleLarge,
                color = Salmon,
                modifier = Modifier
                    .fillMaxWidth(),
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
                color = Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 62.dp))
        }

        item{
            // space between title and paragraph
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
            ColorSelection(measurementViewModel)
        }

        item {
            "tilføj til kurv del"
            AddToCartSection(measurementViewModel, navController,)
        }

        item{ // TODO , skal der laves om på hvor denne info står? eller lader vi den stå her direkte?--- der står info om garanti og info
            val itemsListForsendelse = listOf(
                "Garanti & forsendelse" to "Vi ønsker, at du skal elske din bh. Er pasformen ikke perfekt? Vi tilbyder en gratis størrelsesgaranti!\n" +
                        "\n" +
                        "Vi bestræber os på at levere din bh inden for 6 uger. NEVER ANOTHER er en startup, og da vi arbejder med produktionsvinduer og skræddersyede produkter, er leveringstiderne længere end, hvad fast fashion-branchen normalt kan tilbyde. Vi gør vores bedste for at minimere ventetiden, og vi takker dig for din tålmodighed."
            )
            ExpandableSection(itemsListForsendelse)
        }

        item{
            Spacer(Modifier.height(15.dp))
        }

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                var showCheckout by remember { mutableStateOf(false) }
                if(showCheckout){
                    CheckoutPopUp(measurementViewModel)
                }

                Button(
                    onClick = { if(measurementViewModel.quantityOfProduct > 0)showCheckout = true},
                    modifier = Modifier
                        .height(44.dp)
                        .padding(horizontal = 40.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Salmon,
                        containerColor = Color.Transparent
                    ),
                    border = BorderStroke(1.5.dp, Salmon),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Text(
                        text = "Check out",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        item {
                Spacer(Modifier.height(30.dp).background(White))
            }
        }
    }
}





