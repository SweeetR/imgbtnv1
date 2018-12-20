package com.example.user.imgbtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imgbtn1;
    ImageView imv1;
    Random rnd = new Random();
    int o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn1=(ImageButton) findViewById(R.id.imgbtn1);
        imv1=(ImageView) findViewById(R.id.imv1);
    }

    public void flip(View view) {
        o=rnd.nextInt(3)+1;
        switch (o){
            case 1:imgbtn1.setImageResource(R.drawable.one);


        }

    }
}
