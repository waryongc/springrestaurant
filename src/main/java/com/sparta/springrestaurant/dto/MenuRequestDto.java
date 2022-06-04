package com.sparta.springrestaurant.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MenuRequestDto {

    private String name;
    private int price;
}
