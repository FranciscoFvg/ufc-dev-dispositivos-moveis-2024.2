package com.example.falaai.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/falaai/viewmodel/MessageViewModel;", "Landroidx/lifecycle/ViewModel;", "messageRepository", "Lcom/example/falaai/repository/MessageRepository;", "(Lcom/example/falaai/repository/MessageRepository;)V", "_messages", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/falaai/model/Message;", "messages", "Lkotlinx/coroutines/flow/StateFlow;", "getMessages", "()Lkotlinx/coroutines/flow/StateFlow;", "addMessage", "", "content", "", "app_debug"})
public final class MessageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.falaai.repository.MessageRepository messageRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.falaai.model.Message>> _messages = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.falaai.model.Message>> messages = null;
    
    public MessageViewModel(@org.jetbrains.annotations.NotNull
    com.example.falaai.repository.MessageRepository messageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.falaai.model.Message>> getMessages() {
        return null;
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
}