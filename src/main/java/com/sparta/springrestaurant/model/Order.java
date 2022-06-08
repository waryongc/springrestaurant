package com.sparta.springrestaurant.model;

import java.util.Arrays;

public class Order {
    private int restaurantId;
    private String foods;

    public Order(int restaurantId, String foods){
        this.restaurantId=restaurantId;
        this.foods=foods;
    }
}
