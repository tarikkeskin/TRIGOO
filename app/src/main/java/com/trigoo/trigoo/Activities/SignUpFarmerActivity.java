package com.trigoo.trigoo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivitySignUpFarmerBinding;

public class SignUpFarmerActivity extends AppCompatActivity {
    private ActivitySignUpFarmerBinding t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t = ActivitySignUpFarmerBinding.inflate(getLayoutInflater());
        setContentView(t.getRoot());

        t.buttonFarmerKayit.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpFarmerActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        t.textViewFarmerGirisYap.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpFarmerActivity.this,LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}