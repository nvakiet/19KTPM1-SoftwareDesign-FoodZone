package com.example.foodzoneclient.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
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

public class CartActivity extends AppCompatActivity {
    ImageView back;
    String rID;
    Button orderButton;
    public static Handler cartScreenHandler = null;
    ArrayList<Product> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        findID();

//        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // back to food menu click
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent myIntent=new Intent(CartActivity.this, FoodMenuActivity.class);
//                myIntent.putExtra("resID",rID);
//                myIntent.putParcelableArrayListExtra("cart_list", foodList);
//                startActivity(myIntent);

                Intent backIntent = getIntent();
                backIntent.putExtra("resID", rID);
                backIntent.putParcelableArrayListExtra("cart_list", foodList);
                finish();
            }
        });
        // foward to Order screen
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderIntent=new Intent(CartActivity.this, OrderActivity.class);
                orderIntent.putExtra("resID",rID);
                orderIntent.putParcelableArrayListExtra("cart_list", foodList);
                startActivity(orderIntent);
            }
        });
        Intent intent = getIntent();
        ArrayList<Product> newList = intent.getParcelableArrayListExtra("food_list");
        rID = intent.getStringExtra("resID");
        if (foodList == null) {
            foodList = newList;
            newList = null;
        }

        if(foodList!=null){
            TextView totalbox;
            final ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new CartListAdapter(this,foodList));
            // Iterate list view to calculate total price
            long total = 0;
            for (int i = 0; i < listView.getCount(); ++i) {
                View v = listView.getAdapter().getView(i, null, null);
                if (v != null) {
                    totalbox = (TextView) v.findViewById(R.id.total);
                    total += Integer.parseInt(totalbox.getText().toString().substring(7, totalbox.getText().length()-4));
                }
            }
            TextView totalpriceBox=(TextView) findViewById(R.id.totalPrice);
            totalpriceBox.setText("Total: "+String.valueOf(total)+" VND");
        }
    }

    private void findID(){
        back=(ImageView) findViewById(R.id.back2main);
        orderButton=(Button) findViewById(R.id.orderButton);
    }
}

class CartListAdapter extends BaseAdapter {
    private List<Product> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CartListAdapter(Context aContext,  List<Product> listData) {
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
            convertView = layoutInflater.inflate(R.layout.item_list_cart, null);
            holder = new ViewHolder();
            holder.foodImg = (ImageView) convertView.findViewById(R.id.itemImg);
            holder.foodName = (TextView) convertView.findViewById(R.id.item_name);
            holder.foodDes = (TextView) convertView.findViewById(R.id.itemDes);
            holder.foodPrice = (TextView) convertView.findViewById(R.id.total);
            holder.foodAmount = (TextView) convertView.findViewById(R.id.amount);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        Product product= this.listData.get(position);
        holder.foodName.setText(product.getName());
        holder.foodDes.setText(product.getDes());
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
        TextView foodDes;
        TextView foodPrice;
        TextView foodAmount;
    }
}