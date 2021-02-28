package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.RecognitionListener;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.plantcare.ml.PlantDiseasefinal;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.label.Category;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

public class ResPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page);

        PlantDiseasesList ob = new PlantDiseasesList();
        Animation animBtn = AnimationUtils.loadAnimation(this,R.anim.fade_btn1);
        Animation animTopToDown = AnimationUtils.loadAnimation(this,R.anim.top_to_down);
        Animation animFade = AnimationUtils.loadAnimation(this,R.anim.fade_animation_title);
        ImageView ivImage;
        ivImage = findViewById(R.id.iv_image);
        ivImage.setAnimation(animFade);
        Button btnTreatment = (Button) findViewById(R.id.btn_treatment);
        btnTreatment.setAnimation(animBtn);
        TextView tvNameOfDis = findViewById(R.id.tv_nameOfDis);
        TextView tvSymp = findViewById(R.id.tv_symptoms);
        TextView tvDes = findViewById(R.id.tv_description);
        tvNameOfDis.setAnimation(animFade);
        tvDes.setAnimation(animFade);
        tvSymp.setAnimation(animFade);

        Bundle extras = this.getIntent().getExtras();
        Bitmap imageBitmap ;
        String symptoms = "Nothig available";
        String about = "Nothing available";
        String name = "Not available";
        String fs = "";
        if(extras.containsKey("data")){
            imageBitmap = (Bitmap) extras.get("data");
            ivImage.setImageBitmap(imageBitmap);
            //        ML implementation
            try {
                PlantDiseasefinal model = PlantDiseasefinal.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(imageBitmap);
                // Runs model inference and gets result.
                PlantDiseasefinal.Outputs outputs = model.process(image);
                List<Category> probability = outputs.getProbabilityAsCategoryList();
                int large = 0 ;
                HashMap<String , Float> list =  new HashMap<>();
                Category c = probability.get(0);
                for(int i=1; i<probability.size(); i++){
                    if(probability.get(i).getScore()>c.getScore()){
                        c = probability.get(i);
                    }
                    list.put(probability.get(i).toString(),probability.get(i).getScore() );
                }
                Log.i("rupelis", "onCreate: " + c.getLabel().toString() + " rupelis");
                String diseaseName = c.getLabel().toString();
//                String [] sarr =diseaseName.split(".");
//                String f = "";
//                for(int i=0; i<sarr.length; i++){
//                    f = f+sarr[i] + " ";
//                }
                String f = diseaseName.replaceAll("\\."," ");
                Log.i("rupelis", "onCreate: " + f + " rupelis");
                if(ob.listOfDiseases.containsKey(f)){
                    name = ob.listOfDiseases.get(f).name;
                    symptoms =  ob.listOfDiseases.get(f).symptoms;
                    about = ob.listOfDiseases.get(f).about;
                }

                // Releases model resources if no longer used.
                model.close();

            } catch (IOException e) {
                // TODO Handle the exception
            }
        }
        else if(extras.containsKey("about") && extras.containsKey("symptoms")) {
            ivImage.setImageResource(R.mipmap.apple_png);
            symptoms = extras.get("symptoms").toString();
            about = extras.get("about").toString();
            name = extras.get("diseaseName").toString();
        }
        else if(extras.containsKey("imageG")){
            Uri imageUri = (Uri) extras.get("imageG");
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ivImage.setImageURI(imageUri);
            try {
                PlantDiseasefinal model = PlantDiseasefinal.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(bitmap);
                // Runs model inference and gets result.
                PlantDiseasefinal.Outputs outputs = model.process(image);
                List<Category> probability = outputs.getProbabilityAsCategoryList();
                int large = 0 ;
                HashMap<String , Float> list =  new HashMap<>();
                Category c = probability.get(0);
                for(int i=1; i<probability.size(); i++){
                    if(probability.get(i).getScore()>c.getScore()){
                        c = probability.get(i);
                    }
                    list.put(probability.get(i).toString(),probability.get(i).getScore() );
                }
                Log.i("rupelis", "onCreate: " + c.getLabel().toString() + " rupelis");
                String diseaseName = c.getLabel().toString();
//                String [] sarr =diseaseName.split(".");
//                String f = "";
//                for(int i=0; i<sarr.length; i++){
//                    f = f+sarr[i] + " ";
//                }
                String f = diseaseName.replaceAll("\\."," ");
                Log.i("rupelis", "onCreate: " + f + " rupelis");
                if(ob.listOfDiseases.containsKey(f)){
                    name = ob.listOfDiseases.get(f).name;
                    symptoms =  ob.listOfDiseases.get(f).symptoms;
                    about = ob.listOfDiseases.get(f).about;
                }

                // Releases model resources if no longer used.
                model.close();

            } catch (IOException e) {
                // TODO Handle the exception
            }

        }
        else if(extras.containsKey("diseaseName")){
            String diseaseName = extras.getString("diseaseName");
            name = ob.listOfDiseases.get(diseaseName).name;
            symptoms = ob.listOfDiseases.get(diseaseName).symptoms;
            about = ob.listOfDiseases.get(diseaseName).about;
        }

        if(symptoms.length()>140){
            symptoms = symptoms.substring(0,140)+ "\n\nCLICK TO READ MORE" ;

        }
        if(about.length()>140){
            about = about.substring(0,140) + "\n\nCLICK TO READ MORE";
        }
        tvSymp.setText( "SYMPTOMS :-\n\n" +  symptoms );
        tvDes.setText( "ABOUT:-\n\n" + about );
        tvNameOfDis.setText(name);
    }


}