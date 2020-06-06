package com.example.categoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText username;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        username = findViewById(R.id.username);
        submit = findViewById(R.id.submit);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMars();

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                passName(username.getText().toString());

            }
        });


    }

    public void passName(String name){

       Intent i = new Intent(this,MarsDetails.class);
       i.putExtra("username",name);
       i.putExtra("info", "You inputted some text of your own!");
       startActivity(i);

    }

    public void goToMars(){

        Intent toMars = new Intent(this,MarsDetails.class);
        toMars.putExtra("info","You have clicked tv");
        startActivity(toMars);

    }

    public void goToScreen2(View view) {

        Intent intent = new Intent(this, MarsDetails.class);
        intent.putExtra("info","You have clicked the button");
        startActivity(intent);

    }
}
