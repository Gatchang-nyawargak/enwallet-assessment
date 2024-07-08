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
        holder.incomeIn.text= income.text.toString()
        holder.incomeOut.text = income.image.toString()
        holder.transactiom.text=income.amount.toString()

    }


}




class  IncomeViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView){
            val incomeIn = itemView.findViewById<TextView>(R.id.textView9)
             val amount = itemView.findViewById<TextView>(R.id.textView10)
             val incomeOut = itemView.findViewById<TextView>(R.id.textView11)
             val bal  = itemView.findViewById<TextView>(R.id.textView12)
             val balance = itemView.findViewById<TextView>(R.id.textView13)
            val balanceKes  = itemView.findViewById<TextView>(R.id.textView14)
            val transactiom = itemView.findViewById<TextView>(R.id.textView15)
            val balanceKe  = itemView.findViewById<TextView>(R.id.textView16)





}

