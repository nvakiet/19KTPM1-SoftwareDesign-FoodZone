package com.example.foodzoneclient.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchActivity extends AppCompatActivity {
    private RecyclerView recRes;
    private RestaurantAdapter resAdapter;
    ImageView backImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        backImage=(ImageView) findViewById(R.id.backbt);
        recRes = findViewById(R.id.recycleView_res);
        LinearLayoutManager llm= new LinearLayoutManager(this);
        recRes.setLayoutManager(llm);
        resAdapter = new RestaurantAdapter(getListRes());
        recRes.setAdapter(resAdapter);
        RecyclerView.ItemDecoration itemDecoration= new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recRes.addItemDecoration(itemDecoration);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent newIntent= new Intent(SearchActivity.this, MainScreenActivity.class);
//                startActivity(newIntent);
                finish();
            }
        });
    }

    private List<Restaurant> getListRes() {
        List<Restaurant> list= new ArrayList<>();
        list.add(new Restaurant("","nhà hàng 1","192 Hai Bà Trưng, Quận 1, TP.HCM"));
        list.add(new Restaurant("","nhà hàng 2","65 Nam Kì Khởi Nghĩa, Quận 3, TP.HCM"));
        list.add(new Restaurant("","nhà hàng 3","274 Phố Hàng Buồm, Hà Nội"));
        list.add(new Restaurant("","nhà hàng 4","284 Hai Bà Trưng, Hà Nội"));
        return list;
    }
}

class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ResViewHolder>{
    private List<Restaurant> listRestaurant;

    public RestaurantAdapter(List<Restaurant> listRestaurant) {
        this.listRestaurant = listRestaurant;
    }

    @NonNull
    @Override
    public ResViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_restaurant,parent,false);
        return new ResViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResViewHolder holder, int position) {
        Restaurant res=listRestaurant.get(position);
        if(res==null){
            return;
        }
        //holder.imgRes.setImageResource(res.getImage());
        holder.tv_resName.setText(res.getName());
        holder.tv_resAdd.setText(res.getAddress());
    }

    @Override
    public int getItemCount() {
        if(listRestaurant!=null){
            return listRestaurant.size();
        }
        return 0;
    }

    public class ResViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView imgRes;
        private TextView tv_resName;
        private TextView tv_resAdd;
        public ResViewHolder(@NonNull View itemView) {
            super(itemView);
            imgRes=itemView.findViewById(R.id.imv_restaurant_avatar);
            tv_resName=itemView.findViewById(R.id.tv_res1Name);
            tv_resAdd=itemView.findViewById(R.id.tv_res1Address);
        }
    }
}