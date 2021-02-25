package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.Toast;

public class CropChoose extends AppCompatActivity {
static  int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_choose);

        CardView c1 = findViewById(R.id.card1);
        int width = c1.getWidth();
        int height = c1.getHeight();
        CardView c2 = findViewById(R.id.card2);
        CardView c3 = findViewById(R.id.card3);
        CardView c4 = findViewById(R.id.card4);
        CardView c5 = findViewById(R.id.card5);
        CardView c6 = findViewById(R.id.card6);
        CardView c7 = findViewById(R.id.card7);
        CardView c8 = findViewById(R.id.card8);
        CardView c9 = findViewById(R.id.card9);
        CardView c10 = findViewById(R.id.card10);
        CardView c11 = findViewById(R.id.card11);
        CardView c12 = findViewById(R.id.card12);
        CardView c13 = findViewById(R.id.card13);
        CardView c14 = findViewById(R.id.card14);
        CardView c15 = findViewById(R.id.card15);
        CardView c16 = findViewById(R.id.card16);
        CardView c17 = findViewById(R.id.card17);
        CardView c18 = findViewById(R.id.card18);
        CardView c19 = findViewById(R.id.card19);


//        card 1  : apple
//        c1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(c1.getParent().equals(glCrop)){
//                    glCrop.removeView(c1);
//                    llCrop.addView(c1);
//                    c1.setAnimation(rotate);
//                }else{
//                    llCrop.removeView(c1);
//                    glCrop.addView(c1);
//                    c1.clearAnimation();
//                }
//            }
//        });
//
//        //        card 2  : banana
//        c2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(c2.getParent().equals(glCrop)){
//                    glCrop.removeView(c2);
//                    llCrop.addView(c2);
//                    c2.setAnimation(rotate);
//                }else{
//                    llCrop.removeView(c2);
//                    glCrop.addView(c2);
//                    c2.clearAnimation();
//                }
//            }
//        });

        setFunction(c1);
        setFunction(c2);
        setFunction(c3);
        setFunction(c4);
        setFunction(c5);
        setFunction(c6);
        setFunction(c7);
        setFunction(c8);
        setFunction(c9);
        setFunction(c10);
        setFunction(c11);
        setFunction(c12);
        setFunction(c13);
        setFunction(c14);
        setFunction(c15);
        setFunction(c16);
        setFunction(c17);
        setFunction(c18);
        setFunction(c19);

    }

    public void setFunction(CardView c){

        x++;
        GridLayout glCrop = findViewById(R.id.gridlayout_crops);
        GridLayout llCrop = findViewById(R.id.linear_layout_crops);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);



        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(llCrop.getChildCount() >2){
                    Toast.makeText(getApplicationContext() , "cant add more than 3" , Toast.LENGTH_SHORT);
                    if(c.getParent().equals(glCrop)){
                        return;
                    }

                }
                Log.i("TAG" , "setFunction: yosup" + llCrop.getChildCount());
                if(c.getParent().equals(glCrop)){
                    glCrop.removeView(c);
                    llCrop.addView(c);
                    c.setAnimation(rotate);
                }else{
                    llCrop.removeView(c);
                    glCrop.addView(c);
                    c.clearAnimation();
                }
            }
        });
    }

}