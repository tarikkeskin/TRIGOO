package com.trigoo.trigoo.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivityFarmerProfileBinding;

public class FarmerProfileActivity extends AppCompatActivity{
    private ActivityFarmerProfileBinding binding;
    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFarmerProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }


}