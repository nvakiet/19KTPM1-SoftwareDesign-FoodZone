package com.example.foodzoneclient.ui;

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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.foodzoneclient.R;
import com.example.foodzoneclient.model.Restaurant;
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
        Restaurant test1 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test2 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test3 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test4 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test5 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        Restaurant test6 = new Restaurant(R.drawable.tcf1, "Highlands Cao Lỗ", "34 Cao Lỗ");
        restaurants.add(test1);
        restaurants.add(test2);
        restaurants.add(test3);
        restaurants.add(test4);
        restaurants.add(test5);
        restaurants.add(test6);

        // recycler view
        restaurantList = findViewById(R.id.rv_restaurant);
        RestaurantsAdapter recyclerViewAdapter = new RestaurantsAdapter(restaurants);
        restaurantList.setAdapter(recyclerViewAdapter);

        restaurantList.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        restaurantList.addItemDecoration(itemDecoration);

//        // ???
//        imageView1=(ImageView) findViewById(R.id.res1);
//        imageView2=(ImageView) findViewById(R.id.res2);
//        imageView3=(ImageView) findViewById(R.id.res3);
//        imageView4=(ImageView) findViewById(R.id.res4);
//        imageView1.setOnClickListener(this);
//        imageView2.setOnClickListener(this);
//        imageView3.setOnClickListener(this);
//        imageView4.setOnClickListener(this);
//        imageView1.setOnClickListener( v -> {
//        });

    }

//    @Override
//    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.res1:
//                Intent res1Intent= new Intent(MainScreenActivity.this,FoodMenuActivity.class);
//                res1Intent.putExtra("resID", "0001");
//                startActivity(res1Intent);
//                break;
//            case R.id.res2:
//                Intent res2Intent= new Intent(MainScreenActivity.this,FoodMenuActivity.class);
//                res2Intent.putExtra("resID","0002");
//                startActivity(res2Intent);
//                break;
//            case R.id.res3:
//                Intent res3Intent= new Intent(MainScreenActivity.this,FoodMenuActivity.class);
//                res3Intent.putExtra("resID","0003");
//                startActivity(res3Intent);
//                break;
//            case R.id.res4:
//                Intent res4Intent= new Intent(MainScreenActivity.this,FoodMenuActivity.class);
//                res4Intent.putExtra("resID","0004");
//                startActivity(res4Intent);
//                break;
//        }
//    }

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
                callback.invoke(restaurants.get(position));
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
        void invoke(Restaurant restaurant);
    }
}