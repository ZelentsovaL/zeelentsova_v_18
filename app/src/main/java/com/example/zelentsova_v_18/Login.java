package com.example.zelentsova_v_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText login;
    String logintext;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (EditText) findViewById(R.id.login_edit);
        logintext = login.getText().toString();

    }
    //    private String getData() {
//
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        DocumentReference docRef = db.collection("users").document(logintext);
//        Task<DocumentSnapshot> doc = docRef.get();
//        DocumentSnapshot snap = doc.getResult();
//        String name = snap.getString("name");
//        return name;
//    }

    @Override
    public void onClick(View v){
 //        String login = getData();
        Intent intent = new Intent(this, PersonalArea.class);
//        intent.putExtra("name", login);
        startActivity(intent);

    }
}