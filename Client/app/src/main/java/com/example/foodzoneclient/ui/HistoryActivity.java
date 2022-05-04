package com.example.foodzoneclient.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Order;
import com.example.foodzoneclient.protocols.HistoryListRequest;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    ListView history;
    public static Handler          historyListHandler;
    public static ArrayList<Order> historyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        history = findViewById(R.id.history);

        HistoryListRequest request = HistoryListRequest.newBuilder().setUsername(FoodZone.getContext().getSharedPreferences("UserInfo", MODE_PRIVATE).getString("Username", "")).build();
        ContainerClient.getInstance().sendHistoryListRequest(request);

        HistoryListViewAdapter historyListViewAdapter = new HistoryListViewAdapter(HistoryActivity.this, historyList);
        history.setAdapter(historyListViewAdapter);

        historyListHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    //FoodZone.showToast(restaurantListHandler, result);
                    if (result.equals("Success")) {
                        historyListViewAdapter.notifyDataSetChanged();
                    }
                } else if (msg.what == -100 || msg.what == -200) {
                    FoodZone.showToast(historyListHandler, (String) msg.obj);
                }
            }
        };
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        historyList.clear();
    }
}

class HistoryListViewAdapter extends BaseAdapter {
    private List<Order>    history;
    private LayoutInflater layoutInflater;
    private Context        context;

    private class ViewHolder {
        TextView restaurant, date, recipient, state, price, desc;
    }

    public HistoryListViewAdapter(Context aContext, List<Order> history) {
        this.context   = aContext;
        this.history   = history;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        if (history != null) {
            return history.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return history.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_history, null);
            holder      = new ViewHolder();

            holder.restaurant = convertView.findViewById(R.id.restaurant);
            holder.date       = convertView.findViewById(R.id.date);
            holder.desc       = convertView.findViewById(R.id.desc);
            holder.recipient  = convertView.findViewById(R.id.recipient);
            holder.state      = convertView.findViewById(R.id.state);
            holder.price      = convertView.findViewById(R.id.price);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Order op = this.history.get(position);

        holder.restaurant.setText(op.getRestaurant());
        holder.date.setText(op.getDate());
        holder.desc.setText(op.getDesc().replace("---", "\n"));
        holder.recipient.setText("Recipient: " + op.getRecipientName());
        holder.state.setText("Status: " + op.getState());
        holder.price.setText("Total: " + op.getPrice());

        return convertView;
    }
}