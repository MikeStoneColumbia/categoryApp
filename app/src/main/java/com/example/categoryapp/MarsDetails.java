package com.example.categoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MarsDetails extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars_details);

       tv = findViewById(R.id.message);

       Intent userMessage = getIntent();

       String msg = userMessage.getStringExtra("username");

       // adding a comment here because

        Log.d("tag","I am making this comment in the branchTest branch");

       tv.setText(msg);

    }
}
