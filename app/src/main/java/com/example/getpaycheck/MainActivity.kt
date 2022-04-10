package com.example.getpaycheck

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.getpaycheck.constances.Constatnce
import com.example.getpaycheck.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.getBtn.setOnClickListener() {
            val inputName = binding.inputNameEdit.text.toString()
            val inputCode = binding.inputCodeEdit.text.toString()
            when (inputName) {
                Constatnce.BACKEND -> {
                    if(binding.inputCodeEdit.text.toString() == Constatnce.BACKEND_CODE) {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                        val tempText = ", Get ${Constatnce.FRONTEND_PAYCHECK}$ paycheck"
                        binding.getResult.text = inputName + tempText
                    }
                    else {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#D36152"))
                        binding.getResult.text = "You enter wrong code. Please Try Again."
                    }

                }
                Constatnce.FRONTEND -> {
                    if(binding.inputCodeEdit.text.toString() == Constatnce.FRONTEND_CODE) {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                        val tempText = ", Get ${Constatnce.FRONTEND_PAYCHECK}$ paycheck"
                        binding.getResult.text = inputName + tempText
                    }
                    else {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#D36152"))
                        binding.getResult.text = "You enter wrong code. Please Try Again."
                    }
                }
                Constatnce.FULLSTACK -> {
                    if(binding.inputCodeEdit.text.toString() == Constatnce.FULLSTACK_CODE) {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                        val tempText = ", Get ${Constatnce.FRONTEND_PAYCHECK}$ paycheck"
                        binding.getResult.text = inputName + tempText
                    }
                    else {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#D36152"))
                        binding.getResult.text = "You enter wrong code. Please Try Again."
                    }
                }
                Constatnce.NATIVE -> {
                    binding.inputCode.visibility = View.VISIBLE
                    if(binding.inputCodeEdit.text.toString() == Constatnce.NATIVE_CODE) {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                        val tempText = ", Get ${Constatnce.FRONTEND_PAYCHECK}$ paycheck"
                        binding.getResult.text = inputName + tempText
                    }
                    else {
                        binding.getResult.visibility = View.VISIBLE
                        binding.getResult.setTextColor(Color.parseColor("#D36152"))
                        binding.getResult.text = "You enter wrong code. Please Try Again."
                    }
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