package com.example.buyerslist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun editShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}