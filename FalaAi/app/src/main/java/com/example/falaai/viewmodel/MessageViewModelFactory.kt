package com.example.falaai.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.falaai.repository.MessageRepository

class MessageViewModelFactory (private val messageRepository: MessageRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MessageViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MessageViewModel(messageRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}