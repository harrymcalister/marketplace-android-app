package com.example.marketplace.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.marketplace.database.itemforsale.ItemForSale
import com.example.marketplace.database.itemforsale.ItemForSaleDao
import com.example.marketplace.database.itemsold.ItemSold
import com.example.marketplace.database.itemsold.ItemSoldDao
import com.example.marketplace.database.user.User
import com.example.marketplace.database.user.UserDao

@Database(
    entities = [
        User::class,
        ItemForSale::class,
        ItemSold::class
    ],
    version = 1
)
@TypeConverters(Converters::class)
abstract class MarketplaceDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao
    abstract fun getItemForSaleDao(): ItemForSaleDao
    abstract fun getItemSoldDao(): ItemSoldDao
}

