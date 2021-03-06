package com.example.mydictionary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydictionary.R
import com.example.mydictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.root_container,
                MainFragment.newInstance()
            ).commit()
        }
    }
}