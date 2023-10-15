package com.example.assignment_3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyntraSignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myntra_sign_in)

        val nameEditText = findViewById<EditText>(R.id.editTextText7)
        val passwordEditText = findViewById<EditText>(R.id.editTextText8)
        val signInButton = findViewById<Button>(R.id.button3)

        signInButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (name.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Sign in successful!", Toast.LENGTH_SHORT).show()

            } else {
                // Show an error message if fields are empty
                Toast.makeText(this, "Please enter both name and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
