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

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener {
    Button   confirmChangePass;
    EditText oldPass, newPass, newPassConfirm;
    ImageView         backToProfile;
    SharedPreferences prefs;
    private       Context mContext;
    public static Handler changePasswordhandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        findID();
        confirmChangePass.setOnClickListener(this);
        prefs     = FoodZone.getContext().getSharedPreferences("UserInfo", MODE_PRIVATE);

        changePasswordhandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);

                String result = (String) msg.obj;
                if (result.equals("Success")) {
                    FoodZone.showToast(changePasswordhandler, "Updated Successful");
                    Intent confirmIntent = new Intent(ChangePasswordActivity.this, ProfileActivity.class);
                    startActivity(confirmIntent);
                    finish();
                } else
                    FoodZone.showToast(changePasswordhandler, (String) msg.obj);
            }
        };
    }

    public void findID() {
        backToProfile     = (ImageView) findViewById(R.id.backtoprofile);
        confirmChangePass = (Button) findViewById(R.id.btn_confirmChangePass);
        oldPass           = (EditText) findViewById(R.id.et_oldPass);
        newPass           = (EditText) findViewById(R.id.et_newPass);
        newPassConfirm    = (EditText) findViewById(R.id.et_newPassConfirm);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_confirmChangePass:
                String op = oldPass.getText().toString(),
                        np = newPass.getText().toString(),
                        npc = newPassConfirm.getText().toString();

                if (!np.equals(npc)) {
                    Toast.makeText(getContext(), "Retyped new password does not match", Toast.LENGTH_SHORT).show();
                    break;
                }

                UpdatePasswordRequest request = UpdatePasswordRequest.newBuilder()
                        .setUsername(prefs.getString("Username", null))
                        .setOldPassword(op)
                        .setNewPassword(np)
                        .build();

                ContainerClient.getInstance().sendUpdatePasswordRequest(request);
                break;

            case R.id.backtoprofile:
                Intent confirmIntent = new Intent(ChangePasswordActivity.this, ProfileActivity.class);
                startActivity(confirmIntent);
                finish();
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = changePasswordhandler;
    }
}