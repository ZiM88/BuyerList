package com.example.buyerslist.presentation

import androidx.lifecycle.ViewModel
import com.example.buyerslist.data.ShopListRepositoryImpl
import com.example.buyerslist.domain.DeleteShopItemUseCase
import com.example.buyerslist.domain.EditShopItemUseCase
import com.example.buyerslist.domain.GetShopListUseCase
import com.example.buyerslist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}