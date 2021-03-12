package id.co.dhanapps.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020PH\u0002J\b\u0010R\u001a\u00020PH\u0002J\u0006\u0010S\u001a\u00020PJ\b\u0010T\u001a\u00020PH\u0002J\u0010\u0010U\u001a\u00020P2\u0006\u0010V\u001a\u000200H\u0002J\u0012\u0010W\u001a\u00020P2\b\u0010X\u001a\u0004\u0018\u00010YH\u0014J\u0010\u0010Z\u001a\u00020P2\u0006\u0010[\u001a\u00020>H\u0016J\b\u0010\\\u001a\u00020PH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010@\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00102\"\u0004\bB\u00104R\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020JX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N\u00a8\u0006^"}, d2 = {"Lid/co/dhanapps/view/MapsStudioActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "DISPLACEMENT", "", "getDISPLACEMENT", "()I", "FASTEST_INTERVAL", "getFASTEST_INTERVAL", "MAP_LAYOUT_STATE_CONTRACTED", "MAP_LAYOUT_STATE_EXPANDED", "MY_PERMISSION_REQUEST_CODE", "UPDATE_INTERVAL", "getUPDATE_INTERVAL", "dataBinding", "Lid/co/dhanapps/databinding/ActivityMapsStudioBinding;", "getDataBinding", "()Lid/co/dhanapps/databinding/ActivityMapsStudioBinding;", "setDataBinding", "(Lid/co/dhanapps/databinding/ActivityMapsStudioBinding;)V", "directionTracking", "Lcom/google/android/gms/maps/model/Polyline;", "displayRute", "", "getDisplayRute", "()Z", "setDisplayRute", "(Z)V", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "latLngCafe", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLngCafe", "()Lcom/google/android/gms/maps/model/LatLng;", "setLatLngCafe", "(Lcom/google/android/gms/maps/model/LatLng;)V", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getLocationCallback", "()Lcom/google/android/gms/location/LocationCallback;", "setLocationCallback", "(Lcom/google/android/gms/location/LocationCallback;)V", "lokasi", "", "getLokasi", "()Ljava/lang/String;", "setLokasi", "(Ljava/lang/String;)V", "mCurrentMarker", "Lcom/google/android/gms/maps/model/Marker;", "getMCurrentMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMCurrentMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "mLocationReqeust", "Lcom/google/android/gms/location/LocationRequest;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mMapLayoutState", "namaStudio", "getNamaStudio", "setNamaStudio", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "viewModel", "Lid/co/dhanapps/view/home/HomeViewModel;", "getViewModel", "()Lid/co/dhanapps/view/home/HomeViewModel;", "setViewModel", "(Lid/co/dhanapps/view/home/HomeViewModel;)V", "buildLocationCallback", "", "buildLocationRequest", "contractMapAnimation", "displayLocation", "expandMapAnimation", "getDirection", "it", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "setUpLocation", "ParserTask", "app_debug"})
public final class MapsStudioActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.databinding.ActivityMapsStudioBinding dataBinding;
    @org.jetbrains.annotations.NotNull()
    public id.co.dhanapps.view.home.HomeViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng latLngCafe;
    private com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lokasi;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String namaStudio;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    private final int MY_PERMISSION_REQUEST_CODE = 732;
    private final int UPDATE_INTERVAL = 5000;
    private final int FASTEST_INTERVAL = 5000;
    private final int DISPLACEMENT = 10;
    private final int MAP_LAYOUT_STATE_CONTRACTED = 0;
    private final int MAP_LAYOUT_STATE_EXPANDED = 1;
    private int mMapLayoutState = 0;
    private com.google.android.gms.location.LocationRequest mLocationReqeust;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.LocationCallback locationCallback;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker mCurrentMarker;
    private com.google.android.gms.maps.model.Polyline directionTracking;
    private boolean displayRute = false;
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.databinding.ActivityMapsStudioBinding getDataBinding() {
        return null;
    }
    
    public final void setDataBinding(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.databinding.ActivityMapsStudioBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.dhanapps.view.home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    id.co.dhanapps.view.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getLatLngCafe() {
        return null;
    }
    
    public final void setLatLngCafe(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLokasi() {
        return null;
    }
    
    public final void setLokasi(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNamaStudio() {
        return null;
    }
    
    public final void setNamaStudio(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    public final int getUPDATE_INTERVAL() {
        return 0;
    }
    
    public final int getFASTEST_INTERVAL() {
        return 0;
    }
    
    public final int getDISPLACEMENT() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    public final void setFusedLocationProviderClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.LocationCallback getLocationCallback() {
        return null;
    }
    
    public final void setLocationCallback(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.LocationCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getMCurrentMarker() {
        return null;
    }
    
    public final void setMCurrentMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    public final boolean getDisplayRute() {
        return false;
    }
    
    public final void setDisplayRute(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDirection(java.lang.String it) {
    }
    
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    public final void displayLocation() {
    }
    
    private final void setUpLocation() {
    }
    
    private final void buildLocationRequest() {
    }
    
    private final void buildLocationCallback() {
    }
    
    private final void expandMapAnimation() {
    }
    
    private final void contractMapAnimation() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    public MapsStudioActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u001e\u0012\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u00040\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ?\u0010\u0011\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u00042\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0013\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\u00020\u00162 \u0010\u0017\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lid/co/dhanapps/view/MapsStudioActivity$ParserTask;", "Landroid/os/AsyncTask;", "", "", "", "Ljava/util/HashMap;", "context", "Landroid/content/Context;", "(Lid/co/dhanapps/view/MapsStudioActivity;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mDialog", "Landroid/app/ProgressDialog;", "getMDialog", "()Landroid/app/ProgressDialog;", "setMDialog", "(Landroid/app/ProgressDialog;)V", "doInBackground", "p0", "", "([Ljava/lang/String;)Ljava/util/List;", "onPostExecute", "", "lists", "onPreExecute", "app_debug"})
    public final class ParserTask extends android.os.AsyncTask<java.lang.String, java.lang.Integer, java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>>> {
        @org.jetbrains.annotations.NotNull()
        private android.app.ProgressDialog mDialog;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.ProgressDialog getMDialog() {
            return null;
        }
        
        public final void setMDialog(@org.jetbrains.annotations.NotNull()
        android.app.ProgressDialog p0) {
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>> lists) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... p0) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public ParserTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}