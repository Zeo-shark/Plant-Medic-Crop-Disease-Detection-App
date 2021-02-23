package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AllActions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_actions);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ConstraintLayout clMenu1 = findViewById(R.id.cl_menu1);
        ConstraintLayout clMenu2 = findViewById(R.id.cl_menu2);
        ConstraintLayout clMenu3 = findViewById(R.id.cl_menu3);
        ConstraintLayout clMenu4 = findViewById(R.id.cl_menu4);
        ConstraintLayout clMenu5 = findViewById(R.id.cl_menu5);
        FloatingActionButton btnfMenu1 = findViewById(R.id.btnf_menu1);
        FloatingActionButton btnfMenu2 = findViewById(R.id.btnf_menu2);
        FloatingActionButton btnfMenu3 = findViewById(R.id.btnf_menu3);
        FloatingActionButton btnfMenu4 = findViewById(R.id.btnf_menu4);
        FloatingActionButton btnfMenu5 = findViewById(R.id.btnf_menu5);
        TextView tvMenu1 = findViewById(R.id.tv_menu1);
        TextView tvMenu2 = findViewById(R.id.tv_menu2);
        TextView tvMenu3 = findViewById(R.id.tv_menu3);
        TextView tvMenu4 = findViewById(R.id.tv_menu4);
        TextView tvMenu5 = findViewById(R.id.tv_menu5);

        Animation animLeftTORightS1 = AnimationUtils.loadAnimation(this,R.anim.left_to_right_speed1);
        Animation animRightToLeftS1 = AnimationUtils.loadAnimation(this,R.anim.right_to_left_speed1);
        clMenu1.setAnimation(animLeftTORightS1);
        clMenu3.setAnimation(animLeftTORightS1);
        clMenu5.setAnimation(animLeftTORightS1);
        clMenu2.setAnimation(animRightToLeftS1);
        clMenu4.setAnimation(animRightToLeftS1);

    }
}