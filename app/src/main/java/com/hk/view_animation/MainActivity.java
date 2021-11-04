package com.hk.view_animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RelativeLayout loginView, signUpView;
    Animation bottomUp, bottomDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginView = findViewById(R.id.loginView);
        signUpView = findViewById(R.id.signUpView);

        //anim
        bottomUp = AnimationUtils.loadAnimation(this,
                R.anim.bottom_up);
        bottomDown = AnimationUtils.loadAnimation(this,
                R.anim.bottom_down);

        loginView.startAnimation(bottomUp);

    }


    public void goSignUpPage(View view) {
        signUpView.setVisibility(View.VISIBLE);
        signUpView.startAnimation(bottomUp);
    }

    public void hideSignUpView(View view) {
        signUpView.startAnimation(bottomDown);
        signUpView.setVisibility(View.GONE);
    }
}