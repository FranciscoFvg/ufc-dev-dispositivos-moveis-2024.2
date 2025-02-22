package com.example.investidorapp

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.falaai.ui.components.DrawerContent
import com.example.falaai.ui.components.TopBar
import com.example.investidorapp.ui.theme.InvestidorAppTheme
import com.example.investidorapp.ui.view.AboutScreen
import com.example.investidorapp.ui.view.InvestidorScreen
import com.example.investidorapp.viewmodel.InvestimentosViewModel
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                101
            )
        }

        setContent {
            val viewModel: InvestimentosViewModel = viewModel()

            val navController = rememberNavController()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val context = LocalContext.current
            val isDarkTheme = remember { mutableStateOf(false) }



            InvestidorAppTheme (darkTheme = isDarkTheme.value) {
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    gesturesEnabled = true,
                    drawerContent = {
                        DrawerContent(navController, context, onCloseDrawer = { scope.launch { drawerState.close() } })
                    },
                    content = {
                        val snackbarHostState = remember { SnackbarHostState() }
                        Scaffold (
                            snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
                            topBar = {
                                TopBar(
                                    onThemeToggle = { isDarkTheme.value = !isDarkTheme.value},
                                    onOpenDrawer = {scope.launch { drawerState.open() } },
                                )
                            }
                        ) { innerPadding ->
                            NavHost(
                                navController = navController,
                                startDestination = "invests",
                                modifier = Modifier.padding(innerPadding),
                            ){
                                composable("invests") {
                                    InvestidorScreen(viewModel, snackbarHostState)
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
