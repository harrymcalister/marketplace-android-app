package com.example.marketplace.database

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream
import java.sql.Date

class Converters {

    // Store image data as a ByteArray in the database using varbinary
    // as Bitmap is not compatible
    @TypeConverter
    fun toBitmapFromByteArray(byteArray: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }

    @TypeConverter
    fun fromBitmapToByteArray(bmp: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    // Store dates as a Long (milliseconds) in the database as Date
    // type is not compatible
    @TypeConverter
    fun toDateFromLong(dateLong: Long): Date {
        return Date(dateLong)
    }

    @TypeConverter
    fun toLongFromDate(date: Date): Long {
        return date.time
    }

    // Store currency as a string in the database to allow for
    // different currency representations
    @TypeConverter
    fun toFloatFromString(string: String): Float {
        return string.toFloat()
    }

    @TypeConverter
    fun toStringFromFloat(float: Float): String {
        return float.toString()
    }
}