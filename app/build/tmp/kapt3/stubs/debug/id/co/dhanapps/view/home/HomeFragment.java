package id.co.dhanapps.view.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lid/co/dhanapps/view/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "REQUEST_CODE", "", "currentLocation", "Landroid/location/Location;", "dataBinding", "Lid/co/dhanapps/databinding/FragmentHomeBinding;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "studioAdapter", "Lid/co/dhanapps/view/adapter/StudioAdapter;", "viewModel", "Lid/co/dhanapps/view/home/HomeViewModel;", "fetchLocation", "", "getDistanceMeters", "", "pt1", "Lcom/google/android/gms/maps/model/LatLng;", "pt2", "getStudioTerdekat", "currentLatLng", "listStudio", "", "Lid/co/dhanapps/data/Studio;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    private id.co.dhanapps.databinding.FragmentHomeBinding dataBinding;
    private id.co.dhanapps.view.adapter.StudioAdapter studioAdapter;
    private id.co.dhanapps.view.home.HomeViewModel viewModel;
    private android.location.Location currentLocation;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private final int REQUEST_CODE = 101;
    public static final id.co.dhanapps.view.home.HomeFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
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
    
    private final void getStudioTerdekat(com.google.android.gms.maps.model.LatLng currentLatLng, java.util.List<id.co.dhanapps.data.Studio> listStudio) {
    }
    
    public final long getDistanceMeters(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng pt1, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng pt2) {
        return 0L;
    }
    
    private final void fetchLocation() {
    }
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final id.co.dhanapps.view.home.HomeFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lid/co/dhanapps/view/home/HomeFragment$Companion;", "", "()V", "newInstance", "Lid/co/dhanapps/view/home/HomeFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final id.co.dhanapps.view.home.HomeFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}