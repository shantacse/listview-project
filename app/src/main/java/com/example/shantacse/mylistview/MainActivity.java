package com.example.shantacse.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.shantacse.mylistview.R.id.showCustom;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.show_list);

       final String[] allfemale=getResources().getStringArray(R.array.female);
       arrayAdapter=new ArrayAdapter(this, R.layout.customlayout,R.id.mytext,allfemale);
       listView.setAdapter(arrayAdapter);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               Toast.makeText(getApplicationContext(),"clicked on "+allfemale[position],Toast.LENGTH_SHORT).show();


               Intent in=new Intent(getApplicationContext(),details.class);
               in.putExtra("text",allfemale[position]);
               startActivity(in);
           }
       });




    }
}
