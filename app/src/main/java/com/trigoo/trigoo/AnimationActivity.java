package com.trigoo.trigoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.trigoo.trigoo.databinding.ActivityAnimationBinding;

public class AnimationActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    private ActivityAnimationBinding tasarim;

    //Variables
    Animation topAnim, bottomAnim,locationAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityAnimationBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(tasarim.getRoot());

        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        locationAnim = AnimationUtils.loadAnimation(this,R.anim.location_animation);


        tasarim.imageViewTractor.setAnimation(topAnim);
        tasarim.textViewSlogan.setAnimation(bottomAnim);
        tasarim.textViewSubSlogan.setAnimation(bottomAnim);
        tasarim.imageViewLocation.setAnimation(locationAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AnimationActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}