package com.example.marketplace.di

import android.content.Context
import androidx.room.Room
import com.example.marketplace.database.MarketplaceDatabase
import com.example.marketplace.database.itemforsale.ItemForSaleDao
import com.example.marketplace.database.itemsold.ItemSoldDao
import com.example.marketplace.database.user.UserDao
import com.example.marketplace.other.Constants.MARKETPLACE_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMarketplaceDatabase(
        @ApplicationContext appContext: Context
    ): MarketplaceDatabase {
        return Room.databaseBuilder(
            context = appContext,
            klass = MarketplaceDatabase::class.java,
            name = MARKETPLACE_DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideItemForSaleDao(db: MarketplaceDatabase): ItemForSaleDao {
        return db.getItemForSaleDao()
    }

    @Singleton
    @Provides
    fun provideItemSoldDao(db: MarketplaceDatabase): ItemSoldDao {
        return db.getItemSoldDao()
    }

    @Singleton
    @Provides
    fun provideUserDao(db: MarketplaceDatabase): UserDao {
        return db.getUserDao()
    }
}