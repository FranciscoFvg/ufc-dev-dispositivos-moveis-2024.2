package com.example.falaai.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable

@ExperimentalMaterial3Api
@Composable
fun TopBar(
    onThemeToggle: () -> Unit,
    onOpenDrawer: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "FalaAI",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        navigationIcon = {
            IconButton(
                onClick = onOpenDrawer,
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ){
                Icon(Icons.Default.Menu, contentDescription = "Abrir menu")
            }
        },
        actions = {
            IconButton(
                onClick = onThemeToggle,
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Icon(Icons.Default.Star, contentDescription = "Mudar tema")
            }
        }
    )
}

