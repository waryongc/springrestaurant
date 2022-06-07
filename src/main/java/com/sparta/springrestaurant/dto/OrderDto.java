package com.sparta.springrestaurant.dto;

import lombok.Getter;

@Getter
public class OrderDto {
    private int restaurantId;
    private String foods;
    private int id;
    private int quantity;
}
