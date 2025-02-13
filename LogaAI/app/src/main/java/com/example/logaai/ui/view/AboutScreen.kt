package com.example.logaai.ui.view

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
            text = "Entre as alterações realizadas no AuthApp, as seguintes alterações foram feitas:\n\n" +
                    "1. Mudando o nome da aplicação para Loga AI;\n" +
                    "2. Adicionando o menu lateral;\n" +
                    "3. Adicionando mudança de temas (Claro/Escuro);\n" +
                    "4. Adicionando tela de sobre;\n" +
                    "5. Mudando o esquema de cores do app;\n" +
                    "6. Implementando checagens para impedir que o usuário acesse o home sem estar logado;\n" +
                    "7. Implementando checagens para determinar quais telas o usuário pode acessar no menu lateral;\n" +
                    "8. O APK está na raiz do projeto (LogaAI/);\n",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}