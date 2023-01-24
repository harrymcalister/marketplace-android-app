package com.example.marketplace.database.itemforsale

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemForSaleDao {
    @Query("SELECT * FROM items_for_sale")
    fun getAllItemsForSale(): Flow<List<ItemForSale>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItemForSale(itemForSale: ItemForSale)

    @Delete
    suspend fun deleteItemForSale(itemForSale: ItemForSale)
}