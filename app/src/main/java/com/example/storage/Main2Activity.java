package com.example.storage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2Activity extends AppCompatActivity {

    TextView email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email=findViewById(R.id.mail);
        password = findViewById(R.id.pwd);




        try {
            FileInputStream fileInputStream = openFileInput("Data");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            StringBuffer stringBuffer = new StringBuffer("");

            String string = bufferedReader.readLine();


            while(string!=null) {

                stringBuffer.append(string);
                string = bufferedReader.readLine();

            }
            email.setText(string);




        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
