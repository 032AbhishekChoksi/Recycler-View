package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    // Using ArrayList to store images data
    ArrayList phoneNumber = new ArrayList<>(Arrays.asList("9090909090", "9090909090", "9090909090", "9090909090"));
    ArrayList contactName = new ArrayList<>(Arrays.asList("Abhishek1", "Abhishek2", "Abhishek3", "Abhishek4"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recyclerview initialization
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, phoneNumber,contactName);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

}