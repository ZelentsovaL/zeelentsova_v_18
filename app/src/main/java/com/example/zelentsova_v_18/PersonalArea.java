package com.example.zelentsova_v_18;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener{



    String login;
    TextView naming;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);
        Button allorders = findViewById(R.id.ordersbtn);
        allorders.setOnClickListener(this);
//        naming = findViewById(R.id.username);
//        Bundle extras = getIntent().getExtras();
//        login = extras.getString("name");
//        naming.setText(login);


    }



    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.backbutton) {
            this.finish();
        }
        else if (id == R.id.ordersbtn) {
            startActivity(new Intent(this, Notice.class));
        }

    }
}