package com.example.zooappgamesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.zooappgamesapp.models.Game

@ExperimentalMaterial3Api
@Composable
fun GameScreen(game: Game) {
    Scaffold (
        topBar = {
            TopAppBar(title = { Text(game.name) })
        },
    ) {paddingValues ->
       Column (
           modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp),
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Image(
               painter = painterResource(id = game.imageRes),
               contentDescription = "${game.name} Image",
               modifier = Modifier
                   .size(200.dp)
                   .clip(CircleShape)
                   .padding(16.dp)
           )
           Spacer(modifier = Modifier.height(16.dp))
           Text(
               text = game.genre,
               style = MaterialTheme.typography.titleMedium
           )
           Spacer(modifier = Modifier.height(16.dp))
           Text(
               text = game.description,
               style = MaterialTheme.typography.bodyMedium
           )
           Spacer(modifier = Modifier.height(16.dp))
           Text(
               text = "Data de Lançamento: ${game.releaseDate}",
               style = MaterialTheme.typography.bodySmall,
               color = MaterialTheme.colorScheme.secondary
           )
       }
    }
}