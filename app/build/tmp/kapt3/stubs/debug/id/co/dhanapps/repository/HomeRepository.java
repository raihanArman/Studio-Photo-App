package id.co.dhanapps.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0017\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001b0\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J/\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lid/co/dhanapps/repository/HomeRepository;", "", "()V", "editPaket", "Lretrofit2/Response;", "Lid/co/dhanapps/data/Value;", "idPaket", "", "namaPaket", "harga", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editStudio", "studio", "Lid/co/dhanapps/data/Studio;", "(Lid/co/dhanapps/data/Studio;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKarya", "Lid/co/dhanapps/data/ResponseList;", "Lid/co/dhanapps/data/Karya;", "idStudio", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaketStudio", "Lid/co/dhanapps/data/Paket;", "getRoute", "path", "getStudio", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStudioItem", "Lid/co/dhanapps/data/api/ResponseItem;", "hapusKarya", "hapusPaket", "inputKarya", "gambar", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inputPaket", "app_debug"})
public final class HomeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStudio(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Studio>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaketStudio(@org.jetbrains.annotations.NotNull()
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Paket>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRoute(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getKarya(@org.jetbrains.annotations.NotNull()
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.ResponseList<id.co.dhanapps.data.Karya>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStudioItem(@org.jetbrains.annotations.NotNull()
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.api.ResponseItem<id.co.dhanapps.data.Studio>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editStudio(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.data.Studio studio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object inputPaket(@org.jetbrains.annotations.NotNull()
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    java.lang.String namaPaket, @org.jetbrains.annotations.NotNull()
    java.lang.String harga, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object inputKarya(@org.jetbrains.annotations.NotNull()
    java.lang.String idStudio, @org.jetbrains.annotations.NotNull()
    java.lang.String gambar, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editPaket(@org.jetbrains.annotations.NotNull()
    java.lang.String idPaket, @org.jetbrains.annotations.NotNull()
    java.lang.String namaPaket, @org.jetbrains.annotations.NotNull()
    java.lang.String harga, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hapusPaket(@org.jetbrains.annotations.NotNull()
    java.lang.String idPaket, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hapusKarya(@org.jetbrains.annotations.NotNull()
    java.lang.String idPaket, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<id.co.dhanapps.data.Value>> p1) {
        return null;
    }
    
    public HomeRepository() {
        super();
    }
}