package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cloudinary.android.MediaManager;
import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Cart;
import com.example.foodzoneclient.model.Product;
import com.example.foodzoneclient.protocols.SubmitOrderRequest;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    ImageView backbtt, editRecipient;
    String            rID;
    SharedPreferences prefRecipient, prefUser;
    Button confirmPurchase;
    String recipientName, recipientAddress, recipientPhone;
    TextView detailBox;
    long     total;
    public static Handler orderActivityHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        findID();

        // GET RECIPIENT INFO
        prefRecipient = FoodZone.getContext().getSharedPreferences("RecipientInfo", MODE_PRIVATE);
        prefUser      = FoodZone.getContext().getSharedPreferences("UserInfo", MODE_PRIVATE);

        recipientName    = prefRecipient.getString("Fullname", "");
        recipientAddress = prefRecipient.getString("Address", "");
        recipientPhone   = prefRecipient.getString("Phone", "");

        // IF RECIPIENT HAS NOT BEEN SET, SET AS USER INFO INSTEAD
        if (recipientName.isEmpty() || recipientAddress.isEmpty() || recipientPhone.isEmpty()) {

            recipientName    = prefUser.getString("Fullname", "");
            recipientAddress = prefUser.getString("Address", "");
            recipientPhone   = prefUser.getString("Phone", "");
        }

        backbtt.setOnClickListener(v -> onBackPressed());

        confirmPurchase.setOnClickListener(v -> {

            SubmitOrderRequest.Builder request = SubmitOrderRequest.newBuilder()
                    .setUsername(prefUser.getString("Username", null))
                    .setDatetime(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss z")))
                    .setRecipientFullName(recipientName)
                    .setRecipientAddress(recipientAddress)
                    .setRecipientPhone(recipientPhone)
                    .setRecipientEmail(prefRecipient.getString("Email", ""))
                    .setRecipientID(prefRecipient.getString("ID", ""));

            for (Product p : Cart.getProductList())
                request.addMealID(p.getID()).addMealQuantity(p.getAmount());

            ContainerClient.getInstance().sendSubmitOrderRequest(request.build());
        });

        editRecipient.setOnClickListener(view -> startActivity(new Intent(OrderActivity.this, ChangeRecipientActivity.class)));

        // Setup the handler for receiving order result
        orderActivityHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    if (msg.obj.equals("Success")) {
                        Cart.clear();

                        startActivity(new Intent(OrderActivity.this, SuccessScreenActivity.class));
                        finish();
                    } else {
                        Toast toast = Toast.makeText(FoodZone.getContext(), (String) msg.obj, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }
        };

        retrieveCartList();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ContainerClient.getInstance().currentUIHandler = orderActivityHandler;
    }

    private void findID() {
        backbtt         = findViewById(R.id.back2cart);
        confirmPurchase = findViewById(R.id.confirm);
        editRecipient   = findViewById(R.id.btn_editRecipient);
    }

    private void retrieveCartList() {
        ArrayList<Product> foodList = Cart.getProductList();

        if (foodList != null) {
            TextView       totalbox;
            final ListView listView = findViewById(R.id.orderListView);
            listView.setAdapter(new OrderListAdapter(this, foodList));
            // Iterate list view to calculate total price
            total = 0;
            for (int i = 0; i < listView.getCount(); ++i) {
                View v = listView.getAdapter().getView(i, null, null);
                if (v != null) {
                    totalbox = v.findViewById(R.id.Orderedtotal);
                    total += Integer.parseInt(totalbox.getText().toString().substring(7, totalbox.getText().length() - 4));
                }
            }
            detailBox = findViewById(R.id.Orderdetails);
            detailBox.setText("Please confirm your information:\nTotal: " + String.valueOf(total) + " VND\nName: " + recipientName + "\nAddress: " + recipientAddress + "\nPhone: " + recipientPhone);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        prefRecipient = FoodZone.getContext().getSharedPreferences("RecipientInfo", MODE_PRIVATE);

        recipientName    = prefRecipient.getString("Fullname", "");
        recipientAddress = prefRecipient.getString("Address", "");
        recipientPhone   = prefRecipient.getString("Phone", "");

        detailBox.setText("Please confirm your information:\nTotal: " + String.valueOf(total) + " VND\nName: " + recipientName + "\nAddress: " + recipientAddress + "\nPhone: " + recipientPhone);
    }
}

class OrderListAdapter extends BaseAdapter {
    private List<Product>  listData;
    private LayoutInflater layoutInflater;
    private Context        context;

    public OrderListAdapter(Context aContext, List<Product> listData) {
        this.context   = aContext;
        this.listData  = listData;
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
            convertView       = layoutInflater.inflate(R.layout.item_list_order, null);
            holder            = new ViewHolder();
            holder.foodImg    = (ImageView) convertView.findViewById(R.id.orderdItemImg);
            holder.foodName   = (TextView) convertView.findViewById(R.id.ordered_item_name);
            holder.foodPrice  = (TextView) convertView.findViewById(R.id.Orderedtotal);
            holder.foodAmount = (TextView) convertView.findViewById(R.id.Orderedamount);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Product product = this.listData.get(position);
        holder.foodName.setText(product.getName());
        holder.foodPrice.setText("Price: " + String.valueOf(product.getPrice() * product.getAmount()) + " VND");
        holder.foodAmount.setText("Amount: " + String.valueOf(product.getAmount()));

        // Set image for item
        downloadMealImage(product.getImage(), holder.foodImg);
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

    // legacy code
    private int getImageID(String imgName) {
        Resources res   = context.getResources();
        int       resID = res.getIdentifier(imgName, "drawable", context.getPackageName());
        return resID;
    }

    private class ViewHolder {
        ImageView foodImg;
        TextView  foodName;
        TextView  foodPrice;
        TextView  foodAmount;
    }
}