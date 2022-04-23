package com.example.foodzoneclient.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
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
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.protocols.UserInfo;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView profile_backtomain;
    EditText  profile_name, profile_address, profile_phone, profile_id;
    Button logout, updateInfo, changePass;
    private       Context mContext;
    public static Handler profileHandler;
    SharedPreferences        pref;
    SharedPreferences.Editor prefEdit;
    CircleImageView          profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        findID();

        profile_backtomain.setOnClickListener(this);

        pref     = FoodZone.getContext().getSharedPreferences("UserInfo", MODE_PRIVATE);
        prefEdit = pref.edit();
        profile_name.setText(pref.getString("Fullname", null));
        profile_address.setText(pref.getString("Address", null));
        profile_id.setText(pref.getString("ID", null));
        profile_phone.setText(pref.getString("Phone", null));

        //use Handler to receive Message
        ProfileActivity.profileHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                profile_name.setText((String) msg.obj);
            }
        };

        updateInfo.setOnClickListener(this);
        changePass.setOnClickListener(this);
        logout.setOnClickListener(this);

        profileHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    FoodZone.showToast(profileHandler, "Updated Successful");
                    if (result.equals("Success")) {

                        prefEdit.putString("Fullname", profile_name.getText().toString())
                                .putString("Address", profile_address.getText().toString())
                                .putString("ID", profile_id.getText().toString())
                                .putString("Phone", profile_phone.getText().toString())
                                .apply();
                    }
                } else if (msg.what == -100 || msg.what == -200) {
                    FoodZone.showToast(profileHandler, (String) msg.obj);
                }
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = profileHandler;
    }

    public void findID() {
        profile_backtomain = findViewById(R.id.profile_backtomain);
        profile_name       = findViewById(R.id.profile_name);
        logout             = findViewById(R.id.logout_button);
        changePass         = findViewById(R.id.btn_changePass);
        profile_address    = findViewById(R.id.profile_address);
        profile_id         = findViewById(R.id.profile_id);
        profile_phone      = findViewById(R.id.profile_phone);
        updateInfo         = findViewById(R.id.btn_updateInfo);
        profile_image      = findViewById(R.id.profile_image);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.profile_backtomain:
                Intent newIntent = new Intent(ProfileActivity.this, MainScreenActivity.class);
                //finish();
                break;
            case R.id.btn_updateInfo: {
                AlertDialog dialog = new AlertDialog.Builder(ProfileActivity.this)
                        .setTitle("Update")
                        .setMessage("Do you want to update your profile with the current information?")
                        .setPositiveButton("Yes", (dialogInterface, i) -> {
                            UserInfo userInfo = UserInfo.newBuilder()
                                    .setUsername(pref.getString("Username", null))
                                    .setFullname(profile_name.getText().toString())
                                    .setAddress(profile_address.getText().toString())
                                    .setId(profile_id.getText().toString())
                                    .setPhone(profile_phone.getText().toString())
                                    .build();
                            ContainerClient.getInstance().sendUpdateInfoRequest(userInfo);
                        })
                        .setNegativeButton("No", null)
                        .setIcon(R.drawable.dialog_info)
                        .show();

                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextSize(18);
                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#ff999999"));
                dialog.getButton(Dialog.BUTTON_NEGATIVE).setTextSize(18);
                break;
            }
            case R.id.logout_button: {
                AlertDialog dialog = new AlertDialog.Builder(ProfileActivity.this)
                        .setTitle("Logout")
                        .setMessage("Are you sure you want to logout?")
                        .setPositiveButton("Yes", (dialogInterface, i) -> {
                            ContainerClient.getInstance().disconnect();
                            prefEdit.clear().apply();
                            Intent outIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                            startActivity(outIntent);
                        })
                        .setNegativeButton("No", null)
                        .setIcon(R.drawable.dialog_warning)
                        .show();

                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextSize(18);
                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#ff999999"));
                dialog.getButton(Dialog.BUTTON_NEGATIVE).setTextSize(18);


//                Intent myIntent = new Intent(ProfileActivity.this, LoginActivity.class);
//                startActivity(myIntent);
//                finish();

                break;
            }
            case R.id.btn_changePass:
                Intent changePassIntent = new Intent(ProfileActivity.this, ChangePasswordActivity.class);
                startActivity(changePassIntent);
        }
    }

}