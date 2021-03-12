package id.co.dhanapps.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\"\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J-\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110-2\u0006\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u001dH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00064"}, d2 = {"Lid/co/dhanapps/view/EditStudioActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lid/co/dhanapps/utils/ConvertBitmap;", "()V", "binding", "Lid/co/dhanapps/databinding/ActivityEditStudioBinding;", "getBinding", "()Lid/co/dhanapps/databinding/ActivityEditStudioBinding;", "setBinding", "(Lid/co/dhanapps/databinding/ActivityEditStudioBinding;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "photoUser", "", "getPhotoUser", "()Ljava/lang/String;", "setPhotoUser", "(Ljava/lang/String;)V", "viewModel", "Lid/co/dhanapps/view/home/HomeViewModel;", "getViewModel", "()Lid/co/dhanapps/view/home/HomeViewModel;", "setViewModel", "(Lid/co/dhanapps/view/home/HomeViewModel;)V", "bitmapToString", "", "imgConvert", "editProfil", "gambar", "loadData", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "updateDataStudio", "Companion", "LoadBitmapConverterCallback", "app_debug"})
public final class EditStudioActivity extends androidx.appcompat.app.AppCompatActivity implements id.co.dhanapps.utils.ConvertBitmap {
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.databinding.ActivityEditStudioBinding binding;
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.view.home.HomeViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap bitmap;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String photoUser;
    public static final int REQUEST_GALERY = 96;
    public static final int REQUEST_CAMERA = 98;
    public static final int CAMERA_PERMISSION = 90;
    public static final id.co.dhanapps.view.EditStudioActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.databinding.ActivityEditStudioBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.databinding.ActivityEditStudioBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.view.home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.view.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    public final void setBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhotoUser() {
        return null;
    }
    
    public final void setPhotoUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData() {
    }
    
    private final void updateDataStudio() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void bitmapToString(@org.jetbrains.annotations.Nullable()
    java.lang.String imgConvert) {
    }
    
    private final void editProfil(java.lang.String gambar) {
    }
    
    public EditStudioActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lid/co/dhanapps/view/EditStudioActivity$LoadBitmapConverterCallback;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "convertBitmap", "Lid/co/dhanapps/utils/ConvertBitmap;", "(Lid/co/dhanapps/view/EditStudioActivity;Landroid/content/Context;Lid/co/dhanapps/utils/ConvertBitmap;)V", "weakContext", "Ljava/lang/ref/WeakReference;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/String;", "onPostExecute", "", "s", "onPreExecute", "app_debug"})
    public final class LoadBitmapConverterCallback extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String> {
        private final java.lang.ref.WeakReference<android.content.Context> weakContext = null;
        private final id.co.dhanapps.utils.ConvertBitmap convertBitmap = null;
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        public LoadBitmapConverterCallback(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        id.co.dhanapps.utils.ConvertBitmap convertBitmap) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lid/co/dhanapps/view/EditStudioActivity$Companion;", "", "()V", "CAMERA_PERMISSION", "", "REQUEST_CAMERA", "REQUEST_GALERY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}