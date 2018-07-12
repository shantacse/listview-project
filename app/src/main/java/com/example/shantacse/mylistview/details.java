package com.example.shantacse.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);


        TextView textView=findViewById(R.id.details_text);



        String in=getIntent().getStringExtra("text");


        getSupportActionBar().setTitle(in);
        textView.setText(in);

    }
}
