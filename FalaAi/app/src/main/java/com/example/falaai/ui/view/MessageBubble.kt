package com.example.falaai.ui.view

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MessageBubble(content: String, timestamp: Long, isUserMessage: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isUserMessage) Arrangement.End else Arrangement.Start
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = if (isUserMessage) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceDim,
                    shape = RoundedCornerShape(12.dp)
                )
                .height(48.dp)
                .padding(16.dp)
                .widthIn(max = 250.dp),
        ) {
            Row (
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = content,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = if (isUserMessage) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = formatTimestampToTime(timestamp),
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = if (isUserMessage) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
                    )
                )
            }

        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun formatTimestampToTime(timestamp: Long): String {
    val formatter = DateTimeFormatter.ofPattern("HH:mm")
        .withZone(ZoneId.of("America/Sao_Paulo"))
    return formatter.format(Instant.ofEpochMilli(timestamp))
}