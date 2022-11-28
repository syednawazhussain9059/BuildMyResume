package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
class DetailsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        val button1 = findViewById<Button>(R.id.generate_btn)



        button1.setOnClickListener {

            val name = findViewById<TextView>(R.id.name)
            val name1 = name.text.toString()
            val email = findViewById<TextView>(R.id.email)
            val email1 = email.text.toString()
            val phone = findViewById<TextView>(R.id.PhoneNumber)
            val phone1 = phone.text.toString()
            val address = findViewById<TextView>(R.id.Address)
            val address1 = address.text.toString()

            val des1 = findViewById<TextView>(R.id.description)
            val des11 = des1.text.toString()

            val companyName = findViewById<TextView>(R.id.companyName)
            val companyName1 = companyName.text.toString()
            val jobRole = findViewById<TextView>(R.id.job_role)
            val jobRole1 = jobRole.text.toString()
            val fromYear = findViewById<TextView>(R.id.from_year)
            val fromYear1 = fromYear.text.toString()
            val toYear = findViewById<TextView>(R.id.to_year)
            val toYear1 = toYear.text.toString()
            val des2 = findViewById<TextView>(R.id.description2)
            val des21 = des2.text.toString()

            val degree = findViewById<TextView>(R.id.degree)
            val degree1 = degree.text.toString()
            val university = findViewById<TextView>(R.id.university)
            val university1 = university.text.toString()
            val studFrom = findViewById<TextView>(R.id.stud_from)
            val studFrom1 = studFrom.text.toString()
            val studTo = findViewById<TextView>(R.id.stud_to)
            val studTo1 = studTo.text.toString()

            val skillData = findViewById<TextView>(R.id.skill_data)
            val skillData1 = skillData.text.toString()

            val intent = Intent(this@DetailsPage, ResumeActivity::class.java)
            intent.putExtra("NAME", name1)
            intent.putExtra("EMAIL", email1)
            intent.putExtra("PHONE", phone1)
            intent.putExtra("ADDRESS", address1)

            intent.putExtra("DES1", des11)
            intent.putExtra("COMPANY_NAME", companyName1)
            intent.putExtra("JOB_ROLE", jobRole1)
            intent.putExtra("FROM_YEAR", fromYear1)
            intent.putExtra("TO_YEAR", toYear1)
            intent.putExtra("DES2", des21)

            intent.putExtra("DEGREE", degree1)
            intent.putExtra("UNIVERSITY", university1)
            intent.putExtra("STUD_FROM", studFrom1)
            intent.putExtra("STUD_TO", studTo1)

            intent.putExtra("SKILL_DATA", skillData1)

            if (name1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Name")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (email1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Email")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if(!email1.contains("@gmail.com")) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Correct Email")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (phone1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Phone Number")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (phone1.length != 10) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Phone Number Should have 10 Digits")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (address1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Address")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (des11.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Description (About You)")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
//            } else if (companyName1.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the Company Name")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
//            } else if (jobRole1.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the Job Role")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
//            } else if (fromYear1.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the From Year Under Work Experience")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
//            } else if (toYear1.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the To Year Under Work Experience")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
//            } else if (des21.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the Work Description")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
                } else if (degree1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the Degree")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (university1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the University")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (studFrom1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the From Year Under Education")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
            } else if (studTo1.isBlank()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error!")
                builder.setMessage("Enter the To Year Under Education")
                builder.setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("OK") { _, _ ->
                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(true)
                alertDialog.show()
//            } else if (skillData1.isBlank()) {
//                val builder = AlertDialog.Builder(this)
//                builder.setTitle("Error!")
//                builder.setMessage("Enter the Skills")
//                builder.setIcon(android.R.drawable.ic_dialog_alert)
//                builder.setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
//                }
//                val alertDialog: AlertDialog = builder.create()
//                alertDialog.setCancelable(true)
//                alertDialog.show()
              }
            else {
                startActivity(intent)
            }
        }

    }
}
