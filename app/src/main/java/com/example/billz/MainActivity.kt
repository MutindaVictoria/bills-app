package com.example.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivitymainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun validateAddContact() {
        val name = binding.etFirstName.text.toString()
        val name2 = binding.etLastName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()

        var error = false
        if (name.isEmpty()) {
            binding.tilFirstName.error = "First Name required"
            error = true
        }
        if (name2.isEmpty()) {
            binding.tillastName.error = "Last Name required"
            error = true
        }
        if (phoneNumber.isEmpty()) {
            binding.tilPhoneNumber.error = "Phone Number required"
            error = true
        }
        if (email.isEmpty()) {
            binding.tilEmail.error = "Email required"
            error = true
        }
        if (!error) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}