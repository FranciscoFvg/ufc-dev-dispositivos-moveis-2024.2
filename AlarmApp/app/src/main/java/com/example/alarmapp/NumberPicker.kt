package com.example.alarmapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource

@Composable
fun NumberPicker(
    value: Int,
    range: IntRange,
    onValueChange: (Int) -> Unit
) {
    var currentValue by remember { mutableStateOf(value) }

    Row {
        IconButton(onClick = {
            if (currentValue > range.first) {
                currentValue--
                onValueChange(currentValue)
            }
        }) {
            Icon(painter = painterResource(android.R.drawable.arrow_down_float), contentDescription = "Decrement")
        }
        Text(text = currentValue.toString())
        IconButton(onClick = {
            if (currentValue < range.last) {
                currentValue++
                onValueChange(currentValue)
            }
        }) {
            Icon(painter = painterResource(android.R.drawable.arrow_up_float), contentDescription = "Increment")
        }
    }
}

