package id.co.dhanapps.view.home

import android.Manifest
import android.app.ProgressDialog
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.FragmentHomeBinding
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.adapter.StudioAdapter
import java.io.IOException


class HomeFragment : Fragment() {
    var progressDialog: ProgressDialog? = null

    private lateinit var dataBinding: FragmentHomeBinding
    private lateinit var studioAdapter: StudioAdapter
    private lateinit var viewModel: HomeViewModel

    private var currentLocation: Location? = null
    private var fusedLocationProviderClient: FusedLocationProviderClient? = null
    private val REQUEST_CODE = 101

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

        studioAdapter = StudioAdapter(requireContext())
        progressDialog = ProgressDialog(activity)
        progressDialog!!.setMessage("Proses..")

        dataBinding.rvStudio.apply {
            val lManager = LinearLayoutManager(context)
            lManager.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = lManager
            adapter = studioAdapter
        }

        dataBinding.ivStudio.setOnClickListener {
            viewModel.getHome()
        }


        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity!!)
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
                REQUEST_CODE
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

    private fun getStudioTerdekat(currentLatLng: LatLng, listStudio: List<Studio>) {
        val geocoder = Geocoder(activity)
        var addresses: List<Address?>

        val studioTerdekatList = mutableListOf<Studio>()
        for(list in listStudio){
            try {
                addresses = geocoder.getFromLocationName(list.lokasi, 5)
                if (addresses.size > 0) {
                    val location = addresses[0]!!
                    val latLngCafe = LatLng(location.latitude, location.longitude)
                    if (getDistanceMeters(currentLatLng, latLngCafe) < 3000) {
                        studioTerdekatList.add(list)
                        Log.d("Studio terdekat: ", "getStudioTerdekat: ${list.namaStudio}")
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        progressDialog?.dismiss()
        if (studioTerdekatList.size > 0) studioAdapter.setListStudio(
            studioTerdekatList
        )else{
            dataBinding.tvStudio.visibility = View.GONE
            Toast.makeText(
                activity,
                "Tidak ditemukan studio terdekat",
                Toast.LENGTH_SHORT
            ).show()
        }

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

    private fun fetchLocation() {
        progressDialog?.show()
        if (ActivityCompat.checkSelfPermission(
                activity!!, Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                activity!!, Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                activity!!,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE
            )
            return
        }
        val task =
            fusedLocationProviderClient!!.lastLocation
        task.addOnSuccessListener { location ->
            if (location != null) {
                currentLocation = location

                viewModel.getHome()
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}