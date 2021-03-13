package id.co.dhanapps.view.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import id.co.dhanapps.R
import id.co.dhanapps.data.response.ResponseList
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.FragmentDaftarStudioBinding
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.adapter.DaftarStudioAdapter

// menampilkan daftar studio
class DaftarStudioFragment : Fragment() {

//    variable yang tampilan dari daftar studio fragment
    lateinit var dataBinding: FragmentDaftarStudioBinding

//    variable yang mengambil data dari API
    lateinit var viewModel: HomeViewModel

//    variable yang menampilkan list daftar studio
    lateinit var studioAdapter: DaftarStudioAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_studio, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        inisialisasi variable
        viewModel = (activity as MainActivity).viewModel
        studioAdapter = DaftarStudioAdapter(requireContext())

        dataBinding.rvStudio.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = studioAdapter
        }

//        Proses pengambilan data
        viewModel.daftarStudioMutable.observe(viewLifecycleOwner, Observer {response ->
            when(response){
                is Resource.Loading ->{
                }
                is Resource.Error ->{
                    Log.d("MANTAP", "onViewCreated: ")
                }
                is Resource.Success ->{

                    response.data?.let {
                        loadDataDaftar(it)
                    }
                }
            }
        })


//        memanggil data
        viewModel.getDdaftarStudio()

    }

//    Menampilkan data pada list
    private fun loadDataDaftar(it: ResponseList<Studio>) {
        studioAdapter.setStudioList(it?.data)
    }
}