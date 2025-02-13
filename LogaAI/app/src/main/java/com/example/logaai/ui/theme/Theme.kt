package com.example.logaai.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF1E8078),        // Azul-esverdeado escuro
    onPrimary = Color(0xFFE0F7F5),      // Verde-água claro (para texto legível em `primary`)
    secondary = Color(0xFF8A817C),      // Bege amarronzado
    tertiary = Color(0xFFF4A261),       // Laranja queimado suave
    surface = Color(0xFF121212),        // Preto para fundo principal
    onSurface = Color(0xFFD3CAC4)       // Bege claro (para texto legível em `surface`)
)
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF3DBBAF),        // Azul-esverdeado claro
    onPrimary = Color(0xFF00332E),      // Azul-esverdeado bem escuro (para texto legível em `primary`)
    secondary = Color(0xFFD3CAC4),      // Bege suave
    tertiary = Color(0xFFFFB87A),       // Laranja queimado claro
    surface = Color(0xFFFFFFFF),        // Branco para fundo principal
    onSurface = Color(0xFF1E8078)       // Azul-esverdeado escuro (para texto em `surface`)
)

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */


@Composable
fun LogaAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}