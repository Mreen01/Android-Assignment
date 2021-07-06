package com.laurentdarl.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.laurentdarl.recyclerview.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            profileView.setImageResource(intent.getStringExtra("ProfileView")!!.toInt())
            firstName.text = intent.getStringExtra("firstName")
            lastName.text = intent.getStringExtra("lastName")


        }
    }
}