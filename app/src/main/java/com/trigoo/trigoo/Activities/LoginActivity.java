package com.trigoo.trigoo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(t.getRoot());

        t.buttonGirisYap.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        t.textViewSifremiUnuttum.setOnClickListener(view -> {
            Log.e("Buton","Şifremi Unuttum");
        });

        t.textViewKayitOl.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });
    }
}