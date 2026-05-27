package com.example.neveranother

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Mathias
@Composable
fun ExpandableSection(itemsList: List<Pair<String, String>>){

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