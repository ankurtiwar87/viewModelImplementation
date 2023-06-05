package com.ankur.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ankur.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: mainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel=ViewModelProvider(this).get(mainActivityViewModel::class.java)

        binding.textView.text=viewModel.count.toString()
        binding.button.setOnClickListener {
//            ++count
//            binding.textView.text=count.toString()

//            Now We use ViewModel Function to change the value

            viewModel.updateCount()
            binding.textView.text=viewModel.count.toString()
        }

    }
}