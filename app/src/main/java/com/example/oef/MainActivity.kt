package com.example.oef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableInt
import androidx.fragment.app.Fragment
import com.example.oef.databinding.FragmentForecastOverviewBinding


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

data class Temp(
    var temp: ObservableInt
)

class ForecastOverviewFragment : Fragment() {

    var TAG = "FORECAST"

    lateinit var temperature: Temp

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentForecastOverviewBinding.inflate(inflater, container, false)
        binding.temp = temperature
        binding.button.setOnClickListener{
            temperature.temp.set(temperature.temp.get() + 1)
        }
        return  binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        temperature = Temp(ObservableInt(16))
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
