package id.co.dhanapps.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ5\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ?\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lid/co/dhanapps/data/api/ApiService;", "", "editPaket", "Lretrofit2/Response;", "Lid/co/dhanapps/data/Value;", "idStudio", "", "namaPaket", "harga", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editStudio", "studio", "Lid/co/dhanapps/data/Studio;", "(Lid/co/dhanapps/data/Studio;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKarya", "Lid/co/dhanapps/data/ResponseList;", "Lid/co/dhanapps/data/Karya;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaket", "Lid/co/dhanapps/data/Paket;", "getPath", "url", "getStudio", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStudioItem", "Lid/co/dhanapps/data/api/ResponseItem;", "hapusKarya", "idKarya", "hapusPaket", "inputKarya", "gambar", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inputPaket", "loginUser", "username", "password", "registerUser", "nama", "lokasi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login_user.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "register_user.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nama")
    java.lang.String nama, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "lokasi")
    java.lang.String lokasi, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tampil_studio.php")
    public abstract java.lang.Object getStudio(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Studio>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tampil_paket.php")
    public abstract java.lang.Object getPaket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id_studio")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Paket>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tampil_karya.php")
    public abstract java.lang.Object getKarya(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id_studio")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Karya>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getPath(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tampil_item_studio.php")
    public abstract java.lang.Object getStudioItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id_studio")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.api.ResponseItem<id.co.dhanapps.data.Studio>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "edit_studio.php")
    public abstract java.lang.Object editStudio(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    id.co.dhanapps.data.Studio studio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "input_paket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object inputPaket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id_studio")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nama_paket")
    java.lang.String namaPaket, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "harga")
    java.lang.String harga, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "edit_paket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object editPaket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id_paket")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "nama_paket")
    java.lang.String namaPaket, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "harga")
    java.lang.String harga, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "hapus_paket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object hapusPaket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id_paket")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "hapus_karya.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object hapusKarya(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id_karya")
    java.lang.String idKarya, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "input_karya.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object inputKarya(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id_studio")
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "gambar")
    java.lang.String gambar, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p2);
}