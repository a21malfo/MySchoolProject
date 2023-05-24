package com.example.myschoolproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityAboutDogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dogs);
        Button goback = findViewById(R.id.goback);
        goback.setOnClickListener(v -> {
            Log.d("SCREEN2", "goback");
            finish();
        });

}
}