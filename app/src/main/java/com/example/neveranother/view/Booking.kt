package com.example.neveranother.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import com.example.neveranother.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.neveranother.ui.theme.White
import com.example.neveranother.viewModel.BookingPage
import com.example.neveranother.viewModel.HomePage

//Chris
@Composable
fun Booking(navController: NavController) {

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White) { (HomepageNavbar(navController)) }
        }) { innerPadding ->
        //Yderste lag på siden
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {

            //Overskrift og tilbage knap
            item() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 100.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        IconButton(
                            onClick = { navController.navigate(HomePage) },
                            modifier = Modifier,
                        ) {
                            Image(
                                painter = painterResource(R.drawable.back_icon),
                                contentDescription = "Return"
                            )
                        }
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Book tid\ntil online fitting",
                            modifier = Modifier,
                            fontSize = 36.sp,
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }

            //Tid
            item() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.clock_icon),
                        contentDescription = "Clock icon",
                        modifier = Modifier
                            .padding(end = 24.dp)
                            .size(30.dp)
                    )

                    Text(
                        text = "Tid: 15 min",
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                    )
                }
            }


            //Sted
            item() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 50.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.video_icon),
                        contentDescription = "Kurv",
                        modifier = Modifier
                            .padding(end = 24.dp)
                            .size(30.dp)
                    )

                    Text(
                        text = "Sted: Teams",
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                    )
                }
            }

            item() {
                //Specialist
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 50.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Fitting specialist:\nChristina Haxholm",
                        modifier = Modifier.padding(end = 24.dp, top = 35.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.christina_booking),
                        contentDescription = "Christina",
                        modifier = Modifier.size(100.dp)
                    )
                }
            }


            //Resten
            item() {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Hvad du skal bruge",
                        modifier = Modifier.padding(bottom = 20.dp),
                        fontSize = 20.sp
                    )

                    Text(
                        text = "1. Målebånd", modifier = Modifier.padding(bottom = 10.dp)
                    )

                    Text(
                        text = "2. Din bedste BH"
                    )

                    Image(
                        painter = painterResource(R.drawable.info_square),
                        contentDescription = "Info icon",
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .size(15.dp)
                    )
                }
            }

            //Calender
            item() {
                val calenderSquare = R.drawable.calender_square_2

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Vælg en dag", fontSize = 20.sp
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.calender_icon),
                            contentDescription = "Calender",
                            modifier = Modifier
                                .size(350.dp)
                        )

                        //Calendar days
                        Column(
                            modifier = Modifier
                                .size(350.dp)
                                .padding(top = 150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)
                                    )
                                    Text(
                                        text = "1"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "2"
                                    )
                                }
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "3"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "4"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "5"
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)
                                    )

                                    Text(
                                        text = "1"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "2"
                                    )
                                }
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "3"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "4"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "5"
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)
                                    )

                                    Text(
                                        text = "1"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "2"
                                    )
                                }
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "3"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "4"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "5"
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)
                                    )

                                    Text(
                                        text = "1"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "2"
                                    )
                                }
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "3"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "4"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "5"
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)
                                    )

                                    Text(
                                        text = "1"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "2"
                                    )
                                }
                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "3"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "4"
                                    )
                                }

                                Box(
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(calenderSquare),
                                        contentDescription = "Calender Square",
                                        modifier = Modifier
                                            .padding(start = 7.dp, end = 7.dp)
                                            .size(50.dp)

                                    )

                                    Text(
                                        text = "5"
                                    )
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}