package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener {
    Button confirmChangePass;
    EditText oldPass,newPass,newPassConfirm;
    ImageView backToProfile;
    SharedPreferences myPreferences;
    private Context mContext;
    public static Handler changePasswordhandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        findID();
        SharedPreferences prefs = getSharedPreferences("user_info", MODE_PRIVATE);
        confirmChangePass.setOnClickListener(this);
        changePasswordhandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 3 ) {
                    if (msg.arg1 == 1) {
                        Toast announce = Toast.makeText(getContext(), (String) msg.obj, Toast.LENGTH_SHORT);
                        announce.show();
                        Intent confirmIntent=new Intent(ChangePasswordActivity.this, ProfileActivity.class);
                        startActivity(confirmIntent);
                        finish();
                    }
                    else if (msg.arg1 == -1 ) {
                        Toast announce1 = Toast.makeText(getContext(), (String) msg.obj, Toast.LENGTH_SHORT);
                        announce1.show();
                    }
                }
            }
        };

    }
    public void findID(){
        backToProfile=(ImageView) findViewById(R.id.backtoprofile);
        confirmChangePass=(Button) findViewById(R.id.btn_confirmChangePass);
        oldPass=(EditText) findViewById(R.id.et_oldPass);
        newPass=(EditText) findViewById(R.id.et_newPass);
        newPassConfirm=(EditText) findViewById(R.id.et_newPassConfirm);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_confirmChangePass:
                break;

            case R.id.backtoprofile:
                Intent confirmIntent=new Intent(ChangePasswordActivity.this, ProfileActivity.class);
                startActivity(confirmIntent);
                finish();
                break;
        }
    }
}