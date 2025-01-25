package com.example.falaai.ui.view

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
            text = "Entre as alterações realizadas no MsgApp, as seguintes alterações foram feitas:\n\n" +
                    "1. Mudando o nome da aplicação para FalaAI;\n" +
                    "2. Adicionando o menu lateral;\n" +
                    "3. Adicionando mudança de temas (Claro/Escuro);\n" +
                    "4. Adicionando tela de sobre;\n" +
                    "5. Mudando o esquema de cores do app;\n" +
                    "6. Mudando a aparência e organização da tela de chat;\n" +
                    "7. Adicionando exibição de timestamp;\n" +
                    "8. O APK está na pasta build do projeto (build/outputs/apk/debug);\n",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}