package com.example.foodzoneclient.ui;

import static com.example.foodzoneclient.FoodZone.getContext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodzoneclient.FoodZone;
import com.example.foodzoneclient.R;
import com.example.foodzoneclient.backend.ContainerClient;
import com.example.foodzoneclient.model.Restaurant;
import com.example.foodzoneclient.protocols.LoginRequest;
import com.example.foodzoneclient.protocols.RestaurantListRequest;
import com.example.foodzoneclient.protocols.RestaurantListResponse;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainScreenActivity extends AppCompatActivity {
    private DrawerLayout mainpage_layout;
    private NavigationView navigationView;
    private BottomNavigationView bottomNavigation;
    private RecyclerView restaurantList;
    //private ImageView imageView1,imageView2,imageView3,imageView4;
    Toolbar toolbar;

    public static Handler restaurantListHandler;
    public static Handler restaurantHandler;
    public static ArrayList<Restaurant> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbarAction();
        mainpage_layout=findViewById(R.id.mainpage_layout);


        // set clickable for navigation
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            /**
             *
             * @param item
             * declare id as the id item in the menu
             * when we click an item, the id will get item's id through item.getItemId()
             * then we will add the activity for an item.
             * @return
             */
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();       // vd bam home --> get id nut home
                if(id == R.id.n_profile){
                    Intent profileIntent=new Intent(MainScreenActivity.this,ProfileActivity.class);
                    startActivity(profileIntent);
                }
                if(id==R.id.n_home){
                    Intent homeIntent= new Intent(MainScreenActivity.this, MainScreenActivity.class);
                    startActivity(homeIntent);
                }
                if(id==R.id.n_search){
                    Intent searchIntent= new Intent(MainScreenActivity.this, SearchActivity.class);
                    startActivity(searchIntent);
                }
                return true;
            }
        });

        // find and set click for bottom navigation view
        bottomNavigation=findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.action_history){
                    Intent historyIntent=new Intent(MainScreenActivity.this, HistoryActivity.class);
                    startActivity(historyIntent);
                }
                if(id==R.id.action_cart){
                    Intent cartIntent=new Intent(MainScreenActivity.this, CartActivity.class);
                    startActivity(cartIntent);
                }
                if(id==R.id.action_orders){
                    Intent orderIntent=new Intent(MainScreenActivity.this, OrderActivity.class);
                    startActivity(orderIntent);
                }
                return true;
            }
        });

        ArrayList<Restaurant> restaurants = new ArrayList();
        Restaurant test1 = new Restaurant("0001", R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test2 = new Restaurant("0002", R.drawable.tcf2, "Phúc Long Topaz", "195 Hoàng Diệu");
        Restaurant test3 = new Restaurant("0003", R.drawable.tcf3, "KFC Nguyễn Chí Thanh", "339 Nguyễn Chí Thanh");
        Restaurant test4 = new Restaurant("0004", R.drawable.tcf4, "Lotteria NowZone", "272 Nguyễn Văn Cừ");
        Restaurant test5 = new Restaurant("0005", R.drawable.tcf1, "PizzaHut Nguyễn Trãi", "144 Nguyễn Trãi");
        Restaurant test6 = new Restaurant("0006", R.drawable.tcf2, "The Coffee House Cao Thắng", "275 Cao Thắng");
        restaurants.add(test1);
        restaurants.add(test2);
        restaurants.add(test3);
        restaurants.add(test4);
        restaurants.add(test5);
        restaurants.add(test6);

        // recycler view
        restaurantList = findViewById(R.id.rv_restaurant);
        RestaurantsAdapter recyclerViewAdapter = new RestaurantsAdapter(list);
        restaurantList.setAdapter(recyclerViewAdapter);

        restaurantList.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        restaurantList.addItemDecoration(itemDecoration);

        recyclerViewAdapter.setItemCallback(new RestaurantsAdapter.OnItemClickCallback() {
            @Override
            public void invoke(View v, Restaurant res) {
                Intent intent = new Intent(MainScreenActivity.this, FoodMenuActivity.class);
                intent.putExtra("resID", res.getID());
                startActivity(intent);
            }
        });

        // get Restaurant List
        try {
            RestaurantListRequest request = RestaurantListRequest.newBuilder()
                    .build();
            ContainerClient.getInstance().sendRestaurantListRequest(request);
        } catch (Exception e) {
            Log.e(ContainerClient.LOG_TAG, "Can't send restaurant list request to server", e);
            Toast announce = Toast.makeText(getContext(), "Can't send restaurant list request to server", Toast.LENGTH_SHORT);
            announce.show();
        }

        restaurantListHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    String result = (String) msg.obj;
                    //FoodZone.showToast(restaurantListHandler, result);
                    if (result.equals("Success")) {
                        recyclerViewAdapter.notifyDataSetChanged();
                    }
                }
                else if (msg.what == -100 || msg.what == -200) {
                    FoodZone.showToast(restaurantListHandler, (String) msg.obj);
                }
            }
        };
    }

    private void toolbarAction() {
        setSupportActionBar(toolbar);   // cung cap chuc nang cho toolbar

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true); // hien cai nut display
        toolbar.setNavigationIcon(R.drawable.ic_toolbar_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainpage_layout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_search:
                Intent searchIntent=new Intent(MainScreenActivity.this,SearchActivity.class);
                startActivity(searchIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}

class RestaurantsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Restaurant> restaurants;
    OnItemClickCallback callback;

    public class ResViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView name;

        public ResViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imv_restaurant_avatar);
            name = itemView.findViewById(R.id.tv_restaurant_name);
        }
    }

    interface OnItemClickCallback {
        void invoke(View v, Restaurant res);
    }

    public RestaurantsAdapter(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public ResViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant,parent,false);
        return new ResViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @SuppressLint("RecyclerView") int position) {
        ResViewHolder holder = (ResViewHolder) viewHolder;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.invoke(v, restaurants.get(position));
            }
        });

        Restaurant res = restaurants.get(position);
        if(res == null){
            return;
        }

        holder.img.setImageResource(res.getImage());
        holder.name.setText(res.getName());
    }

    @Override
    public int getItemCount() {
        if(restaurants != null){
            return restaurants.size();
        }
        return 0;
    }

    public void setItemCallback(OnItemClickCallback callback) {
        this.callback = callback;
    }
}