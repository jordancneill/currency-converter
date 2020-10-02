package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button Pushed.");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInPesosDouble = amountInDollarsDouble * 21.27;

        String amountInPesosString = String.format("%.2f", amountInPesosDouble);

        Toast.makeText(this, "$" + amountInDollars + " equals ₱" + amountInPesosString, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}