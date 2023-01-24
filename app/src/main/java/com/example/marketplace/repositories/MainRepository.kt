package com.example.marketplace.repositories

import com.example.marketplace.database.itemforsale.ItemForSale
import com.example.marketplace.database.itemforsale.ItemForSaleDao
import com.example.marketplace.database.itemsold.ItemSold
import com.example.marketplace.database.itemsold.ItemSoldDao
import com.example.marketplace.database.user.User
import com.example.marketplace.database.user.UserDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val itemForSaleDao: ItemForSaleDao,
    val itemSoldDao: ItemSoldDao,
    val userDao: UserDao
) {
    fun getAllItemsForSale() = itemForSaleDao.getAllItemsForSale()

    suspend fun insertItemForSale(itemForSale: ItemForSale) = itemForSaleDao.insertItemForSale(itemForSale)

    suspend fun deleteItemForSale(itemForSale: ItemForSale) = itemForSaleDao.deleteItemForSale(itemForSale)

    fun getAllItemsBoughtByUser(userId: Int) = itemSoldDao.getAllItemsBoughtByUser(userId)

    fun getAllItemsSoldByUser(userId: Int) = itemSoldDao.getAllItemsSoldByUser(userId)

    suspend fun insertItemSold(itemSold: ItemSold) = itemSoldDao.insertItemSold(itemSold)

    suspend fun deleteItemSold(itemSold: ItemSold) = itemSoldDao.deleteItemSold(itemSold)

    fun getAllUsers() = userDao.getAllUsers()

    suspend fun insertUser(user: User) = userDao.insertUser(user)

    suspend fun deleteUser(user: User) = userDao.deleteUser(user)
}