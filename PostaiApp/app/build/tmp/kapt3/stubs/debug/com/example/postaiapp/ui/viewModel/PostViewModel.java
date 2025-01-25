package com.example.postaiapp.ui.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rJ2\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"J2\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"J\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rJ\u0006\u0010)\u001a\u00020\u001cJ\u0006\u0010*\u001a\u00020\u001cJ\b\u0010+\u001a\u0004\u0018\u00010\u0016J\u001e\u0010,\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fR7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006-"}, d2 = {"Lcom/example/postaiapp/ui/viewModel/PostViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "Lcom/example/postaiapp/data/model/Post;", "posts", "getPosts", "()Ljava/util/List;", "setPosts", "(Ljava/util/List;)V", "posts$delegate", "Landroidx/compose/runtime/MutableState;", "", "userId", "getUserId", "()I", "setUserId", "(I)V", "userId$delegate", "Landroidx/compose/runtime/MutableIntState;", "userIdDefault", "Lcom/example/postaiapp/data/model/User;", "users", "getUsers", "setUsers", "users$delegate", "SetUserId", "", "createPost", "title", "", "content", "onSuccess", "Lkotlin/Function0;", "onError", "createUser", "name", "email", "deletePost", "postId", "fetchPosts", "fetchUsers", "getUser", "updatePost", "app_debug"})
public final class PostViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState posts$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState users$delegate = null;
    private final int userIdDefault = 1;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState userId$delegate = null;
    
    public PostViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.postaiapp.data.model.Post> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.postaiapp.data.model.Post> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.postaiapp.data.model.User> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.postaiapp.data.model.User> p0) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    public final void SetUserId(int userId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.postaiapp.data.model.User getUser() {
        return null;
    }
    
    public final void fetchUsers() {
    }
    
    public final void fetchPosts() {
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    public final void createPost(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    public final void deletePost(int postId) {
    }
    
    public final void updatePost(int postId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
}