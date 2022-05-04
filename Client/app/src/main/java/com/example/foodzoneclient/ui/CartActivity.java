package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cloudinary.android.MediaManager;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Cart;
import com.example.foodzoneclient.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    ImageView back;
    String rID;
    Button orderButton;
    public static Handler cartScreenHandler = null;
    //ArrayList<Product> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        findID();

        // back to food menu click
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = getIntent();
                //backIntent.putExtra("resID", rID);
                //backIntent.putParcelableArrayListExtra("cart_list", foodList);
                setResult(Activity.RESULT_OK, backIntent);
                finish();
            }
        });

        // foward to Order screen
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderIntent=new Intent(CartActivity.this, OrderActivity.class);
                orderIntent.putExtra("resID", rID);
                orderIntent.putParcelableArrayListExtra("cart_list", Cart.getProductList());
                startActivity(orderIntent);
            }
        });



        Intent intent = getIntent();
        rID = intent.getStringExtra("resID");
        Cart.getCartInstance();

        if (Cart.getCartInstance() != null) {
            TextView totalbox;
            final ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new CartListAdapter(this, Cart.getProductList()));

            // Iterate list view to calculate total price
            long total = 0;
            for (int i = 0; i < listView.getCount(); ++i) {
                View v = listView.getAdapter().getView(i, null, null);
                if (v != null) {
                    totalbox = (TextView) v.findViewById(R.id.cart_price);
                    total += Integer.parseInt(totalbox.getText().toString().substring(7, totalbox.getText().length()-4));
                }
            }
            TextView totalpriceBox=(TextView) findViewById(R.id.totalPrice);
            totalpriceBox.setText("Total: "+String.valueOf(total)+" VND");
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back.performClick();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = cartScreenHandler;
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

    private class ViewHolder {
        ImageView foodImg;
        TextView foodName;
        TextView foodDes;
        TextView foodPrice;
        TextView foodAmount;
        Button remove;
    }

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
            holder.foodImg = (ImageView) convertView.findViewById(R.id.cart_itemImg);
            holder.foodName = (TextView) convertView.findViewById(R.id.cart_item_name);
            holder.foodDes = (TextView) convertView.findViewById(R.id.cart_itemDes);
            holder.foodPrice = (TextView) convertView.findViewById(R.id.cart_price);
            holder.foodAmount = (TextView) convertView.findViewById(R.id.cart_amount);
            holder.remove = convertView.findViewById(R.id.bt_addToCart);
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
        // Set image for item
        downloadMealImage(product.getImage(), holder.foodImg);

        holder.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listData.remove(position);
                for (int i = 0; i < listData.size(); i++) {
                    Log.i("CartRemove", listData.get(i).getID());
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

    private int getImageID(String imgName){
        Resources res = context.getResources();
        int resID = res.getIdentifier(imgName , "drawable", context.getPackageName());
        return resID;
    }
}