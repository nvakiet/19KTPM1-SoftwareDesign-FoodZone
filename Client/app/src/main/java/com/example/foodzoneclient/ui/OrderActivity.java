package com.example.foodzoneclient.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {
    ArrayList<Product> foodList;
    ImageView backbtt;
    String rID;
    SharedPreferences prefGet;
    SharedPreferences.Editor prefGetEdit;
    Button confirmPurchase;
    String userName,userAddress,userPhone;
    public static Handler orderActivityHandler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        findID();
        backbtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent= new Intent(OrderActivity.this, CartActivity.class);
                backIntent.putExtra("resID",rID);
                backIntent.putParcelableArrayListExtra("food_list", foodList);
                startActivity(backIntent);
            }
        });
        confirmPurchase.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                Intent confirmIntent = new Intent(OrderActivity.this, SuccessScreenActivity.class);
                startActivity(confirmIntent);
            }
        });

        // Get SharedPrereferences
        prefGet = getApplicationContext().getSharedPreferences("user_info", MODE_PRIVATE);
        prefGetEdit = prefGet.edit();
        getUserInform();
        retrieveCartList();
    }
    private void findID(){
        backbtt=(ImageView) findViewById(R.id.back2cart);
        confirmPurchase= (Button) findViewById(R.id.Confirm);
    }
    private void getUserInform(){
        userName=prefGet.getString("Username", null);
        userAddress=prefGet.getString("UserAddress", null);
        userPhone=prefGet.getString("UserPhone", null);
    }
    private void retrieveCartList() {
        Intent intent = getIntent();
        ArrayList<Product> newList = intent.getParcelableArrayListExtra("cart_list");
        rID = intent.getStringExtra("resID");
        if (foodList == null) {
            foodList = newList;
            newList = null;
        }
        if(foodList!=null){
            TextView totalbox;
            final ListView listView = (ListView) findViewById(R.id.orderListView);
            listView.setAdapter(new OrderListAdapter(this,foodList));
            // Iterate list view to calculate total price
            long total = 0;
            for (int i = 0; i < listView.getCount(); ++i) {
                View v = listView.getAdapter().getView(i, null, null);
                if (v != null) {
                    totalbox = (TextView) v.findViewById(R.id.Orderedtotal);
                    total += Integer.parseInt(totalbox.getText().toString().substring(7, totalbox.getText().length()-4));
                }
            }
            TextView detailBox=(TextView) findViewById(R.id.Orderdetails);
            detailBox.setText("Total: "+String.valueOf(total)+" VND\nName: "+userName+"\nAddress: "+userAddress+"\nPhone: "+userPhone);
        }
    }
}

class OrderListAdapter extends BaseAdapter {
    private List<Product> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public OrderListAdapter(Context aContext,  List<Product> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        if(listData!=null){
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
        if(convertView==null){
            convertView = layoutInflater.inflate(R.layout.item_list_order, null);
            holder = new ViewHolder();
            holder.foodImg = (ImageView) convertView.findViewById(R.id.orderdItemImg);
            holder.foodName = (TextView) convertView.findViewById(R.id.ordered_item_name);
            holder.foodPrice = (TextView) convertView.findViewById(R.id.Orderedtotal);
            holder.foodAmount = (TextView) convertView.findViewById(R.id.Orderedamount);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        Product product= this.listData.get(position);
        holder.foodName.setText(product.getName());
        holder.foodPrice.setText("Price: "+String.valueOf(product.getPrice() * product.getAmount())+" VND");
        holder.foodAmount.setText("Amount: "+String.valueOf(product.getAmount()));
        holder.foodImg.setImageResource(getImageID(product.getID()));
        return convertView;
    }


    private int getImageID(String imgName){
        Resources res = context.getResources();
        int resID = res.getIdentifier(imgName , "drawable", context.getPackageName());
        return resID;
    }
    private class ViewHolder {
        ImageView foodImg;
        TextView foodName;
        TextView foodPrice;
        TextView foodAmount;
    }
}