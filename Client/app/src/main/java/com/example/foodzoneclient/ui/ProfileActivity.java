package com.example.foodzoneclient.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
//import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodzoneclient.R;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView profile_backtomain;
    TextView profile_name, profile_address, profile_phone, profile_email;
    Button logout,changePass;
    SharedPreferences myPreferences;
    private Context mContext;
    public static Handler profileHandler;
    SharedPreferences prefGet;
    SharedPreferences.Editor prefGetEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        findID();
        profile_backtomain.setOnClickListener(this);
        prefGet = getApplicationContext().getSharedPreferences("user_info", MODE_PRIVATE);
        prefGetEdit = prefGet.edit();
        profile_name.setText(prefGet.getString("Username", null));
        profile_address.setText(prefGet.getString("UserAddress", null));
        profile_phone.setText(prefGet.getString("UserPhone", null));
        profile_email.setText(prefGet.getString("UserEmail", null));
        logout.setOnClickListener(this);
        changePass.setOnClickListener(this);
    }
    public void findID(){
        profile_backtomain=(ImageView) findViewById(R.id.profile_backtomain);
        profile_name=(TextView) findViewById(R.id.profile_name);
        logout=(Button) findViewById(R.id.logout_button);
        changePass=(Button) findViewById(R.id.btn_changePass);
        profile_address = findViewById(R.id.profile_address);
        profile_email = findViewById(R.id.profile_email);
        profile_phone = findViewById(R.id.profile_phone);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.profile_backtomain:
                Intent newIntent= new Intent(ProfileActivity.this, MainScreenActivity.class);
                finish();
                break;
            case R.id.logout_button:
                Intent outIntent=new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(outIntent);
                prefGetEdit.clear().apply();
                Intent myIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(myIntent);
                finish();
                break;
            case R.id.btn_changePass:
                Intent changePassIntent=new Intent(ProfileActivity.this, ChangePasswordActivity.class);
                startActivity(changePassIntent);
                finish();
        }
    }

}