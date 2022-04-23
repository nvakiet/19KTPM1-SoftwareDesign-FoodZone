package com.example.foodzoneclient.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.model.Product;

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
    ArrayList<Boolean> tempArr = new ArrayList<Boolean>(Collections.nCopies(4, false));
    ArrayList<Product> foodList;
    ArrayList<Product> foodMenu = new ArrayList<Product>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        findID();

        Intent intent = getIntent();
//        foodList = intent.getParcelableArrayListExtra("cart_list");
        rID = intent.getStringExtra("resID");
        if (foodList == null) {
            foodList = new ArrayList<Product>();
        }
//        else {
//            for (Product item : foodList) {
//                int i = Integer.parseInt(item.getID().substring(4, item.getID().length()));
//                tempArr.set(i-1, true);
//            }
//        }

        BufferedReader reader = null;
        AssetManager assetManager = FoodZone.getContext().getResources().getAssets();
        InputStream is = null;
        try {
            is = assetManager.open("Food.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (is != null) {
            reader = new BufferedReader(new InputStreamReader(is));
            try {
                String line = reader.readLine();
                while (line != null) {
                    String id = line;
                    String name = reader.readLine();
                    String Des = reader.readLine();
                    int price = Integer.parseInt(reader.readLine());
                    foodMenu.add(new Product(id, name, Des, price));
                    line = reader.readLine();
                }
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        backBtt.setOnClickListener(this);
        cartButton.setOnClickListener(this);

        food.setAdapter(new FoodMenuAdapter(this, foodMenu, foodList, tempArr));
    }

    public void findID() {
        food = (ListView) findViewById(R.id.lv_foodMenu);
        backBtt = (ImageView) findViewById(R.id.back2main);
        cartButton = (Button) findViewById(R.id.CartButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.addToCart1:
//                if(tempArr.get(0) ==false){
//                    //readFood(reader,0);
//                    foodList.add(foodMenu.get(0));
//                    tempArr.set(0,true);
//                }
//                else{
//                    for(int j =0;j<foodList.size();j++){
//                        if(foodList.get(j).getID().equals("item1")) {
//                            foodList.get(j).increaseAmount(1);
//                            break;
//                        }
//                    }
//                }
//                break;
//            case R.id.addToCart2:
//                if(tempArr.get(1) ==false){
//                    //readFood(reader,1);
//                    foodList.add(foodMenu.get(1));
//                    tempArr.set(1,true);
//                }
//                else{
//                    for(int j =0;j<foodList.size();j++){
//                        if(foodList.get(j).getID().equals("item2")) {
//                            foodList.get(j).increaseAmount(1);
//                            break;
//                        }
//                    }
//                }
//                break;
//            case R.id.addToCart3:
//                if(tempArr.get(2) ==false){
//                    //readFood(reader,2);
//                    foodList.add(foodMenu.get(2));
//                    tempArr.set(2,true);
//                }
//                else{
//                    for(int j =0;j<foodList.size();j++){
//                        if(foodList.get(j).getID().equals("item3")) {
//                            foodList.get(j).increaseAmount(1);
//                            break;
//                        }
//                    }
//                }
//                break;
//            case R.id.addToCart4:
//                if(tempArr.get(3) ==false){
//                    //readFood(reader,3);
//                    foodList.add(foodMenu.get(3));
//                    tempArr.set(3,true);
//                }
//                else{
//                    for(int j =0;j<foodList.size();j++){
//                        if(foodList.get(j).getID().equals("item4")) {
//                            foodList.get(j).increaseAmount(1);
//                            break;
//                        }
//                    }
//                }
//                break;
            case R.id.back2main:
                finish();
                break;
            case R.id.CartButton:
                Intent cartIntent = new Intent(FoodMenuActivity.this, CartActivity.class);
                cartIntent.putExtra("resID", rID);
                cartIntent.putParcelableArrayListExtra("food_list", foodList);
                startActivityForResult(cartIntent, REQUEST_CODE);
//                while (cart.cartScreenHandler == null) {
//                    continue;
//                }
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            foodList = data.getParcelableArrayListExtra("cart_list");
            rID = data.getStringExtra("resID");

            for (int i = 0; i < tempArr.size(); i++) {
                tempArr.set(i, false);
            }

            for (int i = 0; i < foodList.size(); i++) {
                int tmp = Integer.parseInt(foodList.get(i).getID().substring(4));
                tempArr.set(tmp - 1, true);
            }

            food.setAdapter(new FoodMenuAdapter(this, foodMenu, foodList, tempArr));
        }
    }

    int REQUEST_CODE = 1111;

//    private void readFood(BufferedReader reader,int ind){
//        String temp;
//        int i=0;
//        try{
//            while((temp=reader.readLine())!=null){
//                if(i<ind){
//                    for(int j=0;j<3;j++){
//                        reader.readLine();
//                    }
//                    continue;
//                }
//                String id=temp;
//                String name=reader.readLine();
//                String Des=reader.readLine();
//                int price=Integer.parseInt(reader.readLine());
//                foodList.add(new Product(temp,name,Des,price));
//                break;
//            }
//        }
//        catch (Exception e){e.printStackTrace();}
//    }
}

class FoodMenuAdapter extends BaseAdapter {
    private List<Product> listData;
    private List<Product> listCart;
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

    public FoodMenuAdapter(Context aContext, List<Product> listData, List<Product> listCart, List<Boolean> listCheck) {
        this.context = aContext;
        this.listCart = listCart;
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
        holder.foodImg.setImageResource(getImageID(product.getID()));

        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listCheck.get(position) == false) {
                    listCart.add(listData.get(position));
                    listCheck.set(position, true);
                }
                else {
                    for (int i = 0; i < listCart.size(); i++) {
                        if (listCart.get(i).getID().equals(listData.get(position).getID())) {
                            listCart.get(i).increaseAmount(1);
                            break;
                        }
                    }
                }

                notifyDataSetChanged();
            }
        });

        return convertView;
    }


    private int getImageID(String imgName) {
        Resources res = context.getResources();
        int resID = res.getIdentifier(imgName, "drawable", context.getPackageName());
        return resID;
    }
}
