package com.trigoo.trigoo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(t.getRoot());

        t.textViewGirisYap.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        t.buttonCiftciKayit.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpActivity.this, SignUpFarmerActivity.class);
            startActivity(intent);
            finish();
        });

        t.buttonTraktorSahibiKayit.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpActivity.this, SignUpFarmerActivity.class);
            startActivity(intent);
            finish();
        });
    }
}