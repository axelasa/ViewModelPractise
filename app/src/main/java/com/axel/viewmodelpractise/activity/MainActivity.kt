package com.axel.viewmodelpractise.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.axel.viewmodelpractise.databinding.ActivityMainBinding
import com.axel.viewmodelpractise.viewmodel.IncrementViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //instanciate the viewmodel class in your main activity
        val viewModel = ViewModelProvider(this)[IncrementViewModel::class.java]
        
        binding.numberView.text = viewModel.counter.toString()

        //business logic to carryout operation
        binding.increment.setOnClickListener {
            viewModel.add()
            binding.numberView.text = viewModel.counter.toString()
        }
        binding.decrement.setOnClickListener {
            viewModel.subtract()
            binding.numberView.text = viewModel.counter.toString()
        }
    }
}