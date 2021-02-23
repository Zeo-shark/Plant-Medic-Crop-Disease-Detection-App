package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        Animation an = AnimationUtils.loadAnimation(this,R.anim.use_all);
        Button btnFacebook = (Button)findViewById(R.id.btn_facebook);
        Button btnWebsite = (Button)findViewById(R.id.btn_website);
        Button btnInstagram = (Button)findViewById(R.id.btn_instagram);
        TextView tvAbout = findViewById(R.id.tv_about);
        TextView tvdetails = findViewById(R.id.tv_appDetatils);
        btnFacebook.setAnimation(an);
        btnWebsite.setAnimation(an);
        btnInstagram.setAnimation(an);
        tvAbout.setAnimation(an);
        tvdetails.setAnimation(an);


    }
}