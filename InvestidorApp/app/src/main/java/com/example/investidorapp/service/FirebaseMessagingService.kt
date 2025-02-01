package com.example.investidorapp.service

import com.example.investidorapp.utils.ShowNotification
import com.google.firebase.messaging.RemoteMessage
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        remoteMessage.notification?.let {
            ShowNotification( this, it.title, it.body)
        }
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        println("Token para o dispositivo: $token")
    }


}
