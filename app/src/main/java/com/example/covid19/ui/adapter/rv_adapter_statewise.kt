package com.example.covid19.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.R
import com.example.covid19.databinding.RvListBinding
import com.example.covid19.utils.CustomDialog

class rv_adapter_statewise(var context: Context, var list: List<Statewise>):RecyclerView.Adapter<rv_adapter_statewise.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var tv1:TextView=itemView.findViewById(R.id.textView);
         var tv2:TextView=itemView.findViewById(R.id.textView2);
         var tv3:TextView=itemView.findViewById(R.id.textView3);
         var tv4:TextView=itemView.findViewById(R.id.textView4);
        var  ll_holder: LinearLayout =itemView.findViewById(R.id.ll_holder);


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=RvListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv1.text="state: "+list[position].state;
        holder.tv2.text="active: "+list[position].active;
        holder.tv3.text="recovered: "+list[position].recovered;
        holder.tv4.text="deaths: "+list[position].deaths;

        holder.ll_holder.setOnClickListener {
            var dialog= CustomDialog(context,list[position]);
        }
    }

    override fun getItemCount(): Int {
       return list.size;
    }
}