package com.example.investidorapp.viewmodel

import android.Manifest
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.AndroidViewModel
import com.example.investidorapp.MainActivity
import com.example.investidorapp.R
import com.example.investidorapp.model.Investimento
import com.example.investidorapp.utils.ShowNotification
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class InvestimentosViewModel(application: Application) : AndroidViewModel(application) {

    private val database = FirebaseDatabase.getInstance().reference.child("investimentos")

    private val _investimentos = MutableStateFlow<List<Investimento>>(emptyList())
    val investimentos: StateFlow<List<Investimento>> = _investimentos

    init {
        monitorarAlteracoes()
    }

    private fun monitorarAlteracoes() {
        database.addChildEventListener(object : ChildEventListener {
            override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {
                val nome = snapshot.child("nome").getValue(String::class.java) ?: "Desconhecido"
                val valor = snapshot.child("valor").getValue(Int::class.java) ?: 0
                val status = snapshot.child("status").getValue(String::class.java) ?: "Desconhecido"
                Log.d("FirebaseData", "Investimento atualizado: $nome - R$ $valor")

                ShowNotification(getApplication(), "Investimento Atualizado", "$nome agora vale R$ $valor e está $status")

                carregarInvestimentos()
            }

            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                carregarInvestimentos()
            }

            override fun onChildRemoved(snapshot: DataSnapshot) {
                carregarInvestimentos()
            }

            override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {}

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseError", "Erro ao monitorar alterações: ${error.message}")
            }
        })
    }

    private fun carregarInvestimentos() {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val lista = mutableListOf<Investimento>()
                for (item in snapshot.children) {
                    val nome = item.child("nome").getValue(String::class.java) ?: "Desconhecido"
                    val valor = item.child("valor").getValue(Int::class.java) ?: 0
                    val status = item.child("status").getValue(String::class.java) ?: "Desconhecido"
                    lista.add(Investimento(nome, valor, status))
                }
                _investimentos.value = lista
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseError", "Erro ao carregar investimentos: ${error.message}")
            }
        })
    }
}



