package com.example.foodzoneclient.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.Product;

import org.w3c.dom.Text;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
}

class HistoryListViewAdapter extends BaseAdapter {
    private List<Product> history;
    private LayoutInflater layoutInflater;
    private Context context;

    private class ViewHolder {
        ImageView orderImage;
        TextView orderDate;
        TextView orderDetail;
        TextView orderTotal;
    }

    public HistoryListViewAdapter(Context aContext,  List<Product> history) {
        this.context = aContext;
        this.history = history;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        if(history != null){
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
        if(convertView==null){
            convertView = layoutInflater.inflate(R.layout.item_history, null);
            holder = new ViewHolder();

            holder.orderDate = (TextView) convertView.findViewById(R.id.tv_order_date);
            holder.orderDetail = (TextView) convertView.findViewById(R.id.tv_order_detail);
            holder.orderTotal = (TextView) convertView.findViewById(R.id.tv_total_price);

            holder.orderImage = (ImageView) convertView.findViewById(R.id.iv_order_image);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product product= this.history.get(position);

        // TODO set image for item
        //holder.orderDate.setText...

        return convertView;
    }
    
    private int getImageID(String imgName){
        Resources res = context.getResources();
        int resID = res.getIdentifier(imgName , "drawable", context.getPackageName());
        return resID;
    }
}