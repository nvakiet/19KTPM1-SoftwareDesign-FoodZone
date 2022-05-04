package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.cloudinary.android.MediaManager;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Cart;
import com.example.foodzoneclient.model.Product;
import com.example.foodzoneclient.protocols.FoodListRequest;
import com.example.foodzoneclient.protocols.RestaurantListRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodMenuActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView backBtt;
    Button cartButton;
    ListView food;
    String rID;

    public static Handler foodListHandler;

    ArrayList<Boolean> tempArr;
    public static ArrayList<Product> list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        findID();

        backBtt.setOnClickListener(this);
        cartButton.setOnClickListener(this);

        list = new ArrayList<>();
        Intent intent = getIntent();
        rID = intent.getStringExtra("resID");
        Cart.getCartInstance();

        // get Food List of a Restaurant
        try {
            FoodListRequest request = FoodListRequest.newBuilder()
                    .setRestaurantID(rID)
                    .build();
            ContainerClient.getInstance().sendFoodListRequest(request);
        } catch (Exception e) {
            Log.e(ContainerClient.LOG_TAG, "Can't send food list request to server", e);
            Toast announce = Toast.makeText(getContext(), "Can't send food list request to server", Toast.LENGTH_SHORT);
            announce.show();
        }

        foodListHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    if (result.equals("Success")) {
                        tempArr = new ArrayList<Boolean>(Collections.nCopies(list.size(), false));
                        // TODO set data to the adapter UI
                        food.setAdapter(new FoodMenuAdapter(getContext(), list, tempArr));
                    }
                }
                else if (msg.what == -100 || msg.what == -200) {
                    FoodZone.showToast(foodListHandler, (String) msg.obj);
                }
            }
        };
    }

    public void findID() {
        food = (ListView) findViewById(R.id.lv_foodMenu);
        backBtt = (ImageView) findViewById(R.id.back2main);
        cartButton = (Button) findViewById(R.id.CartButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back2main:
                list = new ArrayList<>();
                Cart.setCurrentRestaurant(rID);
                //Cart.clear();
                finish();
                break;

            case R.id.CartButton:
                Intent cartIntent = new Intent(FoodMenuActivity.this, CartActivity.class);
                cartIntent.putExtra("resID", rID);
                //cartIntent.putParcelableArrayListExtra("food_list", foodList);
                startActivityForResult(cartIntent, REQUEST_CODE);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backBtt.performClick();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = foodListHandler;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {

            for (int i = 0; i < tempArr.size(); i++) {
                tempArr.set(i, false);
            }

            for (int i = 0; i < Cart.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getID() == Cart.get(i).getID()) {
                        tempArr.set(j, true);
                    }
                }
            }

            food.setAdapter(new FoodMenuAdapter(this, list, tempArr));
        }
    }

    int REQUEST_CODE = 1111;
}

class FoodMenuAdapter extends BaseAdapter {
    private List<Product> listData;
    private List<Boolean> listCheck;
    private LayoutInflater layoutInflater;
    private Context context;

    private class ViewHolder {
        ImageView foodImg;
        TextView foodName;
        TextView foodDes;
        TextView foodPrice;
        Button addToCart;
    }

    public FoodMenuAdapter(Context aContext, List<Product> listData, List<Boolean> listCheck) {
        this.context = aContext;
        this.listData = listData;
        this.listCheck = listCheck;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        if (listData != null) {
            return listData.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_food, null);
            holder = new ViewHolder();

            holder.foodImg = (ImageView) convertView.findViewById(R.id.menu_itemImg);
            holder.foodName = (TextView) convertView.findViewById(R.id.menu_item_name);
            holder.foodDes = (TextView) convertView.findViewById(R.id.menu_itemDes);
            holder.foodPrice = (TextView) convertView.findViewById(R.id.menu_price);
            holder.addToCart = convertView.findViewById(R.id.bt_addToCart);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product product = this.listData.get(position);
        holder.foodName.setText(product.getName());
        holder.foodDes.setText(product.getDes());
        holder.foodPrice.setText("Price: " + String.valueOf(product.getPrice()) + " VND");
        // Set image for item
        downloadMealImage(product.getImage(), holder.foodImg);

        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listCheck.get(position) == false) {
                    Cart.add(listData.get(position));
                    Cart.get(Cart.size() - 1).setAmount(1);
                    listCheck.set(position, true);
                }
                else {
                    for (int i = 0; i < Cart.size(); i++) {
                        if (Cart.get(i).getID().equals(listData.get(position).getID())) {
                            Cart.get(i).increaseAmount(1);
                            break;
                        }
                    }
                }

                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    /**
     * Download a meal image from Cloudinary based on imgName then load it into an ImageView using Glide.
     * @param imgName Filename of the meal image, queried from the server
     * @param imageView The ImageView to load the image into
     */
    private void downloadMealImage(String imgName, ImageView imageView) {
        String cloudinaryFolder = "/FoodZone/meals/";
        if (imgName != null && !imgName.equals("NULL")) {
            // Get the image URL from Cloudinary
            imgName = MediaManager.get().url().generate(cloudinaryFolder + imgName);
        }

        // Download the image and set it to the image view using Glide
        Glide.with(getContext())
                .load(imgName)
                .placeholder(R.drawable.placeholder_meal)
                .fallback(R.drawable.placeholder_meal)
                .error(R.drawable.placeholder_noimg)
                .into(imageView);
    }

    // LEGACY CODE
    private int getImageID(String imgName) {
        Resources res = context.getResources();
        int resID = res.getIdentifier(imgName, "drawable", context.getPackageName());
        return resID;
    }
}
