package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AchievementsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        val achbutton=findViewById<Button>(R.id.Backbuttonachie)
        achbutton.setOnClickListener{
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}