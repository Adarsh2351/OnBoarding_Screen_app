package com.adarsh.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

lateinit var imageView: ImageView
lateinit var textView: TextView
lateinit var feedButton: Button
lateinit var uploadImageButton: Button


class Home : AppCompatActivity() {


    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        imageView = findViewById(R.id.img_welcome)
        textView = findViewById(R.id.txt_welcome_ayush)
        feedButton = findViewById(R.id.btn_feed)
        uploadImageButton = findViewById(R.id.btn_upload_image)
        uploadImageButton.setOnClickListener{
            val intent = Intent(this@Home, UploadImageActivity::class.java)
            startActivity(intent)
        }

        flag = 1;
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}