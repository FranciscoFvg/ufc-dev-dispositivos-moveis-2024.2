package com.example.profileapp

import android.media.Rating
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)
        val rating = findViewById<RatingBar>(R.id.ratingBar)

        rating.setOnClickListener {
            if (rating.rating > 2){
                rating.rating -= 1
            }else{
                rating.rating += 1
            }

        }

        // adicionando interatividade
        profileImage.setOnClickListener {
            Toast.makeText(this, "Perfil completo de José Aldo", Toast.LENGTH_SHORT).show()

            // Definição de perfil
            nameText.text = "José Aldo"
            descriptionText.text = "Desenvolvedor mobile com 50 anos de experiência."
            currentJobText.text = "Emprego atual: Desenvolvedor Mobile do Whatsapp"
            rating.rating = 4.9F

            // lista de experiencias
            val experiencias = listOf(
                "Criador da Uber - dev mobile",
                "Facebook - dev web",
                "Linkedin - dev web",
            )

            // mudança dinamica da lista de experiencias
            for (exp in experiencias){
                val textView = TextView(this)
                textView.text = exp
                textView.textSize = 16f
                experienceLayout.addView(textView)
            }

        }


    }
}