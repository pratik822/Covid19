package com.example.covid19.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.covid19.ui.fragments.case_Time_Fragment
import com.example.covid19.ui.fragments.statewise_Fragment
import com.example.covid19.ui.fragments.tested_Fragment

public class SlidePagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
       return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->return case_Time_Fragment();
            1->return statewise_Fragment();
            2->return tested_Fragment();
        }

        return case_Time_Fragment();
    }
}