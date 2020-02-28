package com.example.oef

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat

class ForecastViewModel(val repository: ForecastRepository) : ViewModel() {

    var TAG = "TEMP"
    private val formatter = SimpleDateFormat("HH:mm:ss")

    fun getTemperatureString(): LiveData<String> {
        return Transformations.map(repository.getLiveData()) {
                temp -> "${temp.temperature}°"
        }
    }

    fun getLastUpdatedString(): LiveData<String>{
        return Transformations.map(repository.getLiveData()){
            temp ->
            formatter.format(temp.lastUpdated)
        }
    }

    fun update(){
        repository.update()
    }

}