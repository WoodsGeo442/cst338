package com.example.celsiustofar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FahrenheitToCelsius extends AppCompatActivity {

    EditText fahrenheitIn;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);
        fahrenheitIn = findViewById(R.id.editTextFahrenheitIn);
        convert = findViewById(R.id.buttonFtoC);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = 0.0;
                value = readValue(fahrenheitIn);
                value = convertFtoC(value);
                String strDouble = String.format("%.2f", value);
                updateDisplay(convert, strDouble);
            }
        });

        convert.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }

    private double convertFtoC(double fahrenheit) {
        //C = (T(F) − 32) × 5/9
        double temp =0.0;
        temp = (fahrenheit - 32) * (5.0/9.0);
        return temp;
    }

    private void updateDisplay(TextView display, String value){
        display.setText(value+"C");
    }


    private double readValue(EditText celsiusIn) {
        double value = 0.0;

        try {
            value = Double.parseDouble(celsiusIn.getText().toString());
        } catch (NumberFormatException e) {
            System.out.println("couldn't convert");
        }
        return value;
    }
}