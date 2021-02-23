package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,1024);
        setContentView(R.layout.activity_main);
        Animation fade_anim = AnimationUtils.loadAnimation(this,R.anim.fade_slow);
        Animation downToTop_anim = AnimationUtils.loadAnimation(this,R.anim.down_to_top);
        TextView title = (TextView) findViewById(R.id.tv_title_page2);
        title.setAnimation(fade_anim);
        title.setAnimation(downToTop_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}