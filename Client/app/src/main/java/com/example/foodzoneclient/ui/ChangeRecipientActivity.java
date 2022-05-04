package com.example.foodzoneclient.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;

public class ChangeRecipientActivity extends AppCompatActivity {
    Button            saveBtn;
    EditText          ets[]; // fullname address ID phone email
    CheckBox          isUsingDefaultInfo;
    ImageView         backBtn;
    SharedPreferences prefRecipient, prefUser;
    SharedPreferences.Editor prefRecipientEdit;

    String[] recipientInfo, userInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_recipient);

        backBtn = findViewById(R.id.backToOrder);

        isUsingDefaultInfo = findViewById(R.id.useUserInfoCheckbox);

        ets = new EditText[]{findViewById(R.id.name),
                findViewById(R.id.address),
                findViewById(R.id.ID),
                findViewById(R.id.phone),
                findViewById(R.id.email)};

        saveBtn = findViewById(R.id.btn_saveInfo);

        prefRecipient     = FoodZone.getContext().getSharedPreferences("RecipientInfo", MODE_PRIVATE);
        prefRecipientEdit = prefRecipient.edit();

        prefUser = FoodZone.getContext().getSharedPreferences("UserInfo", MODE_PRIVATE);

        // GET RECIPIENT INFO
        recipientInfo = new String[]{
                prefRecipient.getString("Fullname", ""),
                prefRecipient.getString("Address", ""),
                prefRecipient.getString("ID", ""),
                prefRecipient.getString("Phone", ""),
                prefRecipient.getString("Email", "")
        };


        // GET USER INFO
        userInfo = new String[]{
                prefUser.getString("Fullname", ""),
                prefUser.getString("Address", ""),
                prefUser.getString("ID", ""),
                prefUser.getString("Phone", ""),
                prefUser.getString("Email", "")
        };

        backBtn.setOnClickListener(view -> onBackPressed());

        isUsingDefaultInfo.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                // IF CHECKBOX IS CHECKED, SET INFO TO USER INFO
                for (int i = 0; i < 5; ++i)
                     ets[i].setText(userInfo[i]);
            else
                // IF CHECKBOX IS UNCHECKED, LEAVE SPACE FOR CLIENT TO ENTER
                for (int i = 0; i < 5; ++i)
                    if (!ets[i].isFocused())
                        ets[i].setText(recipientInfo[i]);
        });

        isUsingDefaultInfo.setChecked(true);

        for (EditText et : ets) {
            et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    et.setSelection(et.getText().length());
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    boolean isDefaultInfoChanged = false;
                    for (int j = 0; j < 5; ++j)
                        if (!(ets[j].getText().toString().equals(userInfo[j]))) {
                            System.out.println("$" + ets[j].getText().toString() + "$ ' $" + userInfo[j] + "$");
                            isDefaultInfoChanged = true;
                            break;
                        }

                    if (isDefaultInfoChanged)
                        isUsingDefaultInfo.setChecked(false);
                }
            });
        }


        saveBtn.setOnClickListener(view -> {
            prefRecipientEdit
                    .putString("Fullname", ets[0].getText().toString())
                    .putString("Address", ets[1].getText().toString())
                    .putString("ID", ets[2].getText().toString())
                    .putString("Phone", ets[3].getText().toString())
                    .putString("Email", ets[4].getText().toString())
                    .apply();


            onBackPressed();
        });
    }
}
