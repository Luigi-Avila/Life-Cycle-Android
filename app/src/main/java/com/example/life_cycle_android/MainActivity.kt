package com.example.life_cycle_android

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer = MediaPlayer.create(this, R.raw.ai_2)
        Log.i("LifeCycle", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer?.seekTo(position)
        mediaPlayer?.start()
        Log.i("LifeCycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
        if (mediaPlayer != null){
            position = mediaPlayer!!.currentPosition
        }
        Log.i("LifeCycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
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