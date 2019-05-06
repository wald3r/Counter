package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public Button buttonPlus, buttonMinus, buttonReset;
    public EditText editText;
    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlus = (Button) findViewById(R.id.button_Plus);
        buttonMinus = (Button) findViewById(R.id.button_Minus);
        buttonReset = (Button) findViewById(R.id.button_Reset);

        editText = (EditText) findViewById(R.id.editText_1);
        editText.setGravity(Gravity.CENTER);
        editText.setShowSoftInputOnFocus(false);
        editText.setCursorVisible(false);
        editText.setText("0");


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCounter();
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseCounter();
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCounter();
            }
        });
    }



    public void increaseCounter(){
        counter = Integer.parseInt(editText.getText() + "");
        counter++;
        editText.setText(counter + "");
    }

    public void decreaseCounter(){
        counter = Integer.parseInt(editText.getText() + "");

        if(counter > 0) {
            counter--;
            editText.setText(counter + "");
        }else{
            editText.setText(0 + "");
        }
    }


    public void resetCounter(){
        counter = 0;
        editText.setText(counter + "");
    }



}
