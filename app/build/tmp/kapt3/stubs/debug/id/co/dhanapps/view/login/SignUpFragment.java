package id.co.dhanapps.view.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u001eH\u0002J\u0012\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u0001H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lid/co/dhanapps/view/login/SignUpFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dataBinding", "Lid/co/dhanapps/databinding/FragmentSignUpBinding;", "getDataBinding", "()Lid/co/dhanapps/databinding/FragmentSignUpBinding;", "setDataBinding", "(Lid/co/dhanapps/databinding/FragmentSignUpBinding;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "emailPattern", "Lkotlin/text/Regex;", "hasNumber", "", "hasUppercase", "getHasUppercase", "()Z", "setHasUppercase", "(Z)V", "isAtLeast8", "isRegistrationClickable", "passwordRegex", "getPasswordRegex", "()Lkotlin/text/Regex;", "sharedPreferences", "Landroid/content/SharedPreferences;", "viewModel", "Lid/co/dhanapps/view/login/LoginViewModel;", "checkInput", "", "daftar", "isConnectionInternet", "requireContext", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "registrationDataCheck", "saveDataUser", "studio", "Lid/co/dhanapps/data/Studio;", "setFragment", "fragment", "app_debug"})
public final class SignUpFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.databinding.FragmentSignUpBinding dataBinding;
    private id.co.dhanapps.view.login.LoginViewModel viewModel;
    private android.content.SharedPreferences sharedPreferences;
    private android.content.SharedPreferences.Editor editor;
    private final kotlin.text.Regex emailPattern = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex passwordRegex = null;
    private boolean isAtLeast8 = false;
    private boolean hasUppercase = false;
    private boolean hasNumber = false;
    private boolean isRegistrationClickable = false;
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.databinding.FragmentSignUpBinding getDataBinding() {
        return null;
    }
    
    public final void setDataBinding(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.databinding.FragmentSignUpBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.text.Regex getPasswordRegex() {
        return null;
    }
    
    public final boolean getHasUppercase() {
        return false;
    }
    
    public final void setHasUppercase(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveDataUser(id.co.dhanapps.data.Studio studio) {
    }
    
    private final void setFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    private final boolean isConnectionInternet(android.content.Context requireContext) {
        return false;
    }
    
    private final void registrationDataCheck() {
    }
    
    public final void checkInput() {
    }
    
    private final void daftar() {
    }
    
    public SignUpFragment() {
        super();
    }
}