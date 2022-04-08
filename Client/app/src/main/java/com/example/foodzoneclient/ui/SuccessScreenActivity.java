package com.example.foodzoneclient.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.foodzoneclient.R;

public class SuccessScreenActivity extends AppCompatActivity {
    Button returnMain;
    TextView textDescription;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_screen);
        returnMain=(Button) findViewById(R.id.returnMain);
        textDescription=(TextView) findViewById(R.id.textDes);

        returnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(SuccessScreenActivity.this, MainScreenActivity.class);
                startActivity(returnIntent);
                finish();
            }
        });
    }
}