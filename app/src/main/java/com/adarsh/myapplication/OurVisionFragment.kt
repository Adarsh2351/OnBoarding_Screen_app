package com.adarsh.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.button.MaterialButton

lateinit var ourVisionButton: ImageButton
lateinit var skipMaterialButton3: MaterialButton

class OurVisionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_our_vision, container, false)

        ourVisionButton = view.findViewById(R.id.img_btn_our_vision)
        skipMaterialButton3 = view.findViewById(R.id.btn_skip3)
        ourVisionButton.setOnClickListener{
            val intent = Intent(this@OurVisionFragment.requireContext(), Home::class.java)
            startActivity(intent)
        }
       skipMaterialButton3.setOnClickListener{
            val intent = Intent(this@OurVisionFragment.requireContext(), Home::class.java)
            startActivity(intent)
        }
        return view
    }
}