package com.example.zelentsova_v_18;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Notice extends AppCompatActivity implements View.OnClickListener {
    CheckBox ch1, ch2, ch3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.notice);
        ImageView backbutton = findViewById(R.id.statbackbtn);
        backbutton.setOnClickListener(this);

        Button towebbtn = findViewById(R.id.towebbtn);
        towebbtn.setOnClickListener(this);

        CheckBox cb = (CheckBox) findViewById(R.id.checkboxgetted1);
        cb.setOnClickListener(this);
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkboxgetted2);
        cb1.setOnClickListener(this);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkboxgetted3);
        cb2.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.statbackbtn) {
            this.finish();
        } else if (v.getId() == R.id.towebbtn) {
            Intent intent = new Intent("android.intent.action.DIAL");
            startActivity(intent);

        } else if (v.getId() == R.id.checkboxgetted1) {
            Button web = findViewById(R.id.towebbtn);
            web.setBackgroundColor(Color.BLUE);
        } else if (v.getId() == R.id.checkboxgetted2) {
            TextView tv = findViewById(R.id.textView11);
            tv.setBackgroundColor(Color.GREEN);

        } else if (v.getId() == R.id.checkboxgetted3) {
            TextView tvv = findViewById(R.id.textView13);
            tvv.setBackgroundColor(Color.RED);

        }
    }
}