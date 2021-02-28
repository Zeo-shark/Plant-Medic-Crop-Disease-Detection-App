package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class PestAndDiseases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest_and_diseases);
        ConstraintLayout cl1 = findViewById(R.id.cl_disease1);
        ConstraintLayout cl2 = findViewById(R.id.cl_disease2);
        ConstraintLayout cl3 = findViewById(R.id.cl_disease3);
        ConstraintLayout cl4 = findViewById(R.id.cl_disease4);

        cl1.setVisibility(View.INVISIBLE);
        cl2.setVisibility(View.INVISIBLE);
        cl3.setVisibility(View.INVISIBLE);
        cl4.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        int count = 0;

        ConstraintLayout cl1 = findViewById(R.id.cl_disease1);
        ConstraintLayout cl2 = findViewById(R.id.cl_disease2);
        ConstraintLayout cl3 = findViewById(R.id.cl_disease3);
        ConstraintLayout cl4 = findViewById(R.id.cl_disease4);

        TextView tv1 =findViewById(R.id.tv_disease1);
        TextView tv2 =findViewById(R.id.tv_disease2);
        TextView tv3 =findViewById(R.id.tv_disease3);
        TextView tv4 =findViewById(R.id.tv_disease4);

        CardView cv1 = findViewById(R.id.cv_disease1);
        CardView cv2 = findViewById(R.id.cv_disease2);
        CardView cv3 = findViewById(R.id.cv_disease3);
        CardView cv4 = findViewById(R.id.cv_disease4);

        Bundle b = this.getIntent().getExtras();
        String cropName =  b.get("cropName").toString();
        PlantDiseasesList ob = new PlantDiseasesList();
        for(int i=0; i<ob.diseaseNameList.size(); i++){
            PlantDisease x = new PlantDisease(0,"","","","","","","");
            x = ob.listOfDiseases.get(ob.diseaseNameList.get(i));

            if(x.cropName.equals(cropName) && !(x.name.contains("healthy")) ){
                if(count==0){
                    cl1.setVisibility(View.VISIBLE);
                    String diseaseName1 = x.name;
                    tv1.setText(x.name);
                    cv1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Bundle b = new Bundle();
                            b.putString("diseaseName", diseaseName1 );
                            Intent intent = new Intent(getApplicationContext(), ResPage.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
                else if(count==1){
                    cl2.setVisibility(View.VISIBLE);
                    String diseaseName2 = x.name;
                    tv2.setText(x.name);
                    cv2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Bundle b = new Bundle();
                            b.putString("diseaseName", diseaseName2 );
                            Intent intent = new Intent(getApplicationContext(), ResPage.class);
                            intent.putExtras(b);
                            startActivity(intent);

                        }
                    });
                }
                else if(count == 2){
                    cl3.setVisibility(View.VISIBLE);
                    String diseaseName3 = x.name;
                    tv3.setText(x.name);
                    cv3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Bundle b = new Bundle();
                            b.putString("diseaseName", diseaseName3 );
                            Intent intent = new Intent(getApplicationContext(), ResPage.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
                else if(count == 3){
                    cl4.setVisibility(View.VISIBLE);
                    String diseaseName4 = x.name;
                    tv4.setText(x.name);
                    cv4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Bundle b = new Bundle();
                            b.putString("diseaseName", diseaseName4 );
                            Intent intent = new Intent(getApplicationContext(), ResPage.class);
                            intent.putExtras(b);
                            startActivity(intent);

                        }
                    });
                }

                count++;
            }
            if(count >3){
                break;
            }
        }
    }
}