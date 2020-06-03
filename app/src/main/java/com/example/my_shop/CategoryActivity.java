package com.example.my_shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {


    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categoryRecyclerView = findViewById(R.id.category_activity_recyclerview);

        /////////horizontal Product Layout
        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.account,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.bell,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        /////////horizontal Product Layout

        /////////////////////////////////////
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(RecyclerView.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Trending",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Hello",horizontalProductScrollModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.main_search_icon){
            //todo: search
            return true;
        } else if(id==android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
