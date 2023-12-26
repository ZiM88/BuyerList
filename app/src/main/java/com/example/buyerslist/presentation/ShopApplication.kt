package com.example.buyerslist.presentation

import android.app.Application
import com.example.buyerslist.di.DaggerApplicationComponent

class ShopApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}