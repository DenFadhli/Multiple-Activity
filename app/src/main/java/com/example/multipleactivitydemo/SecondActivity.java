package com.example.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void backToMain(View view) {

//      Intent intent = new Intent(getApplicationContext(), MainActivity.class);

//      startActivity(intent);

        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        Toast.makeText(this, intent.getStringExtra("name"), Toast.LENGTH_SHORT).show();

    }
}