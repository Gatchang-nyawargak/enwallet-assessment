package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvIncomes.layoutManager= LinearLayoutManager(this)
        incomeAmount()


    }
    fun incomeAmount(){
        var income1 = Income("","Salary","KES 7600","1 July 2024")
        var income2 = Income("","Rent","KES 16000","2 July 2024")
        var income3 = Income("","Dividends","KES 24000","4 July 2024")
        var income4 = Income("","Electricity","KES 800","5 July 2024")
        var income5 = Income("","Internet","KES 2500","5 July 2024")
        var income6 = Income("","Shopping","KES 3500","5 July 2024")
        var income7= Income("","Bus fare","KES 500","11 July 2024")
        var income8 = Income("","Water bill","KES 1300","12 July 2024")
        var income9 = Income("","Gas","KES 700","1 July 2024")
        var income10 = Income("","Food","KES 1600","1 July 2024")
        var income11= Income("","Laundry","KES 600","1 July 2024")
        val incomeList = listOf(income1,income2,income3,income4,income5,income6,income7,income8,income9,income10,income11)
        val incomeAdapter = IncomeAdapter(incomeList)
        binding.rvIncomes.adapter = incomeAdapter
    }
    }
