package com.example.dell_i5.lab6p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

        ArrayList<DataModel> list=new ArrayList<>();


        list.add(new DataModel("Afsa","hello everyone","01:00 AM"));
        list.add(new DataModel("Hafsa","my second message","12:01 PM"));

        list.add(new DataModel("Kinza","hello everyone","02:00 AM"));
        list.add(new DataModel("Huda","my second message","12:03 PM"));
        CustomAdapter adapter =new CustomAdapter(this,R.layout.custom_row_layout,list);
        listView.setAdapter((ListAdapter) adapter);


    }
}
