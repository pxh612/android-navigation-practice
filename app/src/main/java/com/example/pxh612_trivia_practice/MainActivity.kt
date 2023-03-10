package com.example.pxh612_trivia_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.pxh612_trivia_practice.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.plant(MyTimberDebugTree())
        Timber.v("main activity...")
        super.onCreate(savedInstanceState)
        Timber.v("super onCreate...")
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        Timber.v("setContentView..")

    }
}