package com.example.falaai.repository

import com.example.falaai.data.local.dao.MessageDao
import com.example.falaai.model.Message
import kotlinx.coroutines.flow.Flow

class MessageRepository (private val messageDao: MessageDao) {
    val allMessages: Flow<List<Message>> = messageDao.getAllMessages()

    suspend fun insertMessage(content : String) {
        messageDao.insertMessage(Message(content = content, timestamp = System.currentTimeMillis()))
    }
}