package com.example.myproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class ResumeActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        val switch: Switch = findViewById(R.id.switch1)

        switch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }


        val name = intent.getStringExtra("NAME")
        val nameId = findViewById<TextView>(R.id.name9)
        nameId.text = name

        val phone = intent.getStringExtra("PHONE")
        val phoneId = findViewById<TextView>(R.id.phone9)
        phoneId.text = phone

        val email = intent.getStringExtra("EMAIL")
        val emailId = findViewById<TextView>(R.id.email9)
        emailId.text = email

        val location = intent.getStringExtra("ADDRESS")
        val locationId = findViewById<TextView>(R.id.location9)
        locationId.text = location

        val description = intent.getStringExtra("DES1")
        val descriptionId = findViewById<TextView>(R.id.description9)
        descriptionId.text = description

        val jobRole = intent.getStringExtra("JOB_ROLE")
        val jobRoleId = findViewById<TextView>(R.id.job_role9)
        jobRoleId.text = jobRole

        val companyName = intent.getStringExtra("COMPANY_NAME")
        val fromYear = intent.getStringExtra("FROM_YEAR")
        val companyId = findViewById<TextView>(R.id.company9)
        companyId.text = "$companyName / $fromYear"

        val description2 = intent.getStringExtra("DES2")
        val description2Id = findViewById<TextView>(R.id.description29)
        description2Id.text = description2

        val degree = intent.getStringExtra("DEGREE")
        val degreeId = findViewById<TextView>(R.id.degree9)
        degreeId.text = degree

        val university = intent.getStringExtra("UNIVERSITY")
        val studFrom = intent.getStringExtra("STUD_FROM")
        val studTo = intent.getStringExtra("STUD_TO")
        val universityId = findViewById<TextView>(R.id.university9)
        universityId.text = "$university / $studFrom - $studTo"

        val skill = intent.getStringExtra("SKILL_DATA")
        val skillId = findViewById<TextView>(R.id.skills_data9)
        skillId.text = "$skill"





    }


    }

