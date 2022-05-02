package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.protocols.UpdatePasswordRequest;

public class ChangeRecipientActivity extends AppCompatActivity {
    Button   confirmChangePass;
    EditText oldPass, newPass, newPassConfirm;
    ImageView         backBtn;
    SharedPreferences prefs;
    private       Context mContext;
    public static Handler changePasswordhandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_recipient);

        backBtn = findViewById(R.id.backToOrder);
        backBtn.setOnClickListener(view -> onBackPressed());

    }
}