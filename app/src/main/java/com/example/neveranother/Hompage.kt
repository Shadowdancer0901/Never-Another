package com.example.neveranother

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.neveranother.ui.theme.White
import com.example.neveranother.ui.theme.tempColor1
import com.example.neveranother.ui.theme.tempColor2

//Maja
@Composable
fun Homepage(navController: NavController) {

    //Carousel values
    val itemCount = HomepagePictures.size
    val loops = 1000
    val virtualCount = itemCount * loops
    val initialPage = (virtualCount / 2 - ((virtualCount / 2) % itemCount))
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { virtualCount })

    //standardized box values for text and pictures
    val TextBoxMod = Modifier
        .fillMaxSize()
        .padding(vertical = 10.dp, horizontal = 25.dp)
    val pictureBoxMod = Modifier.fillMaxSize()

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White)
            { (HomepageNavbar(navController)) }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //logo
            item{
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(id=R.drawable.never_another_logo),
                        contentDescription = "Never Another Logo",
                        modifier = Modifier
                            .height(80.dp)
                            .width(400.dp)
                    )
                }
            }

            //The 2 first buttons on the homepage
            item {
                Box(modifier = Modifier
                    .fillMaxSize(),
                    contentAlignment = Alignment.Center){
                        Button(
                            onClick = {navController.navigate(MeasurementPage)},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = White,
                            ),
                            shape = RoundedCornerShape(0.dp),
                            modifier = Modifier
                        )  {
                            Image(
                                painter = painterResource(id=R.drawable.kobs_billede_homepage),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(414.dp)
                                    .height(340.dp)

                            )
                        }
                }
            }

            item {
                Box(modifier = Modifier
                    .fillMaxSize(),
                    contentAlignment = Alignment.Center){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = White,
                        ),
                        shape = RoundedCornerShape(0.dp),
                        modifier = Modifier
                    ){
                        Image(
                            painter = painterResource(id=R.drawable.book_fitting_homepage),
                            contentDescription = "",
                            modifier = Modifier
                                .width(414.dp)
                                .height(340.dp)
                        )
                    }
                }
            }

            //"Our mission" Text and pictures
            item {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 10.dp, horizontal = 25.dp)
                    .background(White),
                    contentAlignment = Alignment.Center){
                        Text("Our mission")
                }
            }

            item {
                Box(modifier = TextBoxMod,
                    contentAlignment = Alignment.Center){
                        Text("Den NEVER ANOTHER bøjlefri bh er skræddersyet til at passe perfekt til dig. \n" +
                                "\n" +
                                "Ved hjælp af dine mål tilpasser vores algoritme automatisk bh'en til din krop.\n" +
                                "En innovativ 3D-strikteknologi sikrer et problemfrit produkt og en fuldstændig personlig oplevelse hver gang. ")
                }
            }

            item {
                Box(modifier = pictureBoxMod,
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id= R.drawable.homepage_b1),
                        contentDescription = "",
                        modifier = Modifier
                            .width(414.dp)
                            .height(391.dp)
                    )
                }
            }

            item {
                Box(modifier = TextBoxMod,
                    contentAlignment = Alignment.Center){
                    Text("Vores teknologi fungerer som en digital skrædder, der intelligent tilpasser bh'er uden bøjler, så de passer til hver enkelt person. Vores videovejledninger guider dig gennem selvmålingsprocessen.\n" +
                            "\n" +
                            "Vores proprietære størrelsesalgoritme bruger disse mål til at ændre designets dimensioner,og sikrer, at du får den bedst mulige pasform. Bh'en produceres på en digital strikkemaskine,hvilket skaber vores sømløse, 3D-strikkede produkter\n" +
                            "\n" +
                            "Denne teknologi giver os mulighed for at skabe en personlig pasform, samtidig med at vi reducerer spild og overproduktion.")
                }
            }

            item {
                Box(modifier = pictureBoxMod,
                    contentAlignment = Alignment.Center){
                        Image(
                            painter = painterResource(id=R.drawable.homepage_b2),
                            contentDescription = "",
                            modifier = Modifier
                                .width(414.dp)
                                .height(482.dp)
                        )
                }
            }

            item {
                Box(modifier = TextBoxMod,
                    contentAlignment = Alignment.Center){
                    Text("På grund af kapitalismens og fast fashions virkninger er størrelsesvalg blevet reduceret til et par standardiserede bokse." +
                            "\n" +
                            "Selvom branchen gør fremskridt med at fremvise diversitet, har kun 12 % af befolkningen den kropstype, som standardstørrelsessystemer designer til.\n" +
                            "\n" +
                            "De fleste standard-bh'er masseproduceres tankeløst til et snævert udvalg af kropstyper.Størrelser i butikkerne er baseret på kun to mål, og som et resultat ender mange kvinder med at nøjes med bh'er i den forkerte størrelse og pasform, hvilket ærligt talt føles forfærdeligt at have på. \n" +
                            "\n" +
                            "Det efterlader mange af os med at føle os som\n" +
                            "den, der er på udkig, fordi der tilsyneladende ikke er lavet noget til os.\n" +
                            "\n" +
                            "Derfor bringer NEVER ANOTHER skræddersyede produkter tilbage ved hjælp af innovative teknologier, der er tilgængelige i dag. Dette sikrer, at du bliver imødekommet, og at du kan få produkter, som du vil elske og bruge konsekvent.")
                }
            }

            item {
                Box(modifier = pictureBoxMod,
                    contentAlignment = Alignment.Center){
                        Image(
                            painter =painterResource(id=R.drawable.homepage_b3),
                            contentDescription = "",
                            modifier = Modifier
                                .width(414.dp)
                                .height(411.dp)
                        )
                }
            }

           item {
               Box(modifier = TextBoxMod,
               contentAlignment = Alignment.Center) {
                   Text("Vores mission er at skabe digitalt skræddersyede bh'er, der passer til hver persons unikke krop. \n" +
                           "\n" +
                           "Vi er forpligtet til at sikre, at alle kan finde en bh, der passer perfekt og er behagelig. Mangfoldighed er kernen i vores produkter og processer - Vi tror på, at for virkelig at kunne arbejde med mangfoldighed, skal vi være i stand til at imødekomme den enkelte. \n" +
                           "\n" +
                           "Dette er en stor mission - Som en ny virksomhed er vi startet med ét design, men er forpligtet til hurtigt at udvide vores designudvalg.")
               }
           }

           item {
               Box(modifier = pictureBoxMod,
                   contentAlignment = Alignment.Center){
                   Image(
                       painter =painterResource(id=R.drawable.homepage_b4),
                       contentDescription = "",
                       modifier = Modifier
                           .width(414.dp)
                           .height(586.dp)
                   )
               }
           }

           item {
               Box(modifier = TextBoxMod,
                   contentAlignment = Alignment.Center){
                        Text("I takt med at vi skaber produkter, der forstår forskellige kropsformer og -størrelser, er det meningen, at vores fællesskab skal gøre det samme.\n" +
                                "\n" +
                                "Vi er forpligtet til at opbygge et rum, der omfavner sårbarhed, med diversitet og autenticitet i centrum. Vi har allerede afholdt forskellige workshops med fokus på co-creation og afdækning af de problemer, kvinder står over for, når de skal finde og bære bh'er, selv når de har bryster.\n" +
                                "\n" +
                                "Dernæst er vores mål at skabe inkluderende events og meningsfuldt indhold, der fremmer forbindelse og empowerment.")
               }
           }

           item {
               Box(modifier = pictureBoxMod,
                   contentAlignment = Alignment.Center){
                   Image(
                       painter =painterResource(id=R.drawable.homepage_b5),
                       contentDescription = "",
                       modifier = Modifier
                           .width(391.dp)
                           .height(391.dp)
                   )
               }
           }

           item {
               Box(modifier = TextBoxMod,
                   contentAlignment = Alignment.Center){
                        Text("NEVER ANOTHER BH'en blev designet i Danmark med hjælp fra utallige workshopdeltagere, respondenter i undersøgelser og testpiloter.\n" +
                                "\n"+
                                "Vores forsknings- og udviklingsfase har varet 2 år og produceret mere end 50 prototyper, hvilket har ført os til det rette design, tekstilsammensætning og funktionalitet.\n" +
                                "\n" +
                                "Bh'en er strikket i ét stykke og fremstilles af vores dygtige produktionspartner i Holland, som har været en del af vores rejse og forsknings- og udviklingsproces fra starten.\n" +
                                "\n" +
                                "Vores valg af produktionspartner afspejler vores engagement i produkter af høj kvalitet, ordentligt arbejde og ansvarlig produktion.")
               }
           }

            //Our Picture carousel
            item {
                /*For the standard layout of the image carousel i used https://developer.android.com/develop/ui/compose/components/carousel
            While i did manage to make a functional carousel, we wanted to make it so it looped around
            for ease of comfort for the end user. I used Gemini, to help figure out how to loop it without
            having to switch over to motion layout
            */
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(618.dp)
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                ) { i ->
                    val actualIndex = i % itemCount
                    val BkList = HomepagePictures[actualIndex]
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = BkList.imageRes),
                            contentDescription = BkList.description,
                            modifier = Modifier
                                .width(BkList.pictureWidth)
                                .height(BkList.pictureHeight)
                        )
                    }
                }
            }
        }
    }
}
