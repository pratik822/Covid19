package com.example.covid19.ui.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.covid19.Networking.db.AppDatabase
import com.example.covid19.Repository.DbRepository
import com.example.covid19.databinding.FragmentCovidDataBinding
import com.example.covid19.ui.CovidDataViewModel
import com.example.covid19.ui.CovidDataViewModeldb
import com.example.covid19.ui.adapter.rv_adapter_casetime
import com.example.covid19.utils.DataState
import com.example.covid19.utils.Resources
import com.example.covid19.utils.Status


class case_Time_Fragment : Fragment() {
    private lateinit var binding:FragmentCovidDataBinding;
    lateinit var rvAdapter: rv_adapter_casetime;
    private lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var db:AppDatabase;
    lateinit var dbRepository: DbRepository;
    val viewmodel: CovidDataViewModel by activityViewModels();
    val viewmodeldb: CovidDataViewModeldb by activityViewModels();
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentCovidDataBinding.inflate(inflater,container,false);
         val view = binding.root



        viewmodeldb.getCaseTimeSeryData().observe(requireActivity(), Observer {

            if(!Connectivity.isOnline(requireContext())){
                if(it!=null && it.size>0){
                    linearLayoutManager = LinearLayoutManager(requireContext())
                    binding.rv.layoutManager = linearLayoutManager
                    rvAdapter = rv_adapter_casetime(requireContext(), it);
                    binding.rv.adapter=rvAdapter;

                }
            }
        })

        viewmodel.getCovidData()?.observe(requireActivity(), Observer {

            when (it.status) {
                Status.LOADING->{
                    println("Loading...");
                }
                Status.SUCCESS->{
                    if (it.data?.cases_time_series != null && it.data?.cases_time_series.size > 0) {
                        if (it.data.cases_time_series != null && it.data.cases_time_series.size > 0) {
                            println("hello" + it.data.cases_time_series.size)
                            linearLayoutManager = LinearLayoutManager(requireContext())
                            binding.rv.layoutManager = linearLayoutManager
                            rvAdapter =
                                rv_adapter_casetime(requireContext(), it.data.cases_time_series);
                            binding.rv.adapter = rvAdapter;

                        }

                    }
                }
                Status.ERROR->{
                    println("Error occured");
                }

            }

        });



        return view;
    }


}