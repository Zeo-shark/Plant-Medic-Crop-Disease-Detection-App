package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.plantcare.ml.NutrientDeficiency;
import com.example.plantcare.ml.WeedClassifyEffiicientNet;

import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.label.Category;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ResPageNutrient extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page_nutrient);
    }

    @Override
    protected void onResume() {
//        String [] ar = {"Nitrogen(N)","",""};
        super.onResume();
        Bitmap imageBitmap;
        Bundle extras = this.getIntent().getExtras();
        ImageView ivImage = findViewById(R.id.iv_image_nutrient);
        TextView tvName = findViewById(R.id.tv_nameOfNutrient);
        WeedList ob = new WeedList();
        Log.i("TAG", "onResume: rupelis " + "working 1");
        if(extras.containsKey("data")){
            Log.i("TAG", "onResume: rupelis " + "working 2");
            imageBitmap = (Bitmap) extras.get("data");
            ivImage.setImageBitmap(imageBitmap);
            Log.i("TAG", "onResume: rupelis " + "working 3");
            //        ML implementation
            try {
                NutrientDeficiency model = NutrientDeficiency.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(imageBitmap);
                // Runs model inference and gets result.
                NutrientDeficiency.Outputs outputs = model.process(image);
                List<Category> probability = outputs.getProbabilityAsCategoryList();
                int large = 0 ;
                Category c = probability.get(0);
                for(int i=1; i<probability.size(); i++){
                    if(probability.get(i).getScore()>c.getScore()){
                        c = probability.get(i);
                    }
                }
                Log.i("rupelis", "onCreate: " + c.getLabel().toString() + " rupelis");
                tvName.setText(c.getLabel().toString());

                // Releases model resources if no longer used.
                model.close();

            } catch (IOException e) {
                // TODO Handle the exception
            }
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
                NutrientDeficiency model = NutrientDeficiency.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(bitmap);
                // Runs model inference and gets result.
                NutrientDeficiency.Outputs outputs = model.process(image);
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
                tvName.setText(c.getLabel().toString());

                // Releases model resources if no longer used.
                model.close();

            } catch (IOException e) {
                // TODO Handle the exception
            }

        }
    }
}