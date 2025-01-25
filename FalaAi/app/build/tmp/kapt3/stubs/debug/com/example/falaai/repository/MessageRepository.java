package com.example.falaai.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/falaai/repository/MessageRepository;", "", "messageDao", "Lcom/example/falaai/data/local/dao/MessageDao;", "(Lcom/example/falaai/data/local/dao/MessageDao;)V", "allMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/falaai/model/Message;", "getAllMessages", "()Lkotlinx/coroutines/flow/Flow;", "insertMessage", "", "content", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MessageRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.falaai.data.local.dao.MessageDao messageDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.falaai.model.Message>> allMessages = null;
    
    public MessageRepository(@org.jetbrains.annotations.NotNull
    com.example.falaai.data.local.dao.MessageDao messageDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.falaai.model.Message>> getAllMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertMessage(@org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}