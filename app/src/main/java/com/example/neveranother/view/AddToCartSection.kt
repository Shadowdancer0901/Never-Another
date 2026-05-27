package com.example.neveranother.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AddToCartSection(hasMeasurement: Boolean, navController: NavController) {
    var quantity by remember { mutableStateOf(1) }
    var showMeasurementDialog by remember { mutableStateOf(false) }

    // start pop up

    // Popup hvis measurements mangler
    if (showMeasurementDialog) {
        AlertDialog(
            onDismissRequest = { showMeasurementDialog = false },
            title = { Text("Mål mangler") },
            text = { Text("Du skal indtaste dine mål inden du kan tilføje til kurven.") },
            confirmButton = {
                Button(
                    onClick = {
                        showMeasurementDialog = false
                        navController.navigate(MeasurementPage)  // send til measurement screen
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFEE9981)
                    )
                ) {
                    Text("Indtast mål")
                }
            },
            dismissButton = {
                TextButton(onClick = { showMeasurementDialog = false }) {
                    Text("Annuller", color = Color(0xFFEE9981))
                }
            }
        )
    }


    // slut pop up

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

        Button(
            onClick = { quantity = 1
                if (hasMeasurement) {
                    // TODO: tilføj til kurv logik
                } else {
                    showMeasurementDialog = true  // ✅ vis popup
                }},
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