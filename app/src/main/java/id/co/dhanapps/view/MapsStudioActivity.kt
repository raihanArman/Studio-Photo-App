package id.co.dhanapps.view

import android.Manifest
import android.animation.ObjectAnimator
import android.app.ProgressDialog
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Address
import android.location.Geocoder
import android.os.AsyncTask
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import id.co.dhanapps.R
import id.co.dhanapps.databinding.ActivityMapsStudioBinding
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.utils.DirectionJSONParser
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.utils.ViewWeightAnimationWrapper
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.HomeViewModelProviderFactory
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.*
import android.animation.ObjectAnimator.ofFloat as ofFloat1

class MapsStudioActivity : AppCompatActivity(), OnMapReadyCallback {

//    ActivityMapsStudioBinding menghubungkan dengan tampilan
    lateinit var dataBinding : ActivityMapsStudioBinding


//    HomeViewModel untuk mengambil data dari database
    lateinit var viewModel: HomeViewModel

//    Variable pengambilan lokasi
    var latLngCafe : LatLng ?= null
    private var mMap: GoogleMap? = null
    var lokasi: String? = null
    var namaStudio: String? = null
    var progressDialog: ProgressDialog? = null
    private val MY_PERMISSION_REQUEST_CODE = 732
    val UPDATE_INTERVAL = 5000
    val FASTEST_INTERVAL = 5000
    val DISPLACEMENT = 10

    private val MAP_LAYOUT_STATE_CONTRACTED = 0
    private val MAP_LAYOUT_STATE_EXPANDED = 1
    private var mMapLayoutState = 0

    private var mLocationReqeust: LocationRequest? = null
    var fusedLocationProviderClient: FusedLocationProviderClient? = null
    var locationCallback: LocationCallback? = null


    var mCurrentMarker: Marker? = null
    private var directionTracking: Polyline? = null
    var displayRute = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        Untuk mengambil data dari database
        val homeRepository = HomeRepository()
        val viewModelFactory = HomeViewModelProviderFactory(application, homeRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)

//        Untuk menghubungkan class dengan tampilan
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_maps_studio)

//        proses inisialisasi variable pengambilan lokasi
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map_studio) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)

        namaStudio = intent.getStringExtra("nama_studio")
        lokasi = intent.getStringExtra("lokasi")
        progressDialog = ProgressDialog(this)
        progressDialog!!.setMessage("GPS Loading ...")

        dataBinding.tvCafe.text = namaStudio
        dataBinding.tvLokasi.text = lokasi

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        dataBinding.fbFullScreen.setOnClickListener(View.OnClickListener {
            if (mMapLayoutState == MAP_LAYOUT_STATE_CONTRACTED) {
                mMapLayoutState = MAP_LAYOUT_STATE_EXPANDED
                expandMapAnimation()
            } else if (mMapLayoutState == MAP_LAYOUT_STATE_EXPANDED) {
                mMapLayoutState = MAP_LAYOUT_STATE_CONTRACTED
                contractMapAnimation()
            }
        })

        dataBinding.fbBack.setOnClickListener(View.OnClickListener { finish() })

        viewModel.routeMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Loading ->{

                }
                is Resource.Error ->{

                }
                is Resource.Success ->{
                    response.data?.let {
                        getDirection(it)
                    }
                }
            }
        })

    }

//    Untuk mengambil jarak
    private fun getDirection(it: String) {
        val jsonObject = JSONObject(it)
        val routes: JSONArray = jsonObject.getJSONArray("routes")
        val `object` = routes.getJSONObject(0)
        val legs = `object`.getJSONArray("legs")
        val objectLegs = legs.getJSONObject(0)

        val distance = objectLegs.getJSONObject("distance")
        val distanceText = distance.getString("text")


        val time = objectLegs.getJSONObject("duration")
        val timeText = time.getString("text")

        dataBinding.tvJarak.setText(distanceText)
        dataBinding.tvWaktu.setText(timeText)

        progressDialog!!.dismiss()
        ParserTask(this).execute(it)

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

//    Untuk menampilakan lokasi
    fun displayLocation(): Unit {
        Log.d("MAPS MANTAO", "displayLocation: 13")
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return
        }
        Log.d("MAPS MANTAO", "displayLocation: 1")
        fusedLocationProviderClient!!.lastLocation
                .addOnSuccessListener { location ->
                    Constant.mLastLocation = location
                    if (Constant.mLastLocation != null) {
                        Log.d("MAPS MANTAO", "displayLocation: tidak null las location")
                        val latitudeUser: Double = Constant.mLastLocation!!.getLatitude()
                        val longitudeUser: Double = Constant.mLastLocation!!.getLongitude()
                        if (mCurrentMarker != null) {
                            mCurrentMarker!!.remove()
                        }
                        mMap!!.clear()
                        val builder = LatLngBounds.Builder()
                        builder.include(LatLng(latitudeUser, longitudeUser))
                        mCurrentMarker = mMap!!.addMarker(MarkerOptions()
                                .position(LatLng(latitudeUser, longitudeUser))
                                .title("Your location"))
                        val geocoder = Geocoder(this)
                        val addresses: List<Address>
                        try {
                            addresses = geocoder.getFromLocationName(lokasi, 5)
                            if (addresses.size > 0) {
                                val locationPangkalan = addresses[0]
                                latLngCafe = LatLng(locationPangkalan.latitude, locationPangkalan.longitude)
                                mMap!!.addMarker(MarkerOptions().position(latLngCafe!!)
                                        .icon(BitmapDescriptorFactory
                                                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))

                                val width = resources.displayMetrics.widthPixels
                                val height = resources.displayMetrics.heightPixels
                                val padding = (Math.min(width, height) * 0.2).toInt()
                                builder.include(latLngCafe)
                                val bounds = builder.build()
                                //                                                int padding = 500; // offset from edges of the map in pixels
                                val cu = CameraUpdateFactory.newLatLngBounds(bounds, width, height, padding)
                                mMap!!.moveCamera(cu)
                                mMap!!.animateCamera(cu)
                                directionTracking?.remove()

                                val requestApi = "https://maps.googleapis.com/maps/api/directions/json?" +
                                        "mode=driving&" +
                                        "transit_routing_preference=less_driving&" +
                                        "origin=" + latitudeUser + "," + longitudeUser + "&" +
                                        "destination=" + latLngCafe?.latitude + "," + latLngCafe?.longitude + "&" +
                                        "key=" + resources.getString(R.string.google_direction_key)
                                Log.d("MANTAP DJIWA URL : ", requestApi)
                                viewModel.getRouteResponse(requestApi)

                            }
                        } catch (e: IOException) {
                            Log.d("ERROR ROUTE", "displayLocation: $e")
                        }
                    } else {
                        Log.d("MAPS MANTAO", "displayLocation: null las location")
                        Log.d("ERROR", "displayLocation: Cannot get your location")
                    }
                }
    }

