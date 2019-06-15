package com.example.darthvader.supportpage.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import com.example.darthvader.supportpage.R;
import com.example.darthvader.supportpage.adapters.IssuesListAdapter;
import com.example.darthvader.supportpage.data.IssuesData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpandableListActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    Map<String,List<String>> map=new HashMap<>();
    Toolbar toolbar;
    List<String> expandablelistTitles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list);
        map=IssuesData.getData();
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Support Page");
        toolbar.setTitleTextColor(Color.BLACK);
        toolbar.setBackgroundColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandablelistTitles=new ArrayList<>(map.keySet());
        expandableListView=findViewById(R.id.issueList);
        IssuesListAdapter adapter=new IssuesListAdapter(expandablelistTitles,map);
        expandableListView.setAdapter(adapter);

    }
}
