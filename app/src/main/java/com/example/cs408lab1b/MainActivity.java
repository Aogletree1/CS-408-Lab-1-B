package com.example.cs408lab1b;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cs408lab1b.databinding.ActivityMainBinding;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private String[] Eightball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Eightball = getResources().getStringArray(R.array.Eightball);

    }

        public void onClick(View view){
            String tag = view.getTag().toString();

            if (tag.equals("helpButton")) {

                int index = (int)(Math.random() * Eightball.length);
                binding.response.setText(Eightball[index]);

            }

    }
}