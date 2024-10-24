package com.example.cakebox;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivityJavatbd extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;

    // Predefined credentials for testing
    private final String correctEmail = "user@example.com";
    private final String correctPassword = "password123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        // Initialize views
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);

        // Set login button click listener
        loginButton.setOnClickListener(view -> {
            String inputEmail = emailEditText.getText().toString().trim();
            String inputPassword = passwordEditText.getText().toString().trim();

            // Check if email and password match predefined credentials
            Intent intent;
            if (inputEmail.equals(correctEmail) && inputPassword.equals(correctPassword)) {
                // If credentials match, navigate to HomeActivity
                intent = new Intent(LoginActivityJavatbd.this, HomeActivity.class);
            } else {
                // If credentials don't match, navigate to ErrorActivity
                intent = new Intent(LoginActivityJavatbd.this, ErrorActivity.class);
            }
            startActivity(intent);
        });
    }
}
