package com.example.coroutineskotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Learn about Coroutines from https://www.youtube.com/watch?v=kvfpuzSwVZ8
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            delay(3000L)
            Log.d(TAG, "Coroutines says hello from thread ${Thread.currentThread().name}")
        }
        Log.d(TAG, "Hello from thread NOT in Coroutine ${Thread.currentThread().name}")
    }
}