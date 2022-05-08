package com.example.covid19.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.Networking.data.Tested
import com.example.covid19.R
import com.example.covid19.databinding.RvListBinding
import com.example.covid19.ui.CustomDialog

class rv_adapter_tested(var context: Context, var list: List<Tested>):RecyclerView.Adapter<rv_adapter_tested.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var tv1:TextView=itemView.findViewById(R.id.textView);
         var tv2:TextView=itemView.findViewById(R.id.textView2);
         var tv3:TextView=itemView.findViewById(R.id.textView3);
         var tv4:TextView=itemView.findViewById(R.id.textView4);
         var  ll_holder:LinearLayout=itemView.findViewById(R.id.ll_holder);


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=RvListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ll_holder.setOnClickListener {
            var dialog= CustomDialog(context,list[position]);
        }
        holder.tv1.text="testedasof: "+list[position].testedasof;
        holder.tv2.text="dailyrtpcrsamplescollected: "+list[position].dailyrtpcrsamplescollectedicmrapplication;
        holder.tv3.text="samplereportedtoday: "+list[position].samplereportedtoday;
        holder.tv4.text="totaldosesadministered: "+list[position].totaldosesadministered;



    }

    override fun getItemCount(): Int {
       return list.size;
    }
}