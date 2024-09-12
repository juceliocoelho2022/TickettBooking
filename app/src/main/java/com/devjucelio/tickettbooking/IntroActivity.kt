package com.devjucelio.tickettbooking

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devjucelio.tickettbooking.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startBtn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

    }
}