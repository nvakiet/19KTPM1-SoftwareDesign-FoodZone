package com.example.foodzoneclient.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.protocols.RegisterRequest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterFragment extends Fragment {
    EditText reg_username;
    EditText reg_password;
    EditText phone;
    EditText address;
    EditText fullname;
    EditText civID;
    Button regButton;
    CheckBox agreement;
    public static Handler registerFragmentHandler;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_register, container, false);

        reg_username = root.findViewById(R.id.reg_username);
        reg_password = root.findViewById(R.id.reg_password);
        fullname = root.findViewById(R.id.fullname);
        phone = root.findViewById(R.id.phone);
        address = root.findViewById(R.id.address);
        regButton = root.findViewById(R.id.regButton);
        civID = root.findViewById(R.id.civID);
        agreement = root.findViewById(R.id.checkbox);

        reg_username.setTranslationX(0);
        reg_password.setTranslationX(0);
        fullname.setTranslationX(0);
        phone.setTranslationX(0);
        address.setTranslationX(0);
        regButton.setTranslationX(0);
        civID.setTranslationX(0);
        agreement.setTranslationX(0);

        reg_username.setAlpha(v);
        reg_password.setAlpha(v);
        fullname.setAlpha(v);
        phone.setAlpha(v);
        address.setAlpha(v);
        regButton.setAlpha(v);
        civID.setAlpha(v);
        agreement.setAlpha(v);

        reg_username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        reg_password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        fullname.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        civID.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
        phone.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1100).start();
        address.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1200).start();
        agreement.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1400).start();
        regButton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1600).start();

        registerFragmentHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    FoodZone.showToast(registerFragmentHandler, result);
                    if (result.equals("Success")) {
                        clearData();
                        ((LoginActivity) getActivity()).selectFragment(0);
                    }
                }
                else if (msg.what == -100 || msg.what == -200) {
                    FoodZone.showToast(registerFragmentHandler, (String) msg.obj);
                }
            }
        };

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!agreement.isChecked()) {
                    FoodZone.showToast(registerFragmentHandler, "You must agree to our Terms and Policy before registering an account");
                    return;
                }
                RegisterRequest request = RegisterRequest.newBuilder()
                        .setUsername(reg_username.getText().toString())
                        .setPassword(reg_password.getText().toString())
                        .setFullname(fullname.getText().toString())
                        .setId(civID.getText().toString())
                        .setPhone(phone.getText().toString())
                        .setAddress(address.getText().toString())
                        .build();
                ContainerClient.getInstance().sendRegisterRequest(request);
            }
        });
        return root;

    }

    @Override
    public void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = registerFragmentHandler;
    }

    public void clearData(){
        reg_username. getText(). clear();
        reg_password. getText(). clear();
        phone.getText().clear();
        address.getText().clear();
        fullname.getText().clear();
        civID.getText().clear();
        agreement.toggle();
    }
    public void toLoginActivity() {
        //Start new activity
        Intent myIntent = new Intent(RegisterFragment.this.getActivity(), LoginActivity.class);
        startActivity(myIntent);
        getActivity().finish();
    }
}