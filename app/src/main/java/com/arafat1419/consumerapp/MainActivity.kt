package com.arafat1419.consumerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arafat1419.baselibrary.BaseCode
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLibraryOne = findViewById<MaterialButton>(R.id.btn_library_one)
        val btnLibraryTwo = findViewById<MaterialButton>(R.id.btn_library_two)

        btnLibraryOne.setOnClickListener {
            BaseCode.libraryOneToast(this)
        }

        btnLibraryTwo.setOnClickListener {
            BaseCode.libraryTwoToast(this)
        }
    }
}