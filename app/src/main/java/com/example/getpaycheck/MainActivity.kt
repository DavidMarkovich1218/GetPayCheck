package com.example.getpaycheck

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.getpaycheck.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.getBtn.setOnClickListener(){
            val inputName = binding.inputNameEdit.text.toString()
            when(inputName){
                "Alex" -> {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                        binding.getResult.text = inputName+", Get 1000$ paycheck"
                    }
                "Nikita" -> {
                    binding.getResult.visibility = View.VISIBLE
                    binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                    binding.getResult.text = inputName+", Get 900$ paycheck"
                }
                "Vasiliy" -> {
                    binding.getResult.visibility = View.VISIBLE
                    binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                    binding.getResult.text = inputName+", Get 875$ paycheck"
                }
                "David" -> {
                    binding.getResult.visibility = View.VISIBLE
                    binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                    binding.getResult.text = inputName+", Get 1230$ paycheck"
                }
                else -> {
                    binding.getResult.visibility = View.VISIBLE
                    binding.getResult.setTextColor(Color.parseColor("#D36152"))
                    binding.getResult.text = "Your name was not found in the payroll database."
                }
            }
        }

    }
}