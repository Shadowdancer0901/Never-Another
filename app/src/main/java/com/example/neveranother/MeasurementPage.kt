package com.example.neveranother

import android.content.Context
import androidx.annotation.OptIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import androidx.media3.common.MediaItem.fromUri
import androidx.media3.common.util.Util
import androidx.media3.datasource.DefaultDataSourceFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.ui.PlayerView
import com.example.neveranother.ui.theme.Gray
import com.example.neveranother.ui.theme.Salmon
import com.example.neveranother.ui.theme.White

@Composable
fun MeasurementPage() {

    //Carousel values
    val itemCount = MeasurementpagePictures.size
    val loops = 1000
    val virtualCount = itemCount * loops
    val initialPage = (virtualCount / 2 - ((virtualCount / 2) % itemCount))
    val pagerState = rememberPagerState(initialPage = initialPage, pageCount = { virtualCount })

    val openDialog = remember { mutableIntStateOf(0) }
    val cContext = LocalContext.current

    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = White)
            { (MeasurementNavbar()) }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val neverAnotherLogo = painterResource(R.drawable.never_another_logo)
            Image(
                painter = neverAnotherLogo,
                contentDescription = "Never Another Logo",
                modifier = Modifier
                    .height(80.dp)
                    .width(400.dp)
            )

            //Maja's carousel template
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .width(364.dp)
                    .padding(top = 5.dp, bottom = 5.dp)
            ) { i ->
                val actualIndex = i % itemCount
                val MkList = MeasurementpagePictures[actualIndex]
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = MkList.imageRes),
                        contentDescription = MkList.description,
                        modifier = Modifier
                            .width(MkList.pictureWidth)
                            .height(MkList.pictureHeight)
                    )
                }
            }

            Text("Mål",
                fontSize = 32.sp,
                modifier = Modifier.padding(top = 6.dp))

            Row(
                modifier = Modifier
                    .padding(14.dp)
            ) {

                //Used this link to style our OutlinedTextField:
                // https://stackoverflow.com/questions/66453775/how-to-change-the-outline-color-of-outlinedtextfield-from-jetpack-compose
                OutlinedTextField(
                    state = rememberTextFieldState(),
                    textStyle = TextStyle(fontSize = 10.sp),
                    label = { Text("Øvre omkreds", fontSize = 8.sp) },
                    placeholder = { Text("XX", fontSize = 5.sp, color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon
                    )
                )

                val firstInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = firstInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 50.dp)
                        .size(15.dp)
                        .clickable { openDialog.intValue = 1 },
                    alignment = Alignment.Center
                )

                OutlinedTextField(
                    state = rememberTextFieldState(),
                    textStyle = TextStyle(fontSize = 10.sp),
                    label = { Text("Nedre omkreds", fontSize = 8.sp) },
                    placeholder = { Text("XX", fontSize = 5.sp, color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon
                    )
                )

                val secondInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = secondInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp)
                        .size(15.dp)
                        .clickable { openDialog.intValue = 2 },
                    alignment = Alignment.Center
                )
            }

            Row(
                modifier = Modifier
                    .padding(24.dp)
            ) {
                OutlinedTextField(
                    state = rememberTextFieldState(),
                    textStyle = TextStyle(fontSize = 10.sp),
                    label = { Text("Nedre omkreds", fontSize = 8.sp) },
                    placeholder = { Text("XX", fontSize = 5.sp, color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon
                    )
                )

                val thirdInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = thirdInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp, end = 50.dp)
                        .size(15.dp)
                        .clickable { openDialog.intValue = 3 },
                    alignment = Alignment.Center
                )

                OutlinedTextField(
                    state = rememberTextFieldState(),
                    textStyle = TextStyle(fontSize = 10.sp),
                    label = { Text("Nedre omkreds", fontSize = 8.sp) },
                    placeholder = { Text("XX", fontSize = 5.sp, color = Gray) },
                    modifier = Modifier
                        .size(100.dp, 50.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Salmon,
                        unfocusedTextColor = Salmon
                    )
                )

                val forthInfoIcon = painterResource(R.drawable.info_icon)
                Image(
                    painter = forthInfoIcon,
                    contentDescription = "Information",
                    modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp)
                        .size(15.dp)
                        .clickable { openDialog.intValue = 4 },
                    alignment = Alignment.Center
                )
            }

            when (openDialog.intValue) {
                1 -> {
                    PopupFunction(
                        cContext,
                        "https://neveranother.dk/cdn/shop/videos/c/vp/0e5fa048aa2d4be98a4d6a43dbc8cf1e/0e5fa048aa2d4be98a4d6a43dbc8cf1e.HD-1080p-2.5Mbps-45153518.mp4?v=0"
                    )
                }

                2 -> {
                    PopupFunction(
                        cContext,
                        "https://neveranother.dk/cdn/shop/videos/c/vp/e1ae0f9b502042e79995107cf269ac08/e1ae0f9b502042e79995107cf269ac08.HD-1080p-2.5Mbps-45153519.mp4?v=0"
                    )
                }

                3 -> {
                    PopupFunction(
                        cContext,
                        "https://neveranother.dk/cdn/shop/videos/c/vp/9750bff2d3954cf49bc0829307df8a5c/9750bff2d3954cf49bc0829307df8a5c.HD-1080p-2.5Mbps-45153520.mp4?v=0"
                    )
                }

                4 -> {
                    PopupFunction(
                        cContext,
                        "https://neveranother.dk/cdn/shop/videos/c/vp/15e37945865649c6ad85f73d25baa26e/15e37945865649c6ad85f73d25baa26e.HD-1080p-2.5Mbps-45153521.mp4?v=0"
                    )
                }

                //Brugt dette link til at lave underline til Text element:
                // https://developer.android.com/develop/ui/compose/text/style-text

                //Brugt dette link til at lave style knappen:
                // https://kotlinandroid.org/android-jetpack-compose-set-button-background-color/
                else -> {
                    Text("Usikker på størrelsen?", fontSize = 8.sp)
                    Text(
                        "Bestil free fitting",
                        fontSize = 8.sp,
                        textDecoration = TextDecoration.Underline
                    )

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
                }
            }
        }
    }
}

//Chris
@OptIn(androidx.media3.common.util.UnstableApi::class)
@Composable
fun PopupFunction(context: Context, url: String) {

    Box() {
        val popupWidth = 500.dp
        val popupHeight = 500.dp

        //Brugt dette link til at lave popup feature:
        //https://www.geeksforgeeks.org/kotlin/popup-window-in-android-using-jetpack-compose/
        Popup(
            alignment = Alignment.Center,
            properties = PopupProperties()
        ) {
            Box(
                modifier = Modifier
                    .size(popupWidth, popupHeight)
                    .background(Salmon)
                    .border(1.dp, color = Color.Black, RoundedCornerShape(10.dp))
            ) {

                //Brugt dette link til at tilføje video:
                //https://www.geeksforgeeks.org/kotlin/create-exoplayer-videoview-in-android-jetpack-compose/
                Column() {

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
                        })
                }
            }
        }
    }
}