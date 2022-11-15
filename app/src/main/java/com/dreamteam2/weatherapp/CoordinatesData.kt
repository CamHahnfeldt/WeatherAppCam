package com.dreamteam2.weatherapp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoordinatesData(
    @SerialName("type")
    val type: String? = "",
    @SerialName("features")
    val features: List<CoordinatesAPIFeatures>? = emptyList(),

    )