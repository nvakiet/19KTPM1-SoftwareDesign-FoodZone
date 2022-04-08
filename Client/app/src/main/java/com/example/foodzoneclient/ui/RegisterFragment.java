package com.example.foodzoneclient.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.FoodZone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterFragment extends Fragment {
    EditText reg_username;
    EditText reg_password;
    EditText phone;
    EditText address;
    EditText email;
    Button regButton;
    public static Handler registerFragmentHandler;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_register, container, false);

        reg_username = root.findViewById(R.id.reg_username);
        reg_password = root.findViewById(R.id.reg_password);
        email = root.findViewById(R.id.email);
        phone = root.findViewById(R.id.phone);
        address = root.findViewById(R.id.address);
        regButton = root.findViewById(R.id.regButton);


        reg_username.setTranslationX(0);
        reg_password.setTranslationX(0);
        email.setTranslationX(0);
        phone.setTranslationX(0);
        address.setTranslationX(0);
        regButton.setTranslationX(0);


        reg_username.setAlpha(v);
        reg_password.setAlpha(v);
        email.setAlpha(v);
        phone.setAlpha(v);
        address.setAlpha(v);
        regButton.setAlpha(v);


        reg_username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        reg_password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        phone.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();
        address.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1100).start();
        regButton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1200).start();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLoginActivity();
            }
        });
        return root;

    }

    public boolean checkString(String userName) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]]");
        Matcher matcher = pattern.matcher(userName);
        boolean isSpecial = matcher.find();
        return isSpecial;
    }
    public void resetRegisterActivity() {
        Intent intent = new Intent();
        intent.setClass(FoodZone.getContext(), FoodZone.getContext().getClass());
        getActivity().finish();
        FoodZone.getContext().startActivity(intent);

    }
    public void clearData(){
        reg_username. getText(). clear();
        reg_password. getText(). clear();
        phone.getText().clear();
        address.getText().clear();
        email.getText().clear();
    }
    public void toLoginActivity() {
        //Start new activity
        Intent myIntent = new Intent(RegisterFragment.this.getActivity(), LoginActivity.class);
        startActivity(myIntent);
        getActivity().finish();
    }
}