package com.example.foodzoneclient.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodzoneclient.R;

import java.util.ArrayList;

public class SuccessScreenActivity extends AppCompatActivity {
    Button   homeBtn, historyBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_screen);
        homeBtn      = findViewById(R.id.homeBtn);
        historyBtn      =  findViewById(R.id.historyBtn);

        homeBtn.setOnClickListener(v -> {
            MainScreenActivity.list = new ArrayList<>();

            startActivity(new Intent(SuccessScreenActivity.this, MainScreenActivity.class));
            finish();
        });

        historyBtn.setOnClickListener(v -> {
            startActivity(new Intent(SuccessScreenActivity.this, HistoryActivity.class));
            finish();
        });
    }
}