package com.example.oef

import java.util.*

data class Forecast(
    val location: String, val temperature: Int, val message: String, val lastUpdated: Date)

class WebserviceMock {

    private val rand = Random()
    private val messages = listOf("Sunny", "Cloudy", "Chance of rain", "Rainy")

    fun fetchForecast(city: String) = Forecast(
        city, 0 + rand.nextInt(30), messages[rand.nextInt(messages.size)], Date())

}