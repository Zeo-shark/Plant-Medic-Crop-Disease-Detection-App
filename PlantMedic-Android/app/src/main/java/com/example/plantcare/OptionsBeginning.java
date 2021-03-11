package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsBeginning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_beginning);

        Bundle b = this.getIntent().getExtras();
        Button btn1 = findViewById(R.id.btn_option1);
        Button btn2 = findViewById(R.id.btn_option2);
        Button btn3 = findViewById(R.id.btn_option3);
        Button btn4 = findViewById(R.id.btn_option4);
        Button btn5 = findViewById(R.id.btn_option5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResPage.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResPageWeed.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResPageNutrient.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResPageCrop.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}