package com.robpercival.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){


        EditText username_info = (EditText) findViewById(R.id.username_info);
        EditText password_info = (EditText) findViewById(R.id.password_info);

        Log.i("Username ", username_info.getText().toString());
        Log.i("Password ", password_info.getText().toString());
        Toast.makeText(this, "Hello " + username_info.getText().toString(), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

