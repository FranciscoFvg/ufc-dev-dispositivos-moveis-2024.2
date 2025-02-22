package com.example.crudapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.crudapp.ui.theme.CrudAppTheme

class MainActivity : ComponentActivity() {
    private val viewModel: UserViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CrudAppTheme {
                UserApp(viewModel)
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun UserApp(viewModel: UserViewModel){
    val usuarios by viewModel.users.observeAsState(initial = emptyList())

    var nome by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }

    var usuarioEditando by remember { mutableStateOf<User?>(null) }
    var mensagemErro by remember { mutableStateOf<String?>(null) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "CRUD App")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column (
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {
            Text(
                if (usuarioEditando == null) "Adicionar novo usuário" else "Editar usuário",
                fontWeight = MaterialTheme.typography.headlineSmall.fontWeight,
                modifier = Modifier.padding(16.dp)
            )

            Spacer(modifier = Modifier.padding(16.dp))

            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome") },
                modifier = Modifier.fillMaxSize()
            )

            Spacer(modifier = Modifier.padding(16.dp))

            OutlinedTextField(
                value = idade,
                onValueChange = { idade = it },
                label = { Text("Idade") },
                modifier = Modifier.fillMaxSize(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.padding(8.dp))

        }

    }
}