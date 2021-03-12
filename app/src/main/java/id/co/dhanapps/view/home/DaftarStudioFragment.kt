package id.co.dhanapps.view.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import id.co.dhanapps.R
import id.co.dhanapps.data.ResponseList
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.FragmentDaftarStudioBinding
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.adapter.DaftarAnakAdapter
import id.co.dhanapps.view.adapter.StudioAdapter


class DaftarStudioFragment : Fragment() {

    lateinit var dataBinding: FragmentDaftarStudioBinding
    lateinit var viewModel: HomeViewModel
    lateinit var studioAdapter: DaftarAnakAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_studio, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel

        studioAdapter = DaftarAnakAdapter(requireContext())

        dataBinding.rvStudio.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = studioAdapter
        }

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

        viewModel.getDdaftarStudio()

    }

    private fun loadDataDaftar(it: ResponseList<Studio>) {
        studioAdapter.setStudioList(it?.data)
    }
}