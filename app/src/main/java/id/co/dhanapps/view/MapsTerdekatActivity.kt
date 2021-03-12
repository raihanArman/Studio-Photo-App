package id.co.dhanapps.view

import android.Manifest
import android.app.ProgressDialog
import android.content.Context.LOCATION_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.location.*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.tasks.Task
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.MainActivity
import java.io.IOException

class MapsTerdekatActivity : Fragment(), OnMapReadyCallback, LocationListener, GoogleMap.OnMarkerClickListener {

    private lateinit var mMap: GoogleMap
    lateinit var viewModel: HomeViewModel
    private var mapView: MapView? = null
    private var locationManager: LocationManager? = null
    private var latLng: LatLng? = null
    private var currentLocation: Location? = null
    private var fusedLocationProviderClient: FusedLocationProviderClient? = null
    var progressDialog: ProgressDialog? = null

    companion object{

        val REQUEST_CODE = 101

        const val MIN_DISTANCE_CHANGE_FOR_UPDATES: Long = 10
        const val MIN_TIME_BW_UPDATES = 1000 * 60 * 1.toLong()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_maps_terdekat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mapView = view.findViewById(R.id.map)
        mapView?.onCreate(savedInstanceState)

        viewModel = (context as MainActivity).viewModel
        progressDialog = ProgressDialog(activity)
        progressDialog!!.setMessage("GPS Loading")

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireActivity())
        if (ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                activity!!,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                MapsTerdekatActivity.REQUEST_CODE
            )
            return
        }
        fetchLocation()

        viewModel.homeMutable.observe(viewLifecycleOwner, Observer {response ->
            when(response){
                is Resource.Success ->{
                    response.data?.let {
                        it.listHome?.let { it1 ->
                            if(currentLocation != null){

                                currentLocation?.latitude?.let { it2 -> currentLocation?.longitude?.let { it3 ->
                                    LatLng(it2,
                                        it3
                                    )
                                } }?.let { it3 ->
                                    getStudioTerdekat(it3, it1)
                                }
                            }
                        }
                    }
                }
            }
        })

    }

    private fun fetchLocation() {
        if (ActivityCompat.checkSelfPermission(
                requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireActivity(), Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE
            )
            return
        }

        val task: Task<Location> = fusedLocationProviderClient?.lastLocation as Task<Location>
        task.addOnSuccessListener {
            if (it != null){
                currentLocation = it

                setMapView()

                viewModel.getHome()

            }
        }

    }

    private fun getStudioTerdekat(latLng: LatLng, listStudio: List<Studio>) {
        val geocoder = Geocoder(activity)
        var addresses: List<Address?>
        for(i in listStudio.indices){
            try {
                addresses = geocoder.getFromLocationName(listStudio[i].lokasi, 5)
                if (addresses.size > 0) {
                    val location = addresses[0]!!
                    val latLngCafe = LatLng(location.latitude, location.longitude)
                    if (getDistanceMeters(latLng, latLngCafe) < 10000) {
                        val marker = mMap.addMarker(
                            MarkerOptions()
                                .position(latLngCafe)
                                .title(listStudio[i].namaStudio)
                        )
                        marker.tag = listStudio[i].idStudio
                        marker.showInfoWindow()
                    } else {
                        Toast.makeText(
                            activity,
                            "Tidak ditemukan studio terdekat",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    private fun setMapView() {
        mapView?.onResume()
        mapView?.getMapAsync(this)
        locationManager = requireActivity().getSystemService(LOCATION_SERVICE) as LocationManager
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            REQUEST_CODE -> if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                fetchLocation()
            }
        }
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.setOnMarkerClickListener(this);


        if (ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
            != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        mMap.isMyLocationEnabled = true
        mMap.uiSettings.isCompassEnabled = true

        showCurrentLocation()
    }

    private fun showCurrentLocation() {
        val criteria = Criteria()
        val bestProvider: String? = locationManager?.getBestProvider(criteria, true)
        if (ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                activity!!,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        val location = bestProvider?.let {
            locationManager?.getLastKnownLocation(it)
        }

        if (location != null){
            onLocationChanged(location)
        }


        if (bestProvider != null) {
            locationManager?.requestLocationUpdates(
                bestProvider, MIN_TIME_BW_UPDATES,
                MIN_DISTANCE_CHANGE_FOR_UPDATES.toFloat(), (this as LocationListener)
            )
        }

    }

    override fun onLocationChanged(p0: Location) {
        val latitude: Double = p0.latitude
        val longtitude: Double = p0.longitude
        latLng = LatLng(latitude, longtitude)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng))
        val zoom: Float =15.0f
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
    }

    fun getDistanceMeters(pt1: LatLng, pt2: LatLng): Long {
        var distance = 0.0
        try {
            val theta = pt1.longitude - pt2.longitude
            var dist =
                (Math.sin(Math.toRadians(pt1.latitude)) * Math.sin(
                    Math.toRadians(pt2.latitude)
                )
                        + Math.cos(Math.toRadians(pt1.latitude)) * Math.cos(
                    Math.toRadians(pt2.latitude)
                ) * Math.cos(Math.toRadians(theta)))
            dist = Math.acos(dist)
            dist = Math.toDegrees(dist)
            distance = dist * 60 * 1853.1596
        } catch (ex: Exception) {
            println(ex.message)
        }
        return distance.toLong()
    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        progressDialog?.setMessage("Loading ...")
        progressDialog?.show()
        val intent = Intent(activity, DetailStudioActivity::class.java)
        intent.putExtra("id_studio", p0?.tag.toString())
        activity!!.startActivity(intent)
        progressDialog?.dismiss()
        return true
    }
}