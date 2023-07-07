package com.adarsh.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.google.android.material.button.MaterialButton

lateinit var missionImageButton: ImageButton
lateinit var skipMaterialButton2: MaterialButton

class OurMissionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_our_mission, container, false)

        missionImageButton = view.findViewById(R.id.img_btn_our_mission)
        missionImageButton.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.frame, OurVisionFragment() ).commit()
        }

        skipMaterialButton2 = view.findViewById(R.id.btn_skip2)
        skipMaterialButton2.setOnClickListener{
            val intent = Intent(this@OurMissionFragment.requireContext(), Home::class.java)
            startActivity(intent)
        }

        return view
    }
}