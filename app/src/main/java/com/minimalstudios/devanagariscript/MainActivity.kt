package com.minimalstudios.devanagariscript

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minimalstudios.devanagariscript.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVowelsDevanagariToRoman.setOnClickListener {
            startActivity(Intent(it.context, VowelsDevanagariToRomanActivity:: class.java))
        }
        binding.btnVowelsRomanToDevanagari.setOnClickListener {
            startActivity(Intent(it.context, VowelsRomanToDevanagariActivity:: class.java))
        }
        binding.btnConsonantsDevanagariToRoman.setOnClickListener {
            startActivity(Intent(it.context, ConsonantsDevanagariToRomanActivity:: class.java))
        }
        binding.btnConsonantsRomanToDevanagari.setOnClickListener {
            startActivity(Intent(it.context, ConsonantsRomanToDevanagariActivity:: class.java))
        }
    }
}