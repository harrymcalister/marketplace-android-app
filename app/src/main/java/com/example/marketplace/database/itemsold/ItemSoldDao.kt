package com.example.marketplace.database.itemsold

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemSoldDao {

    @Query("SELECT * FROM items_sold WHERE buyer_user_id = :userId ORDER BY date_sold DESC")
    fun getAllItemsBoughtByUser(userId: Int): Flow<List<ItemSold>>

    @Query("SELECT * FROM items_sold WHERE seller_user_id = :userId ORDER BY date_sold DESC")
    fun getAllItemsSoldByUser(userId: Int): Flow<List<ItemSold>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItemSold(itemSold: ItemSold)

    @Delete
    suspend fun deleteItemSold(itemSold: ItemSold)
}