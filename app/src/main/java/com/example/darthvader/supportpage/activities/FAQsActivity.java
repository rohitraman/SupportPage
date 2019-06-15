package com.example.darthvader.supportpage.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import com.example.darthvader.supportpage.R;
import com.example.darthvader.supportpage.adapters.FAQsRecyclerAdapter;
import com.example.darthvader.supportpage.adapters.TermsAndConditionsAdapter;
import com.example.darthvader.supportpage.data.FAQsData;
import com.example.darthvader.supportpage.data.TermsAndConditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FAQsActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    Map<String,List<String>> map=new HashMap<>();
    Toolbar toolbar;
    List<String> expandablelistTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        map=FAQsData.getData();
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Support Page");
        toolbar.setTitleTextColor(Color.BLACK);
        toolbar.setBackgroundColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandablelistTitles=new ArrayList<>(map.keySet());
        expandableListView=findViewById(R.id.privacyList);
        FAQsRecyclerAdapter adapter=new FAQsRecyclerAdapter(expandablelistTitles,map);
        expandableListView.setAdapter(adapter);
    }
}
