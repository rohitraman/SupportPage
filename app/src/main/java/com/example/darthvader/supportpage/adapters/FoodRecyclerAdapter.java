package com.example.darthvader.supportpage.adapters;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.darthvader.supportpage.models.Food;
import com.example.darthvader.supportpage.R;

import java.util.List;

public class FoodRecyclerAdapter extends RecyclerView.Adapter<FoodRecyclerAdapter.MyViewHolder> {
    private List<Food> foodList;

    public FoodRecyclerAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView hotelName;
        TextView place;
        TextView price;
        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
            hotelName=itemView.findViewById(R.id.hotelName);
            place=itemView.findViewById(R.id.place);
            price=itemView.findViewById(R.id.price);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_1,viewGroup,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        Food food=foodList.get(i);
        viewHolder.hotelName.setText(food.getHotel());
        viewHolder.place.setText(food.getPlace());
        viewHolder.price.setText("₹"+food.getPrice());


    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
