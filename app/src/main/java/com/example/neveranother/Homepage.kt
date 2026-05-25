package com.example.neveranother

import android.content.ClipData
import android.os.Bundle
import android.view.PixelCopy
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.collection.intIntMapOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.ui.theme.Black
import com.example.neveranother.ui.theme.NeverAnotherTheme
import com.example.neveranother.ui.theme.White
import com.example.neveranother.ui.theme.tempColor1
import com.example.neveranother.ui.theme.tempColor2


//Maja
@Composable
fun HomepageUi(){
    val PictureBoxModifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp, vertical = 10.dp)
    val TextBoxModifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp, vertical = 10.dp)
        .background(color = tempColor1)

    val itemCount = HomepagePictures.size
    val loops = 1000
    val virtualCount = itemCount * loops
    val initialPage = (virtualCount / 2 - ((virtualCount / 2) % itemCount))
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { virtualCount })

    //note for Scaffold: I used this https://developer.android.com/develop/ui/compose/components/scaffold website to figure out how to set up scaffolding so that our navbar stayed at the bottom of the screen
    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White)
            { HomepageNavbar()}
        }
    ){ innerPadding ->
    LazyColumn(
        modifier = Modifier
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        stickyHeader { InvisibleHeader() }

        //Logo
        item {
            Image(
                painter = painterResource(id = R.drawable.never_another_logo),
                "Never another logo"
            )
        }

        //De 2 første knapper på homepage
        item {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor1,
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kobs_billede_homepage),
                    contentDescription = "Billede af kvinde i en hvid bh, med en 'køb' knap"
                )
            }
        }

        item {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = tempColor2
                ),
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.book_fitting_homepage),
                    contentDescription = "Billede af kvinde i en hvid bh, med en 'book fitting' knap",
                )
            }
        }


        //Skiftende billeder og textbokse
        item {
            Box(
                modifier = TextBoxModifier,
                contentAlignment = Alignment.Center
            ) {
                Text("Our Mission")
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "Den NEVER ANOTHER bøjlefri bh er skræddersyet til at passe perfekt til dig. \n" +
                            "\n" +
                            "Ved hjælp af dine mål tilpasser vores algoritme automatisk bh'en til din krop.\n" +
                            "En innovativ 3D-strikteknologi sikrer et problemfrit produkt og en fuldstændig personlig oplevelse hver gang. "
                )
            }
        }

        item {
            Box(
                modifier = PictureBoxModifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage_b1),
                    contentDescription = "Kvinde i sort BH, taget fra siden",
                )
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "Vores teknologi fungerer som en digital skrædder, der intelligent tilpasser bh'er uden bøjler, så de passer til hver enkelt person. \n" +
                            "Vores videovejledninger guider dig gennem selvmålingsprocessen.\n" +
                            "\n" +
                            "Vores proprietære størrelsesalgoritme bruger disse mål til at ændre designets dimensioner,\n" +
                            "og sikrer, at du får den bedst mulige pasform. Bh'en produceres på en digital strikkemaskine,\n" +
                            "hvilket skaber vores sømløse, 3D-strikkede produkter. \n" +
                            "\n" +
                            "Denne teknologi giver os mulighed for at skabe en personlig pasform, samtidig med at vi reducerer spild og overproduktion."
                )
            }
        }

        item {
            Box(
                modifier = PictureBoxModifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage_b2),
                    contentDescription = "Billede af en kvinde i sort BH der ligger ned, taget i fugleperspektiv",
                )
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "På grund af kapitalismens og fast fashions virkninger er størrelsesvalg blevet reduceret til et par standardiserede bokse.\n" +
                            "\n" +
                            "Selvom branchen gør fremskridt med at fremvise diversitet, har kun 12 % af befolkningen den\n" +
                            "kropstype, som standardstørrelsessystemer designer til.\n" +
                            "\n" +
                            "De fleste standard-bh'er masseproduceres tankeløst til et snævert udvalg af kropstyper.\n" +
                            "Størrelser i butikkerne er baseret på kun to mål, og som et resultat ender mange kvinder med at nøjes med\n" +
                            "bh'er i den forkerte størrelse og pasform, hvilket ærligt talt føles forfærdeligt at have på. \n" +
                            "\n" +
                            "Det efterlader mange af os med at føle os som\n" +
                            "den, der er på udkig, fordi der tilsyneladende ikke er lavet noget til os.\n" +
                            "\n" +
                            "Derfor bringer NEVER ANOTHER skræddersyede produkter tilbage ved hjælp af innovative teknologier, der er tilgængelige i dag. Dette sikrer, at du bliver imødekommet, og at du kan få produkter, som du vil elske og bruge konsekvent."
                )
            }
        }

        item {
            Box(
                modifier = PictureBoxModifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage_b3),
                    contentDescription = "Billede af en kvinde i sort Bh, med en baggrund der ligner ananas skiver"
                )
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "Vores mission er at skabe digitalt skræddersyede bh'er, der passer til hver persons unikke krop. \n" +
                            "\n" +
                            "Vi er forpligtet til at sikre, at alle kan finde en bh, der passer perfekt og er behagelig. Mangfoldighed er kernen i vores produkter og processer - Vi tror på, at for virkelig at kunne arbejde med mangfoldighed, skal vi være i stand til at imødekomme den enkelte. \n" +
                            "\n" +
                            "Dette er en stor mission - Som en ny virksomhed er vi startet med ét design, men er forpligtet til hurtigt at udvide vores designudvalg."
                )
            }
        }

        item {
            Box(
                modifier = PictureBoxModifier,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage_b4),
                    contentDescription = "Billede af en kvinde i en Hvid BH, der kravler på gulvet"
                )
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "I takt med at vi skaber produkter, der forstår forskellige kropsformer og -størrelser, er det meningen, at vores fællesskab skal gøre det samme.\n" +
                            "\n" +
                            "Vi er forpligtet til at opbygge et rum, der omfavner sårbarhed, med diversitet og autenticitet i centrum. Vi har allerede afholdt forskellige workshops med fokus på co-creation og afdækning af de problemer, kvinder står over for, når de skal finde og bære bh'er, selv når de har bryster.\n" +
                            "\n" +
                            "Dernæst er vores mål at skabe inkluderende events og meningsfuldt indhold, der fremmer forbindelse og empowerment."
                )

            }
        }

        item {
            Box(
                modifier = PictureBoxModifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage_b5),
                    contentDescription = "Gruppe billede af flere af 3 forskellige modeller, alle iført N.A BH"
                )
            }
        }

        item {
            Box(
                modifier = TextBoxModifier
            ) {
                Text(
                    "NEVER ANOTHER BH'en blev designet i Danmark med hjælp fra utallige workshopdeltagere, respondenter i undersøgelser og testpiloter.\n" +
                            "Vores forsknings- og udviklingsfase har varet 2 år og produceret mere end 50 prototyper, hvilket har ført os til det rette design, tekstilsammensætning og funktionalitet.\n" +
                            "\n" +
                            "Bh'en er strikket i ét stykke og fremstilles af vores dygtige produktionspartner i Holland, som har været en del af vores rejse og forsknings- og udviklingsproces fra starten.\n" +
                            "\n" +
                            "Vores valg af produktionspartner afspejler vores engagement i produkter af høj kvalitet, ordentligt arbejde og ansvarlig produktion."
                )
            }
        }

            /*For the standard layout of the image carousel i used https://developer.android.com/develop/ui/compose/components/carousel
            While i did manage to make a functional carousel, we wanted to make it so it looped around
            for ease of comfort for the end user. We used Gemini, to help figure out how to loop it without
            having to switch over to motion layout
            */
        item {
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
                            contentDescription = BkList.description
                        )
                    }
                }
            }
        }
    }
}

//Invisible header to make sure the content "glides" behind the camera as to not disturb the user expirience.
//For the header I used this https://www.youtube.com/watch?v=XfYlRn_Jy1g&t=220s for help.

@Composable
fun InvisibleHeader(
   modifier: Modifier = Modifier
       .padding(top = 0.dp, bottom = 5.dp)
       .fillMaxWidth()
){
    Box(
        modifier = Modifier
            .height(30.dp)
            .fillMaxWidth()
            .background(color = tempColor2)
    ){
    }
}

@Composable
fun HomepageNavbar(){
    val miniPadding = Modifier.padding(vertical = 3.dp)
    val NavbuttonColors = ButtonDefaults.buttonColors(containerColor = White)
    Box(
        modifier = Modifier
            .background(White)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row (
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                colors = NavbuttonColors,
                shape = RoundedCornerShape(0.dp),
                modifier = miniPadding
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_highligted_button),
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
