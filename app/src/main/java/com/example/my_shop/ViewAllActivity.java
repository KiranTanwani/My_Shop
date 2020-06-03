package com.example.my_shop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewAllActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Deals of the Day");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler_view);
        gridView = findViewById(R.id.grid_view);

        int layout_code = getIntent().getIntExtra("layout_code",-1);

        if(layout_code == 0) {
            recyclerView.setVisibility(View.VISIBLE);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);

            List<WishlistModel> wishlistModelList = new ArrayList<>();
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));
            wishlistModelList.add(new WishlistModel(R.mipmap.mobile, "Pixel 2", "Rs.49999/-", "Rs.59999/-", "Cash On Delivery Available."));


            WishlistAdapter adapter = new WishlistAdapter(wishlistModelList, false);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

        } else if (layout_code == 1) {

            gridView.setVisibility(View.VISIBLE);
            List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.account, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.bell, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
            GridProductLayoutAdapter gridProductLayoutAdapter = new GridProductLayoutAdapter(horizontalProductScrollModelList);
            gridView.setAdapter(gridProductLayoutAdapter);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
