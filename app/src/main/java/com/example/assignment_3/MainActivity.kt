package com.example.assignment_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.editTextText)
        passwordEditText = findViewById(R.id.editTextText2)

        val signInMyntraButton = findViewById<Button>(R.id.button6)
        signInMyntraButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                showToast("Please enter both name and password")
            } else {
                val intent = Intent(this, MyntraSignInActivity::class.java)
                startActivity(intent)
            }
        }

        val signInAmazonButton = findViewById<Button>(R.id.button7)
        signInAmazonButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                showToast("Please enter both name and password")
            } else {
                val intent = Intent(this, AmazonSignInActivity::class.java)
                startActivity(intent)
            }
        }

        val signInFlipkartButton = findViewById<Button>(R.id.button8)
        signInFlipkartButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                showToast("Please enter both name and password")
            } else {
                val intent = Intent(this, FlipkartSignInActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
