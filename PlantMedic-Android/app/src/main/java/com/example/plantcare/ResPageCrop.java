package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.plantcare.ml.HealthyPlantModel;
import com.example.plantcare.ml.PlantDiseasefinal;
import com.example.plantcare.ml.WeedClassifyEffiicientNet;

import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.label.Category;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ResPageCrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page_crop);
    }

    @Override
    protected void onResume() {
        HashMap<String , String > m = new HashMap<>();
        m.put("Cherry_(including_sour)___healthy" , "cherry including sour healthy");
        m.put("Corn_(maize)___healthy" , "corn maize healthy");
        m.put("Grape___healthy" , "grape healthy");
        m.put("Peach___healthy" , "peach healthy");
        m.put("Potato___healthy" , "potato healthy");
        m.put("Tomato___healthy" , "tomato healthy");
        m.put("Apple___healthy" , "apple healthy");
        super.onResume();
        Bitmap imageBitmap;
        Bundle extras = this.getIntent().getExtras();
        ImageView ivImage = findViewById(R.id.iv_image_crop);
        TextView tvCropName = findViewById(R.id.tv_nameOfCrop);
        TextView tvAbout = findViewById(R.id.tv_about_crop);
        PlantDiseasesList ob = new PlantDiseasesList();
        if(extras.containsKey("data")) {
            imageBitmap = (Bitmap) extras.get("data");
            ivImage.setImageBitmap(imageBitmap);
            //        ML implementation
            try {
                HealthyPlantModel model = HealthyPlantModel.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(imageBitmap);
                // Runs model inference and gets result.
                HealthyPlantModel.Outputs outputs = model.process(image);
                List<Category> probability = outputs.getProbabilityAsCategoryList();
                int large = 0;
                HashMap<String, Float> list = new HashMap<>();
                Category c = probability.get(0);
                for (int i = 1; i < probability.size(); i++) {
                    if (probability.get(i).getScore() > c.getScore()) {
                        c = probability.get(i);
                    }

                    list.put(probability.get(i).toString(), probability.get(i).getScore());
                }
                Log.i("rupelis", "onCreate: " + c.getLabel().toString() + " rupelis");
                String diseaseName = c.getLabel().toString();
                if (ob.listOfDiseases.containsKey(m.get(diseaseName))) {
                    tvCropName.setText(ob.listOfDiseases.get(m.get(diseaseName)).name);
                    tvAbout.setText(ob.listOfDiseases.get(m.get(diseaseName)).about);
                }

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
                HealthyPlantModel model = HealthyPlantModel.newInstance(this);

                // Creates inputs for reference.
                TensorImage image = TensorImage.fromBitmap(bitmap);
                // Runs model inference and gets result.
                HealthyPlantModel.Outputs outputs = model.process(image);
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
                if (ob.listOfDiseases.containsKey(m.get(diseaseName))) {
                    tvCropName.setText(ob.listOfDiseases.get(m.get(diseaseName)).name);
                    tvAbout.setText(ob.listOfDiseases.get(m.get(diseaseName)).about);
                }

                // Releases model resources if no longer used.
                model.close();

            } catch (IOException e) {
                // TODO Handle the exception
            }

        }

    }
}