//    Untuk mendeteksi lokasi device
    private fun setUpLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
            ), MY_PERMISSION_REQUEST_CODE)
        } else {
            buildLocationCallback()
            buildLocationRequest()
        }
    }

//    Untuk mendeteksi lokasi device
    private fun buildLocationRequest() {
        mLocationReqeust = LocationRequest()
        mLocationReqeust?.setInterval(UPDATE_INTERVAL.toLong())
        mLocationReqeust?.setFastestInterval(FASTEST_INTERVAL.toLong())
        mLocationReqeust?.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        mLocationReqeust?.setSmallestDisplacement(DISPLACEMENT.toFloat())
    }



//    Untuk mendeteksi lokasi device
    private fun buildLocationCallback() {
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                super.onLocationResult(locationResult)
                for (location in locationResult.locations) {
                    Constant.mLastLocation = location
                }
            }
        }
    }

    private fun expandMapAnimation() {
        val mapAnimationWrapper = ViewWeightAnimationWrapper(dataBinding.mapContainer)
        val mapAnimation: ObjectAnimator = ObjectAnimator.ofFloat(mapAnimationWrapper,
                "weight",
                70f,
                100f)
        mapAnimation.duration = 800
        val lvInfoEventAnimationWrapper = ViewWeightAnimationWrapper(dataBinding.lvInfoCafe)
        val infoAnimation: ObjectAnimator = ofFloat1(lvInfoEventAnimationWrapper,
                "weight",
                30f,
                0f)
        infoAnimation.duration = 800
        mapAnimation.start()
        infoAnimation.start()
    }

    private fun contractMapAnimation() {
        val mapAnimationWrapper = ViewWeightAnimationWrapper(dataBinding.mapContainer)
        val mapAnimation: ObjectAnimator = ObjectAnimator.ofFloat(mapAnimationWrapper,
                "weight",
                100f,
                70f)
        mapAnimation.duration = 800
        val lvInfoEventAnimationWrapper = ViewWeightAnimationWrapper(dataBinding.lvInfoCafe)
        val infoAnimation: ObjectAnimator = ObjectAnimator.ofFloat(lvInfoEventAnimationWrapper,
                "weight",
                0f,
                30f)
        infoAnimation.duration = 800
        mapAnimation.start()
        infoAnimation.start()
    }


//    Untuk mempersiapkan maps
    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap
        mMap!!.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap!!.isTrafficEnabled = false
        mMap!!.isIndoorEnabled = false
        mMap!!.isBuildingsEnabled = false
        mMap!!.uiSettings.isZoomControlsEnabled = true

        buildLocationRequest()
        buildLocationCallback()
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        fusedLocationProviderClient!!.requestLocationUpdates(mLocationReqeust, locationCallback, Looper.myLooper())

        setUpLocation()
        displayLocation()
    }


//    Untuk memparsing data menjadi rute
    inner class ParserTask(val context: Context) :
        AsyncTask<String?, Int?, List<List<HashMap<String, String>>>?>() {
        var mDialog = ProgressDialog(context)
        override fun onPreExecute() {
            super.onPreExecute()
            mDialog.setMessage("Please waiting ...")
            mDialog.show()
        }


        override fun onPostExecute(lists: List<List<HashMap<String, String>>>?) {
            super.onPostExecute(lists)
            mDialog.dismiss()
            var points: ArrayList<LatLng>? = null
            var polylineOptions: PolylineOptions? = null
            for (i in lists!!.indices) {
                points = ArrayList<LatLng>()
                polylineOptions = PolylineOptions()
                val path =
                    lists[i]
                for (k in path.indices) {
                    val point = path[k]
                    val lat = point["lat"]!!.toDouble()
                    val lng = point["lng"]!!.toDouble()
                    val position = LatLng(lat, lng)
                    points.add(position)
                }
                polylineOptions.addAll(points)
                polylineOptions.width(10f)
                polylineOptions.color(Color.RED)
                polylineOptions.geodesic(true)
            }
            if (polylineOptions != null) {
                directionTracking = mMap?.addPolyline(polylineOptions)

            }
        }

        override fun doInBackground(vararg p0: String?): List<List<HashMap<String, String>>>? {
            val jsonObject: JSONObject
            var routes: List<List<HashMap<String, String>>>? =
                null
            try {
                jsonObject = JSONObject(p0[0])
                val parser: DirectionJSONParser =
                    DirectionJSONParser()
                routes = parser.parse(jsonObject)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            return routes
        }
    }

}