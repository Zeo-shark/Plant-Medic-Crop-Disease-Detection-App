package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CropChoose extends AppCompatActivity {
static  int x = 0;
static String [] crops = new String[3];
static  int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_choose);



        CardView c1 = findViewById(R.id.card_symp);
        CardView c2 = findViewById(R.id.card_des);
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
        Button btnNext = findViewById(R.id.btn_next_cropchoose);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                crops[0] = "-1";
                crops[1] = "-1";
                crops[2] = "-1";
                if(checkParent(c1)){
                    crops[i++] = "1";
                }
                if(checkParent(c2)){
                    crops[i++] = "2";
                }
                if(checkParent(c3)){
                    crops[i++] = "3";
                }
                if(checkParent(c4)){
                    crops[i++] = "4";
                }
                if(checkParent(c5)){
                    crops[i++] = "5";
                }
                if(checkParent(c6)){
                    crops[i++] = "6";
                }
                if(checkParent(c7)){
                    crops[i++] = "7";
                }if(checkParent(c8)){
                    crops[i++] = "8";
                }if(checkParent(c9)){
                    crops[i++] = "9";
                }if(checkParent(c10)){
                    crops[i++] = "10";
                }if(checkParent(c11)){
                    crops[i++] = "11";
                }if(checkParent(c12)){
                    crops[i++] = "12";
                }if(checkParent(c13)){
                    crops[i++] = "13";
                }if(checkParent(c14)){
                    crops[i++] = "14";
                }if(checkParent(c15)){
                    crops[i++] = "15";
                }if(checkParent(c16)){
                    crops[i++] = "16";
                }if(checkParent(c17)){
                    crops[i++] = "17";
                }if(checkParent(c18)){
                    crops[i++] = "18";
                }if(checkParent(c19)){
                    crops[i++] = "19";
                }

                Bundle b = new Bundle();
                b.putString("crop0",crops[0]);
                b.putString("crop1",crops[1]);
                b.putString("crop2",crops[2]);
                Intent intent = new Intent(getApplicationContext(), cropsNext.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });


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

    public boolean checkParent(CardView c){
        GridLayout glCrop = findViewById(R.id.gridlayout_crops);
        GridLayout llCrop = findViewById(R.id.linear_layout_crops);
        if(c.getParent().equals(llCrop)){
            return true;
        }
        return  false;
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

    @Override
    protected void onResume() {
        super.onResume();
        FloatingActionButton btnfCamera = findViewById(R.id.btnf_camera);
        FloatingActionButton btnfGallery = findViewById(R.id.btnf_galary);

        btnfCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intentCamera,44);
            }
        });

        btnfGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGalery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(intentGalery, 104);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode , Intent data){
        Log.i("onActWorking", "onActivityResult: hello world");
        super.onActivityResult(requestCode,requestCode,data);
        if(requestCode==44&&resultCode== RESULT_OK ){
            Log.i("hello", "onActivityResult: Inside the if condition");
            Bundle extras = data.getExtras();
            Bitmap imageBitmap =(Bitmap) extras.get("data");
            Intent resPage = new Intent(this, ResPageCrop.class);
            resPage.putExtras(extras);
            startActivity(resPage);
        }

        if(requestCode == 104 && resultCode == RESULT_OK){

            Log.i("hello", "onActivityResult: xyzabc");
            Intent resPage = new Intent(getApplicationContext(), ResPageCrop.class);
            Uri imageG =  data.getData();
            Bundle b = new Bundle();
            b.putParcelable("imageG" , imageG);
            resPage.putExtras(b);
            startActivity(resPage);

        }

    }
}