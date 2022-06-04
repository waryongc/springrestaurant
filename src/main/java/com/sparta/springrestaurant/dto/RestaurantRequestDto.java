package com.sparta.springrestaurant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class RestaurantRequestDto {
    private String name;
    private int minOrderprice;
    private int deliveryFee;
}
