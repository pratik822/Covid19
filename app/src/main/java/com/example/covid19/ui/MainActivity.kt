package com.example.covid19.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.covid19.databinding.ActivityMainBinding
import com.example.covid19.ui.adapter.SlidePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    var tabList= arrayListOf<String>("Case Time","StateWise","Tested")
    lateinit var binding:ActivityMainBinding;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater);
        val view=binding.root
        setContentView(view)
        var viewPager=binding.pager
        var tablayout=binding.tabLayout
        var adapter= SlidePagerAdapter(supportFragmentManager,lifecycle)


        viewPager.adapter=adapter;


        TabLayoutMediator(tablayout,viewPager){
            tab,position->tab.text=tabList[position]
        }.attach();






    }
}