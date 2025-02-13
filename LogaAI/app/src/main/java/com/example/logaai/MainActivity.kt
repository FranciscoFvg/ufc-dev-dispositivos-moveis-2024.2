package com.example.logaai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.falaai.ui.components.DrawerContent
import com.example.falaai.ui.components.TopBar
import com.example.logaai.data.AuthRepository
import com.example.logaai.ui.theme.LogaAITheme
import com.example.logaai.ui.view.AboutScreen
import com.example.logaai.ui.view.ForgotPasswordScreen
import com.example.logaai.ui.view.HomeScreen
import com.example.logaai.ui.view.LoginScreen
import com.example.logaai.ui.view.RegisterScreen
import com.example.logaai.viewmodel.AuthViewModel
import com.example.logaai.viewmodel.AuthViewModelFactory
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val context = LocalContext.current
            val isDarkTheme = remember { mutableStateOf(false) }

            val repository = AuthRepository()
            val viewModel: AuthViewModel = ViewModelProvider(this, AuthViewModelFactory(repository))[AuthViewModel::class.java]

            LogaAITheme (darkTheme = isDarkTheme.value) {
                val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsState(initial = null)
                var userName by remember { mutableStateOf("Carregando...") }

                LaunchedEffect(currentBackStackEntry) {
                    currentBackStackEntry?.destination?.route?.let { route ->
                        println("Navegou para a rota: $route")
                        viewModel.getUserName { name ->
                            userName = name ?: "Usuário"
                        }
                    }
                }
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    gesturesEnabled = true,
                    drawerContent = {
                        DrawerContent(viewModel, userName,navController, context, onCloseDrawer = { scope.launch { drawerState.close() } })
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
                                startDestination = "login",
                                modifier = Modifier.padding(innerPadding),
                            ){
                                composable("login") {
                                    LoginScreen(viewModel, navController)
                                }
                                composable("register") {
                                    RegisterScreen(viewModel, navController)
                                }
                                composable("home") {
                                    HomeScreen(viewModel, navController)
                                }
                                composable("forgotPassword") {
                                    ForgotPasswordScreen(viewModel, navController)
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
