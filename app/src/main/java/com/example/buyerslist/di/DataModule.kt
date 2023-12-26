package com.example.buyerslist.di

import android.app.Application
import com.example.buyerslist.data.AppDatabase
import com.example.buyerslist.data.ShopListDao
import com.example.buyerslist.data.ShopListRepositoryImpl
import com.example.buyerslist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}