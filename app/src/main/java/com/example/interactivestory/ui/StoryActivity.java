package com.example.interactivestory.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.interactivestory.R;
import com.example.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {



    public static final String TAG = StoryActivity.class.getSimpleName();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));


        if(name==null || name.isEmpty()){
            name = "friend";
        }

        Log.d(TAG, name);


    }
}

