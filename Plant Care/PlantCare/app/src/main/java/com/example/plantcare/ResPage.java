package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page);
        Bundle extras = this.getIntent().getExtras();
        Bitmap imageBitmap ;
        String symptoms = "Nothig available";
        String about = "Nothing available";
        imageBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.apple_png);
        if(extras.containsKey("data")){
            imageBitmap = (Bitmap) extras.get("data");
        }
        if(extras.containsKey("about") && extras.containsKey("symptoms")) {
            symptoms = extras.get("symptoms").toString();
            about = extras.get("about").toString();
        }
        Animation animBtn = AnimationUtils.loadAnimation(this,R.anim.fade_btn1);
        Animation animTopToDown = AnimationUtils.loadAnimation(this,R.anim.top_to_down);
        Animation animFade = AnimationUtils.loadAnimation(this,R.anim.fade_animation_title);
        ImageView ivImage;
        ivImage = findViewById(R.id.iv_image);
        ivImage.setImageBitmap(imageBitmap);
        ivImage.setAnimation(animFade);
        Button btnTreatment = (Button) findViewById(R.id.btn_treatment);
        btnTreatment.setAnimation(animBtn);
        TextView tvNameOfDis = findViewById(R.id.tv_nameOfDis);
        TextView tvSymp = findViewById(R.id.tv_symptoms);
        TextView tvDes = findViewById(R.id.tv_description);
        tvNameOfDis.setAnimation(animFade);
        tvDes.setAnimation(animFade);
        tvSymp.setAnimation(animFade);
        tvSymp.setText(symptoms);
        tvDes.setText(about);
//        String abc = PlantDisease.listOfDiseases.get("xyz").about;
//        String x = PlantDisease.diseaseNameList.get(0);
//        tvSymp.setText(x);
    }
}