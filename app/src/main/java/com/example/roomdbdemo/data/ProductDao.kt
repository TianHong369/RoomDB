package com.example.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p : Product)

    @Query("Select * From product_table")
    fun getAll() : List<Product>

    @Query("Select * From product_table Where price < :priceRange")
    fun getPriceLessThan(priceRange:Double):List<Product>

}