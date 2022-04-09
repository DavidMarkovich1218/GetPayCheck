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
                    binding.inputCode.visibility = View.VISIBLE
                    when (inputCode ) {
                        Constatnce.BACKEND_CODE -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                            val tempText = ", Get ${Constatnce.BACKEND_PAYCHECK}$ paycheck"
                            binding.getResult.text = inputName + tempText
                        }
                        else -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#D36152"))
                            binding.getResult.text = "You enter wrong code. Please Try Again."
                        }
                    }

                }
                Constatnce.FRONTEND -> {
                    binding.inputCode.visibility = View.VISIBLE
                    when (inputCode ) {
                        Constatnce.FRONTEND_CODE -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                            val tempText = ", Get ${Constatnce.FRONTEND_PAYCHECK}$ paycheck"
                            binding.getResult.text = inputName + tempText
                        }
                        else -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#D36152"))
                            binding.getResult.text = "You enter wrong code. Please Try Again."
                        }
                    }
                }
                Constatnce.FULLSTACK -> {
                    binding.inputCode.visibility = View.VISIBLE
                    when (inputCode ) {
                        Constatnce.FULLSTACK_CODE -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                            val tempText = ", Get ${Constatnce.FULLSTACK_PAYCHECK}$ paycheck"
                            binding.getResult.text = inputName + tempText
                        }
                        else -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#D36152"))
                            binding.getResult.text = "You enter wrong code. Please Try Again."
                        }
                    }
                }
                Constatnce.NATIVE -> {
                    binding.inputCode.visibility = View.VISIBLE
                    when (inputCode ) {
                        Constatnce.NATIVE_CODE -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#5CB643"))
                            val tempText = ", Get ${Constatnce.NATIVE_PAYCHECK}$ paycheck"
                            binding.getResult.text = inputName + tempText
                        }
                        else -> {
                            binding.getResult.visibility = View.VISIBLE
                            binding.getResult.setTextColor(Color.parseColor("#D36152"))
                            binding.getResult.text = "You enter wrong code. Please Try Again."
                        }
                    }
                }
                else -> {
                    binding.getResult.visibility = View.VISIBLE
                    binding.inputCode.visibility = View.INVISIBLE
                    binding.getResult.setTextColor(Color.parseColor("#D36152"))
                    binding.getResult.text = "Your name was not found in the payroll database."
                }
            }
        }

    }
}