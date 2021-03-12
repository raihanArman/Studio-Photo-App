package id.co.dhanapps.view.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lid/co/dhanapps/view/home/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "dataBinding", "Lid/co/dhanapps/databinding/ActivityMainBinding;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "statusLogin", "", "getStatusLogin", "()Z", "setStatusLogin", "(Z)V", "viewModel", "Lid/co/dhanapps/view/home/HomeViewModel;", "getViewModel", "()Lid/co/dhanapps/view/home/HomeViewModel;", "setViewModel", "(Lid/co/dhanapps/view/home/HomeViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setFragment", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private id.co.dhanapps.databinding.ActivityMainBinding dataBinding;
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.view.home.HomeViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences sharedPreferences;
    private boolean statusLogin = false;
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.view.home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.view.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean getStatusLogin() {
        return false;
    }
    
    public final void setStatusLogin(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    public MainActivity() {
        super();
    }
}