package com.example.darthvader.supportpage.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.darthvader.supportpage.R;

import java.util.List;
import java.util.Map;

public class FAQsRecyclerAdapter extends BaseExpandableListAdapter {
    List<String> list;
    Map<String,List<String>> map;

    public FAQsRecyclerAdapter(List<String> list, Map<String, List<String>> map) {
        this.list = list;
        this.map = map;
    }

    @Override
    public int getGroupCount() {
        return list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return map.get(list.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return map.get(list.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title=(String)getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            convertView=inflater.inflate(R.layout.terms_list_group,parent,false);
        }
        TextView textView=convertView.findViewById(R.id.listTitle);
        textView.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title=(String)getChild(groupPosition,childPosition);
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            convertView=inflater.inflate(R.layout.terms_list_group,parent,false);
        }
        TextView textView=convertView.findViewById(R.id.listTitle);
        textView.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
