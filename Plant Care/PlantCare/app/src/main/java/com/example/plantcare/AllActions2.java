package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AllActions2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_actions2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Animation animLeftTORightS1 = AnimationUtils.loadAnimation(this,R.anim.left_to_right_speed1);
        Animation animRightToLeftS1 = AnimationUtils.loadAnimation(this,R.anim.right_to_left_speed1);
        Animation animeBtn1 = AnimationUtils.loadAnimation(this,R.anim.fade_btn1);
//        Animation animeBtn2 = AnimationUtils.loadAnimation(this,R.anim.fade_btn2);
        Animation animeBtn3 = AnimationUtils.loadAnimation(this,R.anim.fade_btn3);
        Animation animFade = AnimationUtils.loadAnimation(this, R.anim.fade_slow);
        animFade.setDuration(500);
        animeBtn1.setDuration(300);
        animeBtn3.setDuration(300);
        Button btn1 = (Button)findViewById(R.id.btn_1menu2);
        Button btn2 = (Button)findViewById(R.id.btn_2menu2);
        Button btn3 = (Button)findViewById(R.id.btn_3menu2);
        Button btn4 = (Button)findViewById(R.id.btn_4menu2);
        Button btn5 = (Button)findViewById(R.id.btn_5menu2);
        FloatingActionButton btnf1 =findViewById(R.id.btnf_1menu2);
        FloatingActionButton btnf2 =findViewById(R.id.btnf_2menu2);
        FloatingActionButton btnf3 =findViewById(R.id.btnf_3menu2);

        btn1.setAnimation(animRightToLeftS1);
        btn3.setAnimation(animRightToLeftS1);
        btn5.setAnimation(animRightToLeftS1);
        btn2.setAnimation(animLeftTORightS1);
        btn4.setAnimation(animLeftTORightS1);
        btnf1.setAnimation(animeBtn1);
        btnf2.setAnimation(animFade);
        btnf3.setAnimation(animeBtn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , CropChoose.class);
                startActivity(intent);
            }
        });
    }
}