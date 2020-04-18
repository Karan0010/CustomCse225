package com.example.cse225;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class CustomCheckbox extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_checkbox);

        findViewById(R.id.checkbox1).setOnClickListener(this);
        findViewById(R.id.checkbox2).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        TextView tv;


        if (v.getId()==R.id.checkbox1) {
            tv = (TextView)findViewById(R.id.textview1);


        } else {
            tv = (TextView)findViewById(R.id.textview2);
        }

        if (((CheckBox)v).isChecked()) {
            tv.setText("(Swimming Selected)");

        } else {
            tv.setText("(Basketball Selected)");

        }

    }

}