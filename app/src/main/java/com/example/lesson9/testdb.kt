package com.example.lesson9

import android.graphics.Color
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class testdb {
    private lateinit val colorDao: colorDao
    private lateinit val db: ColorDatabase

    private val red=color(_id = 1, hex="#FF000", name = "Red")
}