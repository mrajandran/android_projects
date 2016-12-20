package com.rajandrandesigns.rajandra.currencyconverter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        ImageView poster =  (ImageView) findViewById(R.id.img);
        poster.setBackgroundColor(Color.WHITE);
        poster.setImageAlpha(20);

        EditText usdollars = (EditText) findViewById(R.id.amt_usd);

        double cadollars = (Double.parseDouble(usdollars.getText().toString())) * 1.5;

        TextView entered = (TextView) findViewById(R.id.entered);
        TextView equals = (TextView) findViewById(R.id.equals);
        TextView output = (TextView) findViewById(R.id.text1);

        entered.setAlpha(100);
        equals.setAlpha(100);

        entered.setText("USD $" + usdollars.getText().toString());
        output.setText("CAD $" + Double.toString(cadollars));


        // Toast.makeText(this, "Entered USD: $" + usdollars.getText().toString() + " = CAD $" + Double.toString(cadollars), Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
