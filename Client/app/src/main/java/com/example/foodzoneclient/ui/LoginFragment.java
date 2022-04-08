package com.example.foodzoneclient.ui;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.foodzoneclient.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginFragment extends Fragment {
    EditText username,password;
    Button Login;
    int ID;
    Context context;
    FloatingActionButton fb,gg,phone;
    float v=0;
    public static Handler loginFragmentHandler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        ViewGroup root= (ViewGroup) inflater.inflate(R.layout.fragment_login, container, false);
        context=this.getContext();
        username=(EditText) root.findViewById(R.id.username);
        password=(EditText) root.findViewById(R.id.password);
        Login=(Button)root.findViewById(R.id.loginButton);
        ID=R.id.login_fragment;
        fb=root.findViewById(R.id.fab_fb);
        gg=root.findViewById(R.id.fab_gg);
        phone=root.findViewById(R.id.fab_phone);
        Login= root.findViewById(R.id.loginButton);
        ////////////////////////////////////////////////////////////////////////
        SharedPreferences prefs= context.getSharedPreferences("user_data",MODE_PRIVATE);
        // Animations
        fb.setTranslationY(0);
        gg.setTranslationY(0);
        phone.setTranslationY(0);
        username.setTranslationX(0);
        password.setTranslationX(0);
        Login.setTranslationX(0);

        fb.setAlpha(v);
        gg.setAlpha(v);
        phone.setAlpha(v);
        username.setAlpha(v);
        password.setAlpha(v);
        Login.setAlpha(v);


        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        gg.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        phone.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        Login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMainPageActivity();
            }
        });
        return root;
    }

    public void toMainPageActivity() {
        //Start new activity
        Intent myIntent = new Intent(LoginFragment.this.getActivity(), MainScreenActivity.class);
        startActivity(myIntent);
        getActivity().finish();
    }
}