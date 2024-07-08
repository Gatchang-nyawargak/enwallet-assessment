package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class IncomeAdapter(val incomeTracker:List<Income>):
        RecyclerView.Adapter<IncomeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncomeViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.income_tracker_list,parent,false)
        return IncomeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return  incomeTracker.size
    }

    override fun onBindViewHolder(holder: IncomeViewHolder, position: Int) {
       var income = incomeTracker[position]
        holder.tvName.text = income.text
        holder.tvAmount.text = income.amount
        holder.tvData.text = income.date


    }


}




class  IncomeViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView){
            val tvName = itemView.findViewById<TextView>(R.id.tvName)
             val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
              val tvData = itemView.findViewById<TextView>(R.id.tvAmount)





}

