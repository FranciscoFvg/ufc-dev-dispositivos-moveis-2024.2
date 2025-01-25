package com.example.postaiapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/postaiapp/data/ApiService;", "", "createPost", "Lcom/example/postaiapp/data/model/Post;", "userId", "", "post", "Lcom/example/postaiapp/data/model/CreatePostRequest;", "(ILcom/example/postaiapp/data/model/CreatePostRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUser", "Lcom/example/postaiapp/data/model/User;", "user", "Lcom/example/postaiapp/data/model/UserCreateRequest;", "(Lcom/example/postaiapp/data/model/UserCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "", "postId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "", "getUsers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePost", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.POST(value = "users/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createUser(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.postaiapp.data.model.UserCreateRequest user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.postaiapp.data.model.User> $completion);
    
    @retrofit2.http.GET(value = "users/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.postaiapp.data.model.User>> $completion);
    
    @retrofit2.http.POST(value = "users/{user_id}/posts/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createPost(@retrofit2.http.Path(value = "user_id")
    int userId, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.postaiapp.data.model.CreatePostRequest post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.postaiapp.data.model.Post> $completion);
    
    @retrofit2.http.GET(value = "users/{user_id}/posts/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPosts(@retrofit2.http.Path(value = "user_id")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.postaiapp.data.model.Post>> $completion);
    
    @retrofit2.http.PUT(value = "posts/{post_id}/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updatePost(@retrofit2.http.Path(value = "post_id")
    int postId, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.postaiapp.data.model.CreatePostRequest post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.postaiapp.data.model.Post> $completion);
    
    @retrofit2.http.DELETE(value = "posts/{post_id}/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deletePost(@retrofit2.http.Path(value = "post_id")
    int postId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}