package com.example.makharijulmahroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.makharijulmahroof.R;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void startQuiz(View view){
        Intent next = new Intent(this, QuizActivity.class);
        startActivity(next);
    }

    public void LearnActivity(View view){
        Intent next = new Intent(this, practice.class);
        startActivity(next);
    }
}