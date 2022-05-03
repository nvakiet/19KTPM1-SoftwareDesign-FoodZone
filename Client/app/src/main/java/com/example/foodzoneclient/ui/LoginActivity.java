package com.example.foodzoneclient.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;

import com.cloudinary.android.MediaManager;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.FoodZone;
import com.google.android.material.tabs.TabLayout;

import java.io.IOException;
import java.io.InputStream;

public class LoginActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AssetManager assetManager = FoodZone.getContext().getResources().getAssets();
        InputStream is = null;
        try {
            is = assetManager.open("server.txt");
        } catch (IOException e) {
            Log.e(ContainerClient.LOG_TAG, "Can't read server list.", e);
        }
        if (is != null) {
            // Initialize the server IPs
            ContainerClient.getInstance().initServerIPs(is);
        }

        // find id of these things
        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Register"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        LoginAdapter loginAdapter = new LoginAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(loginAdapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTranslationY(0);

        tabLayout.setAlpha(v);

        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();
        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setOffscreenPageLimit(2);
    }

    public void selectFragment(int index) {
        viewPager.setCurrentItem(index, true);
    }
}

class LoginAdapter extends FragmentStatePagerAdapter  {

    public LoginAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new LoginFragment();
            case 1:
                return new RegisterFragment();
            default:
                return new LoginFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title="Login";
                break;
            case 1:
                title="Register";
        }
        return title;
    }
}