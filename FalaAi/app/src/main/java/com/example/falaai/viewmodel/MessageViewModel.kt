package com.example.falaai.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.falaai.model.Message
import com.example.falaai.repository.MessageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MessageViewModel (private val messageRepository: MessageRepository): ViewModel() {
    private val _messages = MutableStateFlow<List<Message>>(emptyList())
    val messages: StateFlow<List<Message>> = _messages.asStateFlow()

    init {
        viewModelScope.launch {
            messageRepository.allMessages.collect { messages ->
                _messages.value = messages
            }
        }
    }

    fun addMessage(content: String) {
        viewModelScope.launch {
            val newMessage = Message(content = content, timestamp = System.currentTimeMillis())
            _messages.value += newMessage
            messageRepository.insertMessage(content)
        }
    }
}