package com.example.oef

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ForecastRepository {
    init {
        webserviceMock = WebserviceMock()
        mutabledata = MutableLiveData(webserviceMock.fetchForecast("Ghent"))
    }

    companion object{
        @Volatile private var instance: ForecastRepository? = null
        fun getInstance()  = instance ?: synchronized(this){
            instance?: ForecastRepository().also { instance = it }
        }
        private lateinit var  webserviceMock: WebserviceMock
        private lateinit var mutabledata: MutableLiveData<Forecast>
    }

    fun getLiveData(): LiveData<Forecast>{
        return mutabledata
    }

    fun update(){
        mutabledata.postValue(webserviceMock.fetchForecast("Ghent"))
    }
}