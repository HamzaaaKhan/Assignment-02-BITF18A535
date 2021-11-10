package com.example.makharijulmahroof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.makharijulmahroof.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view){
        Intent next = new Intent(this, Homepage.class);
        startActivity(next);
    }
    public void button(View view){

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/HamzaaaKhan/Assignment-02-BITF18A535/tree/master/MakharijQuizapp"));
            startActivity(browserIntent);


    }
}