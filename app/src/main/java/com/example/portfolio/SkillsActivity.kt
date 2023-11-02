package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val skillsbutton=findViewById<Button>(R.id.Backbutton)
        skillsbutton.setOnClickListener{
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}