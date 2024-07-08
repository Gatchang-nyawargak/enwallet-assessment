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
        var income1 = Income("","IncomeIn",5353)
        var income2 = Income("","IncomeIn",5353)
        var income3 = Income("","IncomeIn",5353)
        var income4 = Income("","IncomeIn",5353)
        var income5 = Income("","IncomeIn",5353)
        var income6 = Income("","IncomeIn",5353)
        var income7 = Income("","IncomeIn",5353)
        var income8= Income("","IncomeIn",5353)
        var incomeList = listOf(income1,income2,income3,income4,income5,income6,income7,income8)
        val incomeAdapter = IncomeAdapter(incomeList)
        binding.rvIncomes.adapter = incomeAdapter
    }
    }
