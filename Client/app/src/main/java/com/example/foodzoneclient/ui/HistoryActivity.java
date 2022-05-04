package com.example.foodzoneclient.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.OrderedProduct;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    ListView history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        history = findViewById(R.id.history);

        // TODO GET HISTORY LIST FROM DATABASE
        List<OrderedProduct> historyList = new ArrayList<>();

        history.setAdapter(new HistoryListViewAdapter(this, historyList));
    }
}

class HistoryListViewAdapter extends BaseAdapter {
    private List<OrderedProduct> history;
    private LayoutInflater       layoutInflater;
    private Context              context;

    private class ViewHolder {
        TextView  name, quantity, date, recipient, state, price;
    }

    public HistoryListViewAdapter(Context aContext, List<OrderedProduct> history) {
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

            holder.name      = convertView.findViewById(R.id.product);
            holder.quantity  = convertView.findViewById(R.id.quantity);
            holder.date      = convertView.findViewById(R.id.date);
            holder.recipient = convertView.findViewById(R.id.recipient);
            holder.state     = convertView.findViewById(R.id.state);
            holder.price     = convertView.findViewById(R.id.price);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        OrderedProduct op = this.history.get(position);

        holder.name.setText(op.getName());
        holder.quantity.setText(op.getAmount());
        holder.date.setText(op.getDate());
        holder.recipient.setText(op.getRecipientName());
        holder.state.setText(op.getState());
        holder.price.setText(op.getPrice());

        return convertView;
    }

    private int getImageID(String imgName) {
        Resources res   = context.getResources();
        int       resID = res.getIdentifier(imgName, "drawable", context.getPackageName());
        return resID;
    }
}