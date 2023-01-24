package com.example.marketplace.database.itemforsale

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.marketplace.database.user.User
import java.sql.Date

@Entity(
    tableName = "items_for_sale",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("owner_user_id"),
            onDelete = ForeignKey.CASCADE
        ),
    ],
)
data class ItemForSale(
    @ColumnInfo(name = "image_data") var imageData: Bitmap? = null,
    @ColumnInfo(name = "item_name") var itemName: String,
    @ColumnInfo(name = "item_price") var itemPrice: Float,
    @ColumnInfo(name = "item_description") var itemDescription: String,
    @ColumnInfo(name = "date_listed") var dateListed: Date,
    @ColumnInfo(name = "owner_user_id") var ownerUserId: Int,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
