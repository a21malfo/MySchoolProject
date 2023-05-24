package com.example.myschoolproject;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private ArrayList<Dog> dogs;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter dogAdapter;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21malfo";
    private final String JSON_FILE = "dog.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new JsonFile(this, this).execute(JSON_FILE);
        new JsonTask(this).execute(JSON_URL);

        // Lookup the recyclerview in activity layout
        recyclerView = findViewById(R.id.recyclerView);
        dogs = new ArrayList<Dog>();
        // Create adapter passing in the sample user data
        dogAdapter = new RecyclerViewAdapter(dogs);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(dogAdapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);

        //mountains = new Gson().fromJson(json, new TypeToken<ArrayList<Mountain>>(){}.getType());
        ArrayList<Dog> data = new Gson().fromJson(json, new TypeToken<ArrayList<Dog>>(){}.getType());
        dogs.addAll(data);


        dogAdapter.notifyDataSetChanged();
    }

}