package com.example.covid19.ui

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.widget.Button
import android.widget.TextView
import com.example.covid19.Networking.data.CasesTimeSery
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.Networking.data.Tested
import com.example.covid19.R
import com.google.gson.Gson

class CustomDialog<T>(context: Context, args: T):Dialog(context,0)  {
    init {
        var dialogbuilder=AlertDialog.Builder(context)
        var dialog:AlertDialog;
        val view = layoutInflater.inflate(R.layout.dialog,null)
        var btn_close:Button=view.findViewById(R.id.btn_close);
        var textView5:TextView=view.findViewById(R.id.textView5);
    if(args is Tested){
        textView5.text=args.totaldosesadministered+"\n"+
                args.dailyrtpcrsamplescollectedicmrapplication+"\n"+
                args.firstdoseadministered+"\n"+
                args.frontlineworkersvaccinated1stdose+"\n"+
                args.frontlineworkersvaccinated2nddose+"\n"+
                args.over45years1stdose+"\n"+
                args.over45years2nddose+"\n"+
                args.over60years1stdose+"\n"+
                args.over60years2nddose+"\n"+
                args.positivecasesfromsamplesreported+"\n"+
                args.registrationabove45years+"\n"+
                args.registrationflwhcw+"\n"+
                args.registrationonline+"\n"+
                args.registrationonspot+"\n"+
                args.samplereportedtoday+"\n"+
                args.seconddoseadministered+"\n"+
                args.source+"\n"+
                args.source2+"\n"+
                args.source3+"\n"+
                args.source4+"\n";
    }else if(args is Statewise) {
        textView5.text=args.deaths+"\n"+
                args.active+"\n"+
                args.confirmed+"\n"+
                args.deltaconfirmed+"\n"+
                args.deltadeaths+"\n"+
                args.deltarecovered+"\n"+
                args.lastupdatedtime+"\n"+
                args.migratedother+"\n"+
                args.recovered+"\n"+
                args.state+"\n"+
                args.statecode+"\n"+
                args.statenotes+"\n"
    }else if(args is CasesTimeSery) {
        textView5.text=args.totaldeceased+"\n"+
                args.dailyconfirmed+"\n"+
                args.dailyrecovered+"\n"+
                args.date+"\n"+
                args.dateymd+"\n"+
                args.totalconfirmed+"\n"+
                args.totalrecovered+"\n"


    }


        dialogbuilder.setView(view);
        dialog=dialogbuilder.create();
        dialog.show();
        btn_close.setOnClickListener {
            dialog.dismiss();
        }



    }



}