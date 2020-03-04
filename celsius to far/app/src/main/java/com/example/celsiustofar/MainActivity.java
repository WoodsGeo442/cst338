package com.example.celsiustofar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText celsiusIn;
    Button convert;
    TextView convertedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusIn = findViewById(R.id.editTextCelsiusIn);
        convert = findViewById(R.id.buttonCtoF);
        convertedValue = findViewById(R.id.textViewCtoFValue);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = 0.0;
                value = readValue(celsiusIn);
                value = convertCtoF(value);
                updateDisplay(convertedValue, value);
            }
        });

        convert.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FahrneheitToCelsius.class);
                startActivity(intent);
                return false;
            }
        });
    }

    private double convertCtoF(double celsius) {
        //F = T(C) x 9/5 +32
        double temp =0.0;
        temp = celsius * (9.0/5.0);
        temp += 32;

        return temp;
    }

    private void updateDisplay(TextView display, double value){
        display.setText(value+"F");
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
