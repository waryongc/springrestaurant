package com.sparta.springrestaurant.dto;

import lombok.Getter;

import java.time.temporal.ValueRange;

@Getter
public class MenuDto{
    private String menuName;
    private int price;
}