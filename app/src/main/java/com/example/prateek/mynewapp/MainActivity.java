package com.example.prateek.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;
    LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (RecyclerView)findViewById(R.id.recyclerView);
        manager = new LinearLayoutManager(getApplicationContext());
        view.setLayoutManager(manager);
        Log.d("Tag","RecyclerView");

        ArrayList arr = new ArrayList();
        arr.add("Person1");
        arr.add("Person2");
        arr.add("Person3");
        arr.add("Person4");
        arr.add("Person5");
        arr.add("Person6");
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),arr);
        view.setAdapter(adapter);
    }
}
