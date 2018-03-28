package com.example.akim4.currencyconverterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view){

        EditText valueField = (EditText) findViewById(R.id.valueField);

        Double valueFieldDouble = Double.parseDouble(valueField.getText().toString());

        Double euroAmount = valueFieldDouble * 0.81;

        Log.i("Info", "Conversion button pressed!, $" + valueField.getText().toString() + " USD converted to €" + String.format("%.2f", euroAmount) + "EURO");

        Toast.makeText(MainActivity.this, "€" + String.format("%.2f", euroAmount), Toast.LENGTH_LONG).show();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
