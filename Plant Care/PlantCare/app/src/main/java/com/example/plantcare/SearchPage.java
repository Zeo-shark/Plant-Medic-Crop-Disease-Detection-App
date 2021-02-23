package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SearchPage extends AppCompatActivity {

    static PlantDisease disease = new PlantDisease(0,"not available","not available");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        Animation animAll = AnimationUtils.loadAnimation(this, R.anim.use_all);
        EditText etSearch = findViewById(R.id.et_search);
        TextView tvSearchRes = findViewById(R.id.tv_searchRes);
        FloatingActionButton btnSearch = findViewById(R.id.btn_search_disease);
        etSearch.setAnimation(animAll);
        tvSearchRes.setAnimation(animAll);
        btnSearch.setAnimation(animAll);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchKey = etSearch.getText().toString();
                PlantDiseasesList obj = new PlantDiseasesList();
                if(obj.listOfDiseases.containsKey(searchKey) ){
                    disease = obj.listOfDiseases.get(searchKey);
                }
                Log.i("disease list", "onCreate: rupelis" + searchKey );
                Intent intent = new Intent(getApplicationContext(),ResPage.class);
                Bundle b = new Bundle();
                b.putString("about", disease.about);
                b.putString("symptoms",disease.symptoms);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}