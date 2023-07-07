package com.adarsh.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.google.android.material.button.MaterialButton

lateinit var imageButton: ImageButton
lateinit var skipMaterialButton1 : MaterialButton
class AboutUsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about_us, container, false)

        imageButton = view.findViewById(R.id.img_btn_about_us)
        imageButton.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.frame, OurMissionFragment() ).commit()
        }

        skipMaterialButton1 = view.findViewById(R.id.btn_skip1)
        skipMaterialButton1.setOnClickListener{
            val intent = Intent(this@AboutUsFragment.requireContext(), Home::class.java)
            startActivity(intent)
        }
        return view
    }

}