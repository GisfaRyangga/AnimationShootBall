    package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bola = findViewById(R.id.bola);
        Button btn_shoot = findViewById(R.id.btn_shoot);

        mAnimator = ObjectAnimator.ofFloat(bola, "y", 170);

        btn_shoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimator.setDuration(1000);
                mAnimator.start();
            }
        });
    }
}