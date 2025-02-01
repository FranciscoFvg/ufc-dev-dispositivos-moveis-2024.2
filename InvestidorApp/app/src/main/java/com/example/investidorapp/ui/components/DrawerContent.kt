package com.example.falaai.ui.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.Job

@Composable
fun DrawerContent(
    navController: NavHostController,
    context: Context,
    onCloseDrawer: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 20.dp)
            .background(MaterialTheme.colorScheme.surface),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 64.dp, 16.dp, 16.dp)
        ) {
            Text(
                text = "Menu",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Divider(thickness = 2.dp, color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Investimentos",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("invests")
                        onCloseDrawer()
                    }
                    .padding(vertical = 8.dp)
            )
            Text(
                text = "Sobre",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .clickable {
                        navController.navigate("about")
                        onCloseDrawer()
                    }
                    .padding(vertical = 8.dp)
            )
            Text(
                text = "Sair",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier
                    .clickable {
                        Toast
                            .makeText(context, "Saindo da aplicação...", Toast.LENGTH_SHORT)
                            .show()
                    }
                    .padding(vertical = 8.dp)
                    .weight(1f)
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Versão 0.0.0.1",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
        }
    }
}
