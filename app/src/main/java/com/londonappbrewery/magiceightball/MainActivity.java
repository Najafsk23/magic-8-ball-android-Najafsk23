package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnRoll;
        final ImageView mainImage;

        btnRoll = (Button) findViewById(R.id.RollButton);
         mainImage = (ImageView) findViewById(R.id.MainImage);

         final int[] ImageArray = {R.drawable.ball1,
         R.drawable.ball2,
         R.drawable.ball3,
         R.drawable.ball4,
         R.drawable.ball5};

         btnRoll.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Random randomNumber = new Random();

                int value = randomNumber.nextInt(5);
                 Log.d("Click","Button is clicked");
                mainImage.setImageResource(ImageArray[value]);
             }
         });


    }
}
