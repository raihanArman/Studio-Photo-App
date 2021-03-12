package id.co.dhanapps.view.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ&\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eJ\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002J\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002J\b\u0010\'\u001a\u00020(H\u0003J!\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J1\u0010,\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lid/co/dhanapps/view/login/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "loginRepository", "Lid/co/dhanapps/repository/LoginRepository;", "(Landroid/app/Application;Lid/co/dhanapps/repository/LoginRepository;)V", "getApp", "()Landroid/app/Application;", "loginMutable", "Landroidx/lifecycle/MutableLiveData;", "Lid/co/dhanapps/utils/Resource;", "Lid/co/dhanapps/data/Value;", "getLoginMutable", "()Landroidx/lifecycle/MutableLiveData;", "getLoginRepository", "()Lid/co/dhanapps/repository/LoginRepository;", "loginsRespopnse", "getLoginsRespopnse", "()Lid/co/dhanapps/data/Value;", "setLoginsRespopnse", "(Lid/co/dhanapps/data/Value;)V", "registerMutable", "getRegisterMutable", "registerResponse", "getRegisterResponse", "setRegisterResponse", "getLoginUser", "Lkotlinx/coroutines/Job;", "username", "", "password", "getRegisterUser", "nama", "lokasi", "handleLoginResponse", "response", "Lretrofit2/Response;", "handleRegisterResponse", "hasInternetConnection", "", "safeLoginUser", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeRegisterUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value>> loginMutable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value>> registerMutable = null;
    @org.jetbrains.annotations.Nullable()
    private id.co.dhanapps.data.Value loginsRespopnse;
    @org.jetbrains.annotations.Nullable()
    private id.co.dhanapps.data.Value registerResponse;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    @org.jetbrains.annotations.NotNull()
    private final id.co.dhanapps.repository.LoginRepository loginRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value>> getLoginMutable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value>> getRegisterMutable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final id.co.dhanapps.data.Value getLoginsRespopnse() {
        return null;
    }
    
    public final void setLoginsRespopnse(@org.jetbrains.annotations.Nullable()
    id.co.dhanapps.data.Value p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final id.co.dhanapps.data.Value getRegisterResponse() {
        return null;
    }
    
    public final void setRegisterResponse(@org.jetbrains.annotations.Nullable()
    id.co.dhanapps.data.Value p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getRegisterUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String nama, @org.jetbrains.annotations.NotNull()
    java.lang.String lokasi) {
        return null;
    }
    
    private final id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value> handleRegisterResponse(retrofit2.Response<id.co.dhanapps.data.Value> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getLoginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private final id.co.dhanapps.utils.Resource<id.co.dhanapps.data.Value> handleLoginResponse(retrofit2.Response<id.co.dhanapps.data.Value> response) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final boolean hasInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.repository.LoginRepository getLoginRepository() {
        return null;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    id.co.dhanapps.repository.LoginRepository loginRepository) {
        super(null);
    }
}