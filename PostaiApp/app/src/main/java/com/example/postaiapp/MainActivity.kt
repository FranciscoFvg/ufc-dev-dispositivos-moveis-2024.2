package com.example.postaiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.postaiapp.ui.components.DrawerContent
import com.example.postaiapp.ui.components.TopBar
import com.example.postaiapp.ui.screens.AboutScreen
import com.example.postaiapp.ui.screens.PostScreen
import com.example.postaiapp.ui.screens.UserScreen
import com.example.postaiapp.ui.theme.PostaiAppTheme
import com.example.postaiapp.ui.viewModel.PostViewModel
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    private val viewModel = PostViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val context = LocalContext.current
            val isDarkTheme = remember { mutableStateOf(false) }
            PostaiAppTheme (darkTheme = isDarkTheme.value) {
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    gesturesEnabled = true,
                    drawerContent = {
                        DrawerContent(navController, viewModel, context, onCloseDrawer = { scope.launch { drawerState.close() } })
                    },
                    content = {
                        Scaffold (
                            topBar = {
                                TopBar(
                                    onThemeToggle = { isDarkTheme.value = !isDarkTheme.value},
                                    onOpenDrawer = {scope.launch { drawerState.open() } },
                                )
                            }
                        ) { innerPadding ->
                            NavHost(
                                navController = navController,
                                startDestination = "users",
                                modifier = Modifier.padding(innerPadding),
                            ){
                                composable("users") {
                                    UserScreen(navController, viewModel, context)
                                }
                                composable("posts/{userId}") { backStackEntry ->
                                    val userId = backStackEntry.arguments?.getString("userId")
                                    PostScreen(navController, viewModel, context, userId!!.toInt())
                                }
                                composable("about"){
                                    AboutScreen()
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}
