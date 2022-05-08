package com.example.covid19.ui

import com.example.covid19.Networking.data.Tested

interface RecyclerItemListener {
    fun onItemSelected(tested: Tested )
}