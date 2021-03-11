package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.Locale;

public class LanguageSelection extends AppCompatActivity {
    static final String ENGLISH = "en";
    static final String HINDI = "hi";
    static final String ODIA = "or";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);
    }

    @Override
    protected void onResume() {
        Animation animLeftTORightS1 = AnimationUtils.loadAnimation(this,R.anim.left_to_right_speed1);
        Animation animRightToLeftS1 = AnimationUtils.loadAnimation(this,R.anim.right_to_left_speed1);
        super.onResume();
        Button btnEnglish = findViewById(R.id.btn_english);
        Button btnHindi = findViewById(R.id.btn_hindi);
        Button btnOdia = findViewById(R.id.btn_odia);
        Button btnLang4 = findViewById(R.id.btn_lang4);
        Button btnLang5 = findViewById(R.id.btn_lang5);

        btnEnglish.setAnimation(animRightToLeftS1);
        btnOdia.setAnimation(animRightToLeftS1);
        btnLang5.setAnimation(animRightToLeftS1);
        btnHindi.setAnimation(animLeftTORightS1);
        btnLang4.setAnimation(animLeftTORightS1);

//        ENGLISH
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale(ENGLISH);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                Bundle b = new Bundle();
                b.putString("language" , ENGLISH);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

//        HINDI
        btnHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale(HINDI);
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                Bundle b = new Bundle();
                b.putString("language" , HINDI);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

//        ODIA
        btnOdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale(ODIA);
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                Bundle b = new Bundle();
                b.putString("language" , ODIA);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });
    }

    private void setLocale(String localCode){
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration config = res.getConfiguration();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 ){
            config.setLocale(new Locale(localCode.toLowerCase()));
        }
        else{
            config.locale = new Locale(localCode.toLowerCase());
        }
        res.updateConfiguration(config,dm);

    }
}