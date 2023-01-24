package com.example.marketplace.database.itemsold

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.marketplace.database.user.User
import java.sql.Date

@Entity(
    tableName = "items_sold",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("buyer_user_id"),
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = User::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("seller_user_id"),
            onDelete = ForeignKey.SET_NULL
        ),
    ],
)
data class ItemSold(
    @ColumnInfo(name = "image_data") var imageData: Bitmap? = null,
    @ColumnInfo(name = "item_name") var itemName: String,
    @ColumnInfo(name = "item_price") var itemPrice: Float,
    @ColumnInfo(name = "item_description") var itemDescription: String,
    @ColumnInfo(name = "date_sold") var dateSold: Date,
    @ColumnInfo(name = "buyer_user_id") var buyerUserId: Int?,
    @ColumnInfo(name = "seller_user_id") var sellerUserId: Int?,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
