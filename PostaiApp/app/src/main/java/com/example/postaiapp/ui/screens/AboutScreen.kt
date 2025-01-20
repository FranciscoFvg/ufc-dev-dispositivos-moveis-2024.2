package com.example.postaiapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun AboutScreen() {
    Column (modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Sobre",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Entre as alterações realizadas no appPost, as seguintes alterações foram feitas:\n\n" +
                    "1. Mudando o nome da aplicação para PostAI;\n" +
                    "2. Adicionando o menu lateral;\n" +
                    "3. Adicionando mudança de temas;\n" +
                    "4. Adicionando tela de sobre;\n" +
                    "5. Adicionando navegação entre um card de usuários e uma tela com seus posts;\n" +
                    "6. Adicionando navegação lateral para os posts do último usuário clicado;\n" +
                    "7. Mudando o esquema de cores do app;\n" +
                    "8. Mudando a aparência das telas;\n" +
                    "9. O APK está na pasta build do projeto (build/outputs/apk/debug);\n",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}