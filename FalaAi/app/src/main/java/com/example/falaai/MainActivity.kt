package com.example.falaai

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.falaai.data.local.database.AppDatabase
import com.example.falaai.repository.MessageRepository
import com.example.falaai.ui.components.DrawerContent
import com.example.falaai.ui.components.TopBar
import com.example.falaai.ui.theme.FalaAiTheme
import com.example.falaai.ui.view.AboutScreen
import com.example.falaai.ui.view.ChatScreen
import com.example.falaai.viewmodel.MessageViewModel
import com.example.falaai.viewmodel.MessageViewModelFactory
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "messages_database"
        ).fallbackToDestructiveMigration().build()

        val messageRepository = MessageRepository(db.messageDao())

        setContent {
            val navController = rememberNavController()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            val scope = rememberCoroutineScope()
            val context = LocalContext.current
            val isDarkTheme = remember { mutableStateOf(false) }

            FalaAiTheme (darkTheme = isDarkTheme.value) {
                val viewModel: MessageViewModel = viewModel(factory = MessageViewModelFactory(messageRepository))
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    gesturesEnabled = true,
                    drawerContent = {
                        DrawerContent(navController, context, onCloseDrawer = { scope.launch { drawerState.close() } })
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
                                startDestination = "chat",
                                modifier = Modifier.padding(innerPadding),
                            ){
                                composable("chat") {
                                    ChatScreen(viewModel)
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
