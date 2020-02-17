package com.example.oef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    val TAG = "ON CREATE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG, " CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, " START")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, " RESUME")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG, " RESTART")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, " PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG, " STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, " DESTROY")
    }

}

class ForecastOverviewFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_forecast_overview)

    }

}
