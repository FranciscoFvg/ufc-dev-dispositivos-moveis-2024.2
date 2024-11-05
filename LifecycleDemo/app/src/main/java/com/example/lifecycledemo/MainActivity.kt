package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifecycleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifecycleDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Victor, exemplo de lifecycle criado por Vitor Gomes rodando",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        // Mensagem de log e Toast para execução do onCreate
        Log.d("LifecycleDemo", "onCreate executado")
        Toast.makeText(this, "onCreate executado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()

        // Mensagem de log e Toast para execução do onStart
        Log.d("LifecycleDemo", "onStart executado")
        Toast.makeText(this, "onStart executado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()

        // Mensagem de log e Toast para execução do onResume
        Log.d("LifecycleDemo", "onResume executado")
        Toast.makeText(this, "onResume executado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()

        // Mensagem de log e Toast para execução do onPause
        Log.d("LifecycleDemo", "onPause executado")
        Toast.makeText(this, "onPause executado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()

        // Mensagem de log e Toast para execução do onStop
        Log.d("LifecycleDemo", "onStop executado")
        Toast.makeText(this, "onStop executado", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy(){
        super.onDestroy()

        // Mensagem de log e Toast para execução do onDestroy
        Log.d("LifecycleDemo", "onDestroy executado")
        Toast.makeText(this, "onDestroy executado", Toast.LENGTH_SHORT).show()
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleDemoTheme {
        Greeting("Android")
    }
}