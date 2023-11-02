package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills=findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)

        }
            val edubutton=findViewById<Button>(R.id.btnEducation)
            edubutton.setOnClickListener {
                intent = Intent(this, EducationActivity::class.java)
                startActivity(intent)
            }

        val workbutton=findViewById<Button>(R.id.btnWork)
        workbutton.setOnClickListener{
            intent= Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        val achbutton=findViewById<Button>(R.id.btnAchievements)
        achbutton.setOnClickListener{
            intent= Intent(this,AchievementsActivity::class.java)
            startActivity(intent)
        }
    }
}