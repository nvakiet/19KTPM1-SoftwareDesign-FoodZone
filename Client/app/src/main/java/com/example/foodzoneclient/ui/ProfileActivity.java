package com.example.foodzoneclient.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cloudinary.android.MediaManager;
import com.cloudinary.android.callback.ErrorInfo;
import com.cloudinary.android.callback.UploadCallback;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Cart;
import com.example.foodzoneclient.protocols.UserInfo;

import java.util.ArrayList;
import java.util.Map;

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
    Uri                      newlySelectedImage = null;
    String imgName;
    String cloudinaryFolder = "FoodZone/users/";

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
        imgName = pref.getString("Image", null);
        cloudinaryFolder += pref.getString("Username", "") + "/";
        downloadUserImg();

        //use Handler to receive Message
        ProfileActivity.profileHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                profile_name.setText((String) msg.obj);
            }
        };

        profile_image.setOnClickListener(this);
        updateInfo.setOnClickListener(this);
        changePass.setOnClickListener(this);
        logout.setOnClickListener(this);

        profileHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    if (result.equals("Success")) {

                        FoodZone.showToast(profileHandler, "Updated successfully");
                        prefEdit.putString("Fullname", profile_name.getText().toString())
                                .putString("Address", profile_address.getText().toString())
                                .putString("ID", profile_id.getText().toString())
                                .putString("Phone", profile_phone.getText().toString())
                                .putString("Image", imgName)
                                .apply();
                    } else {
                        FoodZone.showToast(profileHandler, result);
                        imgName = pref.getString("Image", null);
                    }
//                } else if (msg.what == 2) {
//                    UpdateProfileImgResponse response = (UpdateProfileImgResponse) msg.obj;
//                    if (response.getResult().equals("Success")) {
//                        FoodZone.showToast(profileHandler, "Updated profile image successfully");
//                        prefEdit.putString("Image", response.getNewImgName()).apply();
//                    } else {
//                        FoodZone.showToast(profileHandler, response.getResult());
//                    }
//                }
                }
                else if (msg.what == -100 || msg.what == -200) {
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
                startActivity(new Intent(ProfileActivity.this, MainScreenActivity.class));
                break;
            case R.id.btn_updateInfo: {
                AlertDialog dialog = new AlertDialog.Builder(ProfileActivity.this)
                        .setTitle("Update")
                        .setMessage("Do you want to update your profile with the current information?")
                        .setPositiveButton("Yes", (dialogInterface, i) -> {
                            FoodZone.showToast(profileHandler, "Updating user info...");
                            if (newlySelectedImage != null) {
                                //upload newlySelectedImage
                                updateUserInfoWithImg();
                            } else {
                                updateUserInfo(pref.getString("Image", null));
                            }
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

                            if (Cart.getCartInstance() != null) {
                                Cart.clear();
                            }

                            Intent outIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                            startActivity(outIntent);
                        })
                        .setNegativeButton("No", null)
                        .setIcon(R.drawable.dialog_warning)
                        .show();

                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextSize(18);
                dialog.getButton(Dialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#ff999999"));
                dialog.getButton(Dialog.BUTTON_NEGATIVE).setTextSize(18);
                break;
            }
            case R.id.btn_changePass:
                Intent changePassIntent = new Intent(ProfileActivity.this, ChangePasswordActivity.class);
                startActivity(changePassIntent);
                break;
            case R.id.profile_image:
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 3);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            newlySelectedImage = data.getData();
            ((ImageView) findViewById(R.id.profile_image)).setImageURI(newlySelectedImage);
        }
    }

    private void downloadUserImg() {
        if (imgName != null) {
            // Get the image URL from Cloudinary
            imgName = MediaManager.get().url().generate(cloudinaryFolder + imgName);
            Log.i(ContainerClient.LOG_TAG, "User avatar url: " + imgName);
        }

        // Download the image and set it to the image view using Glide
        Glide.with(this)
                .load(imgName)
                .placeholder(R.drawable.placeholder_user)
                .fallback(R.drawable.placeholder_user)
                .error(R.drawable.placeholder_user)
                .into(profile_image);
    }

    private void updateUserInfo(String imgName) {
        UserInfo userInfo = UserInfo.newBuilder()
                .setUsername(pref.getString("Username", null))
                .setFullname(profile_name.getText().toString())
                .setAddress(profile_address.getText().toString())
                .setId(profile_id.getText().toString())
                .setPhone(profile_phone.getText().toString())
                .setImgName(imgName)
                .build();
        ContainerClient.getInstance().sendUpdateInfoRequest(userInfo);
    }

    private void updateUserInfoWithImg() {
        // Upload image to Cloudinary
        String requestID = MediaManager.get().upload(newlySelectedImage)
                .unsigned("FZ_unsigned")
                .option("folder", cloudinaryFolder)
                .callback(new UploadCallback() {
                    @Override
                    public void onStart(String requestId) {
                        FoodZone.showToast(profileHandler,"Uploading user profile image...");
                    }

                    @Override
                    public void onProgress(String requestId, long bytes, long totalBytes) {
                        double percent = ((double)bytes / totalBytes) * 100;
                        FoodZone.showToastOverride(profileHandler, String.format("Uploading progress: %.2f%%", percent));
                    }

                    @Override
                    public void onSuccess(String requestId, Map resultData) {
                        // Send the new image name to the server
                        String[] folders = resultData.get("public_id").toString().split("/");
                        imgName = folders[folders.length - 1] + "." + resultData.get("format").toString();
                        Log.i(ContainerClient.LOG_TAG, "New profile img: " + imgName);
                        updateUserInfo(imgName);
                        Log.i(ContainerClient.LOG_TAG, "Sent new user image name to server.");
                    }

                    @Override
                    public void onError(String requestId, ErrorInfo error) {
                        FoodZone.showToast(profileHandler, error.getDescription());
                    }

                    @Override
                    public void onReschedule(String requestId, ErrorInfo error) {
                        FoodZone.showToast(profileHandler, "Rescheduling: " + error.getDescription());
                    }
                })
                .dispatch();
    }
}