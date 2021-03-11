package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class cropsNext extends AppCompatActivity {

    static String cropName = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops_next);
        ConstraintLayout clLayout = findViewById(R.id.cl_crops_next);
        clLayout.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onResume() {
        super.onResume();

        ConstraintLayout clLayout = findViewById(R.id.cl_crops_next);

        ImageView iv1 = findViewById(R.id.iv_next1);
        ImageView iv2 = findViewById(R.id.iv_next2);
        ImageView iv3 = findViewById(R.id.iv_next3);

        TextView tv1 = findViewById(R.id.tv_next1);
        TextView tv2 = findViewById(R.id.tv_next2);
        TextView tv3 = findViewById(R.id.tv_next3);

        CardView card1 =findViewById(R.id.card_next1);
        CardView card2 =findViewById(R.id.card_next2);
        CardView card3 =findViewById(R.id.card_next3);
        CardView cvPandD = findViewById(R.id.card_next);

        Bundle b = this.getIntent().getExtras();
        String crop0 =  b.get("crop0").toString();
        String crop1 =  b.get("crop1").toString();
        String crop2 =  b.get("crop2").toString();
        int c0 = Integer.parseInt(crop0);
        int c1 = Integer.parseInt(crop1);
        int c2 = Integer.parseInt(crop2);

//        c0
        if(c0==1){
            tv1.setText("apple");
            iv1.setImageResource(R.mipmap.apple_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "apple";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==2){
            tv1.setText("cherry");
            iv1.setImageResource(R.mipmap.cherry_png);

            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cherry";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });

        }
        if(c0==3){
            tv1.setText("orange");
            iv1.setImageResource(R.mipmap.orange_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "orange";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==4){
            tv1.setText("peach");
            iv1.setImageResource(R.mipmap.peach_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "peach";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==5){
            tv1.setText("squash");
            iv1.setImageResource(R.mipmap.squash_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "squash";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==6){
            tv1.setText("pepper");
            iv1.setImageResource(R.mipmap.chillie_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "pepper";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==7){
            tv1.setText("citrus");
            iv1.setImageResource(R.mipmap.citrus_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "citrus";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==8){
            tv1.setText("corn");
            iv1.setImageResource(R.mipmap.corn_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "corn";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==9){
            tv1.setText("cucumber");
            iv1.setImageResource(R.mipmap.cucumber_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cucumber";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==10){
            tv1.setText("grapes");
            iv1.setImageResource(R.mipmap.grapes_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "grape";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==11){
            tv1.setText("mango");
            iv1.setImageResource(R.mipmap.mango_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "mango";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==12){
            tv1.setText("melon");
            iv1.setImageResource(R.mipmap.melon_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "melon";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==13){
            tv1.setText("okra");
            iv1.setImageResource(R.mipmap.okra_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "okra";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==14){
            tv1.setText("onion");
            iv1.setImageResource(R.mipmap.onion_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "onion";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==15){
            tv1.setText("papayas");
            iv1.setImageResource(R.mipmap.papaya_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "papayas";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==16){
            tv1.setText("pomegranate");
            iv1.setImageResource(R.mipmap.pomegranate_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cpomegranate";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c0==17){
            tv1.setText("potato");
            iv1.setImageResource(R.mipmap.potato_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "potato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c0==18){
            tv1.setText("tomato");
            iv1.setImageResource(R.mipmap.tomato_png);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card1.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "tomato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }


//        c1
        if(c1==1){
            tv2.setText("apple");
            iv2.setImageResource(R.mipmap.apple_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "apple";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==2){
            tv2.setText("cherry");
            iv2.setImageResource(R.mipmap.cherry_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cherry";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==3){
            tv2.setText("orange");
            iv2.setImageResource(R.mipmap.orange_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "orange";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });

        }

        if(c1==4){
            tv2.setText("peach");
            iv2.setImageResource(R.mipmap.peach_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "peach";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==5){
            tv2.setText("squash");
            iv2.setImageResource(R.mipmap.squash_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "squash";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==6){
            tv2.setText("pepper");
            iv2.setImageResource(R.mipmap.chillie_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "pepper";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==7){
            tv2.setText("citrus");
            iv2.setImageResource(R.mipmap.citrus_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "citrus";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==8){
            tv2.setText("corn");
            iv2.setImageResource(R.mipmap.corn_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "corn";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==9){
            tv2.setText("cucumber");
            iv2.setImageResource(R.mipmap.cucumber_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cucumber";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==10){
            tv2.setText("grapes");
            iv2.setImageResource(R.mipmap.grapes_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "grapes";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==11){
            tv2.setText("mango");
            iv2.setImageResource(R.mipmap.mango_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "mango";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==12){
            tv2.setText("melon");
            iv2.setImageResource(R.mipmap.melon_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "melon";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==13){
            tv2.setText("okra");
            iv2.setImageResource(R.mipmap.okra_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "okra";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==14){
            tv2.setText("onion");
            iv2.setImageResource(R.mipmap.onion_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "onion";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==15){
            tv2.setText("papayas");
            iv2.setImageResource(R.mipmap.papaya_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "papayas";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==16){
            tv2.setText("pomegranate");
            iv2.setImageResource(R.mipmap.pomegranate_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "pomegranate";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c1==17){
            tv2.setText("potato");
            iv2.setImageResource(R.mipmap.potato_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "potato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c1==18){
            tv2.setText("tomato");
            iv2.setImageResource(R.mipmap.tomato_png);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card2.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card3.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "tomato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        //        c1
        if(c2==1){
            tv3.setText("apple");
            iv3.setImageResource(R.mipmap.apple_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "apple";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==2){
            tv3.setText("cherry");
            iv3.setImageResource(R.mipmap.cherry_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cherry";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==3){
            tv3.setText("orange");
            iv3.setImageResource(R.mipmap.orange_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "orange";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });

        }

        if(c2==4){
            tv3.setText("peach");
            iv3.setImageResource(R.mipmap.peach_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "peach";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==5){
            tv3.setText("squash");
            iv3.setImageResource(R.mipmap.squash_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "squash";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==6){
            tv3.setText("pepper");
            iv3.setImageResource(R.mipmap.chillie_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "pepper";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==7){
            tv3.setText("citrus");
            iv3.setImageResource(R.mipmap.citrus_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "citrus";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==8){
            tv3.setText("corn");
            iv3.setImageResource(R.mipmap.corn_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "corn";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==9){
            tv3.setText("cucumber");
            iv3.setImageResource(R.mipmap.cucumber_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "cucumber";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==10){
            tv3.setText("grapes");
            iv3.setImageResource(R.mipmap.grapes_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "grapes";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==11){
            tv3.setText("mango");
            iv3.setImageResource(R.mipmap.mango_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "mango";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==12){
            tv3.setText("melon");
            iv3.setImageResource(R.mipmap.melon_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#FFFF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "melon";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==13){
            tv3.setText("okra");
            iv3.setImageResource(R.mipmap.okra_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "okra";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==14){
            tv3.setText("onion");
            iv3.setImageResource(R.mipmap.onion_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "onion";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==15){
            tv3.setText("papayas");
            iv3.setImageResource(R.mipmap.papaya_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "papayas";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==16){
            tv3.setText("pomegranate");
            iv3.setImageResource(R.mipmap.pomegranate_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "pomegranate";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

        if(c2==17){
            tv3.setText("potato");
            iv3.setImageResource(R.mipmap.potato_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#40FF00"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "potato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }
        if(c2==18){
            tv3.setText("tomato");
            iv3.setImageResource(R.mipmap.tomato_png);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clLayout.setVisibility(View.VISIBLE);
                    card3.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    card1.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    card2.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    cvPandD.setCardBackgroundColor(Color.parseColor("#EC4849"));
                    cvPandD.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cropName = "tomato";
                            Bundle b = new Bundle();
                            b.putString("cropName" , cropName);
                            Intent intent = new Intent(getApplicationContext(),PestAndDiseases.class);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    });
                }
            });
        }

    }
}