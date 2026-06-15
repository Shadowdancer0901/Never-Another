package com.example.neveranother.view

import android.content.Context
import androidx.annotation.OptIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem.fromUri
import androidx.media3.common.util.UnstableApi
import androidx.media3.common.util.Util
import androidx.media3.datasource.DefaultDataSourceFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.ui.PlayerView
import androidx.navigation.NavController
import com.example.neveranother.R
import com.example.neveranother.ui.theme.Black
import com.example.neveranother.ui.theme.Gray
import com.example.neveranother.ui.theme.Salmon
import com.example.neveranother.ui.theme.White
import com.example.neveranother.viewModel.BookingPage
import com.example.neveranother.viewModel.PngCaller
import com.example.neveranother.viewModel.MeasurementPage
import com.example.neveranother.viewModel.MeasurementViewModel
import com.example.neveranother.viewModel.ProductPage

//Chris
@Composable
fun MeasurementPage(
    navController: NavController,
    measurementViewModel: MeasurementViewModel,
    pngCaller: PngCaller = viewModel()
    ){

    //Carousel values
    val itemCount = pngCaller.MeasurementpageCarouselPictures.size
    val loops = 1000
    val virtualCount = itemCount * loops
    val initialPage = (virtualCount / 2 - ((virtualCount / 2) % itemCount))
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { virtualCount })

    //Info video values
    val openDialog = remember { mutableIntStateOf(0) }
    val cContext = LocalContext.current

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White)
            { (MeasurementNavbar(navController)) }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .background(White)
                .padding(innerPadding)
                ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item{
                val neverAnotherLogo = painterResource(R.drawable.never_another_logo)

                Image(
                    painter = neverAnotherLogo,
                    contentDescription = "Never Another Logo",
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp)
                )
            }

            //Maja's carousel template
            item{
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .width(364.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) { i ->
                    val actualIndex = i % itemCount
                    val MkList = pngCaller.MeasurementpageCarouselPictures[actualIndex]

                    //Knapper = Chris, Image = Maja
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                        ){
                            Text(
                                text = "<"
                            )
                        }

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                        ){
                            Text(
                                text = ">"
                            )
                        }

                        Image(
                            painter = painterResource(id = MkList.imageRes),
                            contentDescription = MkList.description,
                            modifier = Modifier
                                .width(MkList.pictureWidth)
                                .height(MkList.pictureHeight)
                        )
                    }
                }



                Text(
                    "Mål",
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 6.dp)
                )
            }


            item{
                Row(
                    modifier = Modifier
                        .padding(14.dp)
                ) {
                    val icon = painterResource(R.drawable.info_icon)

                    //Used this link to style our OutlinedTextField:
                    // https://stackoverflow.com/questions/66453775/how-to-change-the-outline-color-of-outlinedtextfield-from-jetpack-compose
                    OutlinedTextField(
                        value = measurementViewModel.upperCircumference,
                        onValueChange = {
                            if (it.matches(Regex("^\\d*\\.?\\d{0,2}$")) || it.isEmpty() ) //har ikke selv skrevet regex, men den betyder at der kun må være tal og max 2 efter "."
                            {
                                measurementViewModel.upperCircumference = it
                            }
                        },
                        textStyle = TextStyle(fontSize = 16.sp),
                        label = { Text("Øvre omkreds", fontSize = 15.sp) },
                        placeholder = { Text("XX", fontSize = 14.sp, color = Gray) },
                        modifier = Modifier
                            .size(150.dp, 60.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Salmon,
                            unfocusedTextColor = Salmon
                        )
                    )


                    Image(
                        painter = icon,
                        contentDescription = "Information",
                        modifier = Modifier
                            .padding(top = 20.dp, start = 5.dp, end = 20.dp)
                            .size(15.dp)
                            .clickable { openDialog.intValue = 1 },
                        alignment = Alignment.Center
                    )

                    OutlinedTextField(
                        value = measurementViewModel.lowerCircumference,
                        onValueChange = {
                            if (it.matches(Regex("^\\d*\\.?\\d{0,2}$")) || it.isEmpty() ) //har ikke selv skrevet regex, men den betyder at der kun må være tal og max 2 efter "."
                            {
                                measurementViewModel.lowerCircumference = it
                            }
                        },
                        textStyle = TextStyle(fontSize = 16.sp),
                        label = { Text("Nedre omkreds", fontSize = 15.sp) },
                        placeholder = { Text("XX", fontSize = 14.sp, color = Gray) },
                        modifier = Modifier
                            .size(150.dp, 60.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Salmon,
                            unfocusedTextColor = Salmon
                        )
                    )


                    Image(
                        painter = icon,
                        contentDescription = "Information",
                        modifier = Modifier
                            .padding(top = 20.dp, start = 5.dp)
                            .size(15.dp)
                            .clickable { openDialog.intValue = 2 },
                        alignment = Alignment.Center
                    )
                }
            }

            item{
                Row(
                    modifier = Modifier
                        .padding(24.dp)
                ) {
                    val icon = painterResource(R.drawable.info_icon)
                    OutlinedTextField(
                        value = measurementViewModel.breastHeight,
                        onValueChange = {
                            if (it.matches(Regex("^\\d*\\.?\\d{0,2}$")) || it.isEmpty() ) //har ikke selv skrevet regex, men den betyder at der kun må være tal og max 2 efter "."
                            {
                                measurementViewModel.breastHeight= it
                            }
                        },
                        textStyle = TextStyle(fontSize = 16.sp),
                        label = { Text("Bryst højde", fontSize = 15.sp) },
                        placeholder = { Text("XX", fontSize = 14.sp, color = Gray) },
                        modifier = Modifier
                            .size(150.dp, 60.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Salmon,
                            unfocusedTextColor = Salmon
                        )
                    )


                    Image(
                        painter = icon,
                        contentDescription = "Information",
                        modifier = Modifier
                            .padding(top = 20.dp, start = 5.dp, end = 20.dp)
                            .size(15.dp)
                            .clickable { openDialog.intValue = 3 },
                        alignment = Alignment.Center
                    )

                    OutlinedTextField(
                        value = measurementViewModel.breastWidth,
                        onValueChange = {
                            if (it.matches(Regex("^\\d*\\.?\\d{0,2}$")) || it.isEmpty() ) //har ikke selv skrevet regex, men den betyder at der kun må være tal og max 2 efter "."
                            {
                                measurementViewModel.breastWidth= it
                            }
                        },
                        textStyle = TextStyle(fontSize = 16.sp),
                        label = { Text("Bryst bredde", fontSize = 15.sp) },
                        placeholder = { Text("XX", fontSize = 14.sp, color = Gray) },
                        modifier = Modifier
                            .size(150.dp, 60.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Salmon,
                            unfocusedTextColor = Salmon
                        )
                    )


                    Image(
                        painter = icon,
                        contentDescription = "Information",
                        modifier = Modifier
                            .padding(top = 20.dp, start = 5.dp)
                            .size(15.dp)
                            .clickable { openDialog.intValue = 4 },
                        alignment = Alignment.Center
                    )
                }
            }

            item{
                when (openDialog.intValue) {
                    1 -> {
                        PopupFunction(
                            cContext,
                            "https://neveranother.dk/cdn/shop/videos/c/vp/0e5fa048aa2d4be98a4d6a43dbc8cf1e/0e5fa048aa2d4be98a4d6a43dbc8cf1e.HD-1080p-2.5Mbps-45153518.mp4?v=0",
                            navController
                        )
                    }

                    2 -> {
                        PopupFunction(
                            cContext,
                            "https://neveranother.dk/cdn/shop/videos/c/vp/e1ae0f9b502042e79995107cf269ac08/e1ae0f9b502042e79995107cf269ac08.HD-1080p-2.5Mbps-45153519.mp4?v=0",
                            navController
                        )
                    }

                    3 -> {
                        PopupFunction(
                            cContext,
                            "https://neveranother.dk/cdn/shop/videos/c/vp/9750bff2d3954cf49bc0829307df8a5c/9750bff2d3954cf49bc0829307df8a5c.HD-1080p-2.5Mbps-45153520.mp4?v=0",
                            navController
                        )
                    }

                    4 -> {
                        PopupFunction(
                            cContext,
                            "https://neveranother.dk/cdn/shop/videos/c/vp/15e37945865649c6ad85f73d25baa26e/15e37945865649c6ad85f73d25baa26e.HD-1080p-2.5Mbps-45153521.mp4?v=0",
                            navController
                        )
                    }

                    //Brugt dette link til at lave underline til Text element:
                    // https://developer.android.com/develop/ui/compose/text/style-text

                    //Brugt dette link til at lave style knappen:
                    // https://kotlinandroid.org/android-jetpack-compose-set-button-background-color/
                    else -> {
                        Text("", fontSize = 8.sp)
                        TextButton(
                            onClick = {navController.navigate(BookingPage)}
                        ){
                            Text(
                                text = "Usikker på størrelsen?\nBestil free fitting",
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                textDecoration = TextDecoration.Underline,
                                color = Black
                            )
                        }

                        //Brugt dette link til at lave style knappen:
                        // https://kotlinandroid.org/android-jetpack-compose-set-button-background-color/
                        Button(
                            onClick = { navController.navigate(ProductPage)
                            }, modifier = Modifier
                                .padding(24.dp)
                                .size(width = 120.dp, height = 50.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Salmon)
                        ) {
                            Text("Bestil", fontSize = 20.sp)
                        }
                    }
                }
            }

        }
    }
}

