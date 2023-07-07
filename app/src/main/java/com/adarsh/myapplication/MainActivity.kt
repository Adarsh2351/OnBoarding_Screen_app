package com.adarsh.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout

lateinit var constraintLayout: ConstraintLayout
lateinit var frameLayout: FrameLayout
var flag = 0 ;

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isVisited = sharedPreferences.getBoolean("isVisited", false)

        setContentView(R.layout.activity_main)

        if(isVisited){
            val intent = Intent(this@MainActivity, Home::class.java)
            startActivity(intent)
            finish()
        }

        if(flag==0){
            savePreferences()
            supportFragmentManager.beginTransaction().replace(R.id.frame, AboutUsFragment()).commit()
        }else{
            val intent = Intent(this@MainActivity, Home::class.java)
            startActivity(intent)
        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savePreferences(){
        sharedPreferences.edit().putBoolean("isVisited", true).apply()
    }
}