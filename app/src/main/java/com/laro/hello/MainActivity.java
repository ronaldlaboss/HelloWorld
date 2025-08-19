/**
 * Date: 8/19/2025
 * PROJECT: Hello world
 * Author: RONALD LABOSSIERE
 * PURPOSE: Show Hello world text by clicking on a button
 * function: 1 (sayHello : void)
 */
package com.laro.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String DELETE_MSG = "Text deleted!";

    private Button sayHelloBtn;
    private TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHelloBtn = findViewById(R.id.showHelloText);
        helloText = findViewById(R.id.helloText);

        // access the sayHello function
        sayHello();
    }

    private void sayHello()
    {
        //add a click listener to the sayHello btn
        sayHelloBtn.setOnClickListener(v -> {
            helloText.setText(R.string.hello_text);
        });

        //feature 1 : click on the text to delete it
        helloText.setOnClickListener(v -> {
            helloText.setText("");
            Toast.makeText(getApplicationContext(), DELETE_MSG, Toast.LENGTH_LONG).show();
        });

    }


}