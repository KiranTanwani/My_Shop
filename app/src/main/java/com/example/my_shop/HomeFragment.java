package com.example.my_shop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView catergoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home2, container, false);

        catergoryRecyclerView = view.findViewById(R.id.catergory_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        catergoryRecyclerView.setLayoutManager(layoutManager);

        List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link","Home"));
        categoryModelList.add(new CategoryModel("link","Electronics"));
        categoryModelList.add(new CategoryModel("link","Appliances"));
        categoryModelList.add(new CategoryModel("link","Furniture"));
        categoryModelList.add(new CategoryModel("link","Fashion"));
        categoryModelList.add(new CategoryModel("link","Toys"));
        categoryModelList.add(new CategoryModel("link","Sports"));
        categoryModelList.add(new CategoryModel("link","Wall Arts"));
        categoryModelList.add(new CategoryModel("link","Books"));
        categoryModelList.add(new CategoryModel("link","Shoes"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        catergoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

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
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.account,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.bell,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.mobile,"Redmi 5A","SD 625 Processor","Rs.5999"));
        /////////horizontal Product Layout

        /////////////////////////////////////

        testing = view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(RecyclerView.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Trending",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Hello",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Trending",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals Of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Hello",horizontalProductScrollModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        /////////////////////////////////////

        return view;
    }
}
