package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ageInput;
    Button submit;
    TextView ageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ageInput = findViewById(R.id.ageInput);
        submit = findViewById(R.id.submit);
        ageView = findViewById(R.id.ageView);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = 0;
                value = readValue(ageInput);
                updateAge(ageView, value);
            }
        });

        submit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }

    private void updateAge(TextView display, int value){
        display.setText("You are "+value+" years old");
    }

    private int readValue(EditText ageInput) {
        int value = 0;

        try {
            value = Integer.parseInt(ageInput.getText().toString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
        return value;
    }
}
