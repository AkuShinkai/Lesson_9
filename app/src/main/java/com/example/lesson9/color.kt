package com.example.lesson9

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("colors")
data class color(
    @PrimaryKey(autoGenerate = true) val _id: Int,
    @ColumnInfo("hex_color") val hex: String,
    val name: String
)
