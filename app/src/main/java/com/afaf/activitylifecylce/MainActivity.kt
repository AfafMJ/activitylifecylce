package com.afaf.activitylifecylce


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "On Create")

        Toast.makeText(this,"On Create" ,Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start")
        Toast.makeText(this,"On Start" ,Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause")
        Toast.makeText(this,"On pause" ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume")
        Toast.makeText(this,"On Resume" ,Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop")
        Toast.makeText(this,"On Stop" ,Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy")
        Toast.makeText(this,"On Destroy" ,Toast.LENGTH_SHORT).show()
    }

}