package com.example.zooappgamesapp.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zooappgamesapp.models.gameList
import com.example.zooappgamesapp.ui.screens.GameScreen
import com.example.zooappgamesapp.ui.screens.HomeScreen

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable(route = "home"){
            HomeScreen(onGameSelected = {game ->
                navController.navigate("game/${game.name}")
            })
        }
        composable("game/{gameName}") { backStackEntry ->
            val gameName = backStackEntry.arguments?.getString("gameName")
            val selectedGame = gameList.first { it.name == gameName }
            GameScreen(game = selectedGame)
        }
    }
}
