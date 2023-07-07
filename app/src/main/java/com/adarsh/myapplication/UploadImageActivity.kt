package com.adarsh.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

lateinit var btnSelectImage: Button
lateinit var imagePicked: ImageView
lateinit var imageBackButton: ImageButton

class UploadImageActivity : AppCompatActivity() {

    companion object{
        val IMAGE_REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image)

        btnSelectImage = findViewById(R.id.btn_select_image)
        imagePicked = findViewById(R.id.img_picked)

        btnSelectImage.setOnClickListener{
            pickImageGallery()
        }

        imageBackButton = findViewById(R.id.img_btn_back)
        imageBackButton.setOnClickListener {
            val intent = Intent(this@UploadImageActivity, Home::class.java)
            startActivity(intent)
        }

    }

    private fun pickImageGallery(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
            imagePicked.setImageURI(data?.data)
        }
    }


}