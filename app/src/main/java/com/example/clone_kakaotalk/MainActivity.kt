package com.example.clone_kakaotalk

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import androidx.annotation.RequiresApi
import com.example.clone_kakaotalk.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.itemIconTintList = null

        val ssb = SpannableStringBuilder(binding.txtDust.text)

        ssb.setSpan(
            ForegroundColorSpan(getColor(R.color.green)),
            5,
            7,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.txtDust.text = ssb
    }

}