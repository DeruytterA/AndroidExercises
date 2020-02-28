package com.example.oef

class InjectorUtils(val repo: ForecastRepository){

    private fun getForecastRepository(): ForecastRepository{
        return repo
    }

    fun provideForecastViewModelFactory():ForecastViewModelFactory{
        return ForecastViewModelFactory(repo)
    }
}