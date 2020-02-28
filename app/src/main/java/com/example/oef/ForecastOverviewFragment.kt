package com.example.oef

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.oef.databinding.FragmentForecastOverviewBinding

class ForecastOverviewFragment : Fragment() {

    var TAG = "FORECAST"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentForecastOverviewBinding.inflate(inflater, container, false)
        binding.temp = InjectorUtils(ForecastRepository()).provideForecastViewModelFactory().create(ForecastViewModel::class.java)
        binding.lifecycleOwner = this
        return  binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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