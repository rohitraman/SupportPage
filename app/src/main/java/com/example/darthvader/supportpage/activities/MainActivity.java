package com.example.darthvader.supportpage.activities;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;

import com.example.darthvader.supportpage.R;
import com.example.darthvader.supportpage.adapters.FoodRecyclerAdapter;
import com.example.darthvader.supportpage.adapters.RecyclerAdapter;
import com.example.darthvader.supportpage.models.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView,foodRecyclerView;
    List<String> helpList=new ArrayList<>();
    List<Food> foodList=new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helpList.add("General Issues");
        helpList.add("Legal,Terms & Conditions");
        helpList.add("FAQs");
        helpList.add("Contact");
        helpList.add("Chat With Us");

        recyclerView=findViewById(R.id.recycler_view);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Support Page");
        toolbar.setTitleTextColor(Color.BLACK);
        toolbar.setBackgroundColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        RecyclerAdapter adapter=new RecyclerAdapter(this,helpList);
        recyclerView.setAdapter(adapter);

        foodRecyclerView=findViewById(R.id.foodRecyclerView);
        foodRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Food food1=new Food("Hotel 1","Calicut",85.7);
        foodList.add(food1);
        Food food2=new Food("Hotel 2","Calicut",85.7);
        foodList.add(food2);

        FoodRecyclerAdapter adapter1=new FoodRecyclerAdapter(foodList);
        foodRecyclerView.setAdapter(adapter1);
    }
}
