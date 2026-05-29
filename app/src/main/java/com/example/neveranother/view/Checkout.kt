package com.example.neveranother.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.neveranother.ui.theme.Salmon
import com.example.neveranother.ui.theme.White
import com.example.neveranother.viewModel.MeasurementPage
import com.example.neveranother.viewModel.MeasurementVM

// Mathias
//Mathias
@Composable
fun CheckoutPopUp(viewModel: MeasurementVM
){

    var showCheckoutDialog by remember { mutableStateOf(true) }

    if (showCheckoutDialog) {
        AlertDialog(
            containerColor = White,
            onDismissRequest = { showCheckoutDialog = false },
            text = { OrderConfirmationScreen(viewModel) },
            confirmButton = {
                Button(
                    onClick = {
                        showCheckoutDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFEE9981)
                    )
                ) {
                    Text("OK")
                }
            },

        )
    }
}

@Composable
fun OrderConfirmationScreen(viewModel: MeasurementVM) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Tak for din ordre",
            fontSize = 28.sp,
            color = Salmon,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(48.dp))

        Text(
            text = "Ordre",
            fontSize = 28.sp,
            color = Salmon,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Bra no. 1\n" +
                    "antal: ${viewModel.quantityOfProduct}\n" +
                    "Farve: ${viewModel.productColor}\n" +
                    "Øvre omkreds: ${viewModel.upperCircumference}\n" +
                    "Nedre omkreds: ${viewModel.lowerCircumference}\n" +
                    "Bryst højde: ${viewModel.breastHeight}\n" +
                    "Bryst bredde: ${viewModel.breastWidth}\n",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}