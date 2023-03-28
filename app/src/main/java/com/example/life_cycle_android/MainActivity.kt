package com.example.life_cycle_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifeCycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifeCycle", "onDestroy")
    }

}