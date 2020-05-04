package com.example.airlinereservation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class loginScreen extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        username = findViewById(R.id.usernameInput);
        password = findViewById(R.id.passwordInput);
        login = findViewById(R.id.loginSubmit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String information = "Username: " + username + "\n" + "Password: " + password;
                if(usernameCheck(username.toString()) == false || passwordCheck(password.toString()) == false){
                    if(usernameCheck(username.toString()) == false){
                        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
                    }
                }
                updateDisplay(login, information);
            }
        });

    }

    private void updateDisplay(TextView display, String loginInfo){
        display.setText(loginInfo);
    }

    private boolean usernameCheck(String username){
        int usernameletters = 0;
        int usernamenumbers = 0;


        for(int i = 0; i < username.length(); i++){
            if(username.matches("[0-9]+")){
                usernamenumbers++;
            } else if(username.matches("^[a-zA-Z]*$")){
                usernameletters++;
            }
        }

        if(usernameletters >= 3 && usernamenumbers >= 3) {
            return true;
        } else {
            return false;
        }
    }

    private boolean passwordCheck(String password){
        int passwordletters = 0;
        int passwordnumbers = 0;

        for(int i = 0; i < password.length(); i++){
            if(password.matches("[0-9]+")){
                passwordnumbers++;
            } else if(password.matches("^[a-zA-Z]*$")){
                passwordletters++;
            }
        }

        if(passwordletters >= 3 && passwordnumbers >= 3){
            return true;
        } else {
            return false;
        }
    }
}
