package com.example.marketplace.database.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "users",
    indices = [
        Index(
            value = ["username"],
            unique = true
        ),
    ],
)
data class User(
    @ColumnInfo(name = "username") var username: String,
    @ColumnInfo(name = "password") var password: String,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}

