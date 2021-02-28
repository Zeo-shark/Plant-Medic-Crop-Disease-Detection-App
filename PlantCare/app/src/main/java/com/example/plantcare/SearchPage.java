package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SearchPage extends AppCompatActivity {

    static PlantDisease disease = new PlantDisease(0,"not available","not available","not available","not available","not available","not available","not available");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        PlantDiseasesList p = new PlantDiseasesList();
        Animation animAll = AnimationUtils.loadAnimation(this, R.anim.use_all);
        AutoCompleteTextView etSearch = findViewById(R.id.et_search);
        TextView tvSearchRes = findViewById(R.id.tv_searchRes);
        FloatingActionButton btnSearch = findViewById(R.id.btn_search_disease);
        etSearch.setAnimation(animAll);
        tvSearchRes.setAnimation(animAll);
        btnSearch.setAnimation(animAll);

        String[] diseaseList = new String[p.diseaseNameList.size()];

        for(int i=0; i<p.diseaseNameList.size();i++){
            diseaseList[i] = p.diseaseNameList.get(i);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.select_dialog_item, diseaseList);
        //Used to specify minimum number of
        //characters the user has to type in order to display the drop down hint.
        etSearch.setThreshold(1);
        //Setting adapter
        etSearch.setAdapter(arrayAdapter);

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
                b.putString("diseaseName", disease.name);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}