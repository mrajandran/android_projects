package com.rajandrandesigns.rajandra.imageswap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        ImageView poster =  (ImageView) findViewById(R.id.poster);
        poster.setImageResource(R.drawable.p2);
        Toast.makeText(this, "Hello ", Toast.LENGTH_SHORT).show();



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
