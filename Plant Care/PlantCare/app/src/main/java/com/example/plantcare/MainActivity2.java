package com.example.plantcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    static LottieAnimationView animationCloudRain;
    static LottieAnimationView animationPlant;
    static OnSwipeTouchListener onSwipeTouchListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ConstraintLayout homePage = findViewById(R.id.laytout_homePage);
        onSwipeTouchListener = new OnSwipeTouchListener(this, homePage);
        animationCloudRain = findViewById(R.id.animation_menu_plant_wave);
    }

    public static class OnSwipeTouchListener implements View.OnTouchListener {
        private final GestureDetector gestureDetector;
        Context context;
        OnSwipeTouchListener(Context ctx, View mainView) {
            gestureDetector = new GestureDetector(ctx, new GestureListener());
            mainView.setOnTouchListener(this);
            context = ctx;
        }
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            return gestureDetector.onTouchEvent(event);
        }
        public class GestureListener extends
                GestureDetector.SimpleOnGestureListener {
            private static final int SWIPE_THRESHOLD = 100;
            private static final int SWIPE_VELOCITY_THRESHOLD = 100;
            @Override
            public boolean onDown(MotionEvent e) {
                return true;
            }
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                boolean result = false;
                try {
                    float diffY = e2.getY() - e1.getY();
                    float diffX = e2.getX() - e1.getX();
                    if (Math.abs(diffX) > Math.abs(diffY)) {
                        if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                            if (diffX > 0) {
                                onSwipeRight();
                            } else {
                                onSwipeLeft();
                            }
                            result = true;
                        }
                    }
                    else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffY > 0) {
                            onSwipeBottom();
                        } else {
                            onSwipeTop();
                        }
                        result = true;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                return result;
            }
        }
        void onSwipeRight() {
            Toast.makeText(context, "Swiped Right", Toast.LENGTH_SHORT).show();
            this.onSwipe.swipeRight();
        }
        void onSwipeLeft() {
            Intent intent = new Intent(context , AboutPage.class);
            context.startActivity(intent);
            this.onSwipe.swipeLeft();
        }
        void onSwipeTop() {
            animationPlant.playAnimation();
            this.onSwipe.swipeTop();
        }
        void onSwipeBottom() {
            animationCloudRain.playAnimation();
            this.onSwipe.swipeBottom();
        }
        interface onSwipeListener {
            void swipeRight();
            void swipeTop();
            void swipeBottom();
            void swipeLeft();
        }
        onSwipeListener onSwipe;
    }
    @Override
    protected void onResume(){
        super.onResume();
        Animation fade_anim = AnimationUtils.loadAnimation(this,R.anim.fade_animation_title);
        TextView title = findViewById(R.id.tv_title_page2);
        TextView description = findViewById(R.id.tv_description);
        FloatingActionButton btn_camera = findViewById(R.id.btn_camera);
        FloatingActionButton btn_search = findViewById(R.id.btn_search);
        FloatingActionButton btn_list = findViewById(R.id.btn_list);
        description.setText("welcome to plant care.\n You can find about different plant diseases. you can take picture of the plant for us to identify the disease ");
        title.setAnimation(fade_anim);
        description.setAnimation(fade_anim);
        Animation fadeAnimBtn1 = AnimationUtils.loadAnimation(this,R.anim.fade_btn1);
        Animation fadeAnimBtn2 = AnimationUtils.loadAnimation(this,R.anim.fade_btn2);
        Animation fadeAnimBtn3 = AnimationUtils.loadAnimation(this,R.anim.fade_btn3);
        Animation topToDownAnim = AnimationUtils.loadAnimation(this,R.anim.top_to_down);
        animationCloudRain.setAnimation(fade_anim);
        title.setAnimation(topToDownAnim);
        btn_camera.setAnimation(fadeAnimBtn1);
        btn_search.setAnimation(fadeAnimBtn2);
        btn_list.setAnimation(fadeAnimBtn3);
        animationPlant = findViewById(R.id.animationPlant);
        animationPlant.playAnimation();

//        camera button
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intentCamera,44);
            }
        });

//        search button
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSearch = new Intent(getApplicationContext() , SearchPage.class );
                startActivity(intentSearch);
            }
        });

//        list all button
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext() , AllActions.class);
                startActivity(intent);
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
            Intent resPage = new Intent(this, ResPage.class);
            resPage.putExtras(extras);
            startActivity(resPage);
        }
    }

    @Override
    protected void onPause() {

        animationCloudRain.pauseAnimation();
        super.onPause();

    }



}


