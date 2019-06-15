package com.example.darthvader.supportpage.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.darthvader.supportpage.R;
import com.example.darthvader.supportpage.activities.ExpandableListActivity;
import com.example.darthvader.supportpage.activities.FAQsActivity;
import com.example.darthvader.supportpage.activities.PrivacyPolicyActivity;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>  {
    List<String> helpList;
    Context context;

    public RecyclerAdapter(Context context,List<String> helpList) {
        this.context=context;
        this.helpList = helpList;
    }


    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tvHelp;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHelp=itemView.findViewById(R.id.hotelName);
        }

    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder viewHolder, final int i) {
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    Intent intent=new Intent(context,ExpandableListActivity.class);
                    context.startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(context,PrivacyPolicyActivity.class);
                    context.startActivity(intent);
                }
                else if(i==2){
                    Intent intent=new Intent(context,FAQsActivity.class);
                    context.startActivity(intent);
                }
            }
        });
        viewHolder.tvHelp.setText(helpList.get(i));
    }

    @Override
    public int getItemCount() {
        return helpList.size();
    }

}
