package com.example.dessertclicker.ui

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource

data class DessertUIState (
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int =
        Datasource.dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int =
        Datasource.dessertList[currentDessertIndex].imageId
)