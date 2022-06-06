package com.sparta.springrestaurant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class RestaurantRequestDto {
    private String restaurantName;
    private int minOrderprice;
    private int deliveryFee;
}
//    public Long getRestaurant() {
//    }

