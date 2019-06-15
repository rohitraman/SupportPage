package com.example.darthvader.supportpage.models;

public class Food {
    public Food(String hotel, String place, double price) {
        this.hotel = hotel;
        this.place = place;
        this.price = price;
    }

    String hotel;
    String place;

    public String getHotel() {
        return hotel;
    }


    public String getPlace() {
        return place;
    }


    public double getPrice() {
        return price;
    }

    double price;
}
