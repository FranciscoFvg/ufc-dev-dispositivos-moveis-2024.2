package com.example.zooappgamesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp  
import com.example.zooappgamesapp.models.Game

@Composable
fun GameListItem(game: Game, onGameSelected: (Game) -> Unit) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = game.imageRes),
                    contentDescription = "${game.name} Image",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column { 
                    Text(
                        text = game.name,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = game.description,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = game.genre,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Data de Lançamento: ${game.releaseDate}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { onGameSelected(game) },
            ) {
                Text(text = "Mais sobre ${game.name}")
            }
        }
    }
}