package com.example.covid19.ui.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.covid19.databinding.FragmentCovidData2Binding
import com.example.covid19.ui.CovidDataViewModel
import com.example.covid19.ui.CovidDataViewModeldb
import com.example.covid19.ui.adapter.rv_adapter_statewise

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CovidDataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class statewise_Fragment : Fragment() {

    private lateinit var bindings:FragmentCovidData2Binding;
    lateinit var rvAdapter: rv_adapter_statewise;
    private lateinit var linearLayoutManager: LinearLayoutManager
    val viewmodel: CovidDataViewModel by activityViewModels()
    val viewmodeldb: CovidDataViewModeldb by activityViewModels()
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings= FragmentCovidData2Binding.inflate(inflater,container,false);
        var view=bindings.root;


        viewmodeldb.getStatewiseData().observe(requireActivity(), Observer {

            if(!Connectivity.isOnline(requireContext())){
                if(it!=null && it.size>0){
                    println("hello"+it.size)
                    linearLayoutManager = LinearLayoutManager(requireContext())
                    bindings.rv.layoutManager = linearLayoutManager
                    rvAdapter = rv_adapter_statewise(requireContext(), it);
                    bindings.rv.adapter=rvAdapter;
                }
            }
        })

        viewmodel.getCovidData()?.observe(requireActivity(), Observer {
            if(it.cases_time_series!=null && it.cases_time_series.size>0){
                println("hello"+it.cases_time_series.size)
                linearLayoutManager = LinearLayoutManager(requireContext())
                bindings.rv.layoutManager = linearLayoutManager
                rvAdapter = rv_adapter_statewise(requireContext(), it.statewise);
                bindings.rv.adapter=rvAdapter;
            }

        })

        return view
    }


}