//Chris
@OptIn(UnstableApi::class)
@Composable
fun PopupFunction(context: Context, url: String, navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val popupWidth = 500.dp
        val popupHeight = 300.dp

        //Brugt dette link til at lave popup feature:
        //https://www.geeksforgeeks.org/kotlin/popup-window-in-android-using-jetpack-compose/
        Popup(
            alignment = Alignment.BottomCenter,
            properties = PopupProperties()

        ) {


            Box(
                modifier = Modifier
                    .fillMaxSize()

            ) {

                //Brugt dette link til at tilføje video:
                //https://www.geeksforgeeks.org/kotlin/create-exoplayer-videoview-in-android-jetpack-compose/
                Column() {
                    TextButton(
                        onClick = { navController.navigate(MeasurementPage) },
                        modifier = Modifier
                            .padding(top = 100.dp)
                            .size(height = 200.dp, width = 500.dp)
                    ) {
                    }


                    val cAndroidX = remember(context) {
                        ExoPlayer.Builder(context).build().apply() {
                            val dataSourceFactory = DefaultDataSourceFactory(
                                context,
                                Util.getUserAgent(context, context.packageName)
                            )
                            val source =
                                ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(
                                    fromUri(url)
                                )
                            prepare(source)

                        }
                    }

                    AndroidView(
                        modifier = Modifier.size(popupWidth, popupHeight),
                        factory = { context ->
                            PlayerView(context).apply {
                                player = cAndroidX
                            }
                        }
                    )

                    //Brugt denne side til DisposableEffect funktion
                    //https://levelup.gitconnected.com/stop-using-playerview-in-compose-media3-playersurface-done-right-8c0423c9723a
                    DisposableEffect(Unit) {
                        onDispose {
                            cAndroidX.release()
                        }
                    }


                    TextButton(
                        onClick = {
                            navController.navigate(MeasurementPage)
                        },
                        modifier = Modifier
                            .padding(bottom = 50.dp)
                            .size(height = 200.dp, width = 500.dp)
                    ) {
                    }
                }
            }
        }
    }
}