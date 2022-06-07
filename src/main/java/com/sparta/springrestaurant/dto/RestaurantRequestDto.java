package com.sparta.springrestaurant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@NoArgsConstructor
@Getter
public class RestaurantRequestDto {

    @NotBlank
    private String restaurantName;

    @Range(min=1000,max=100000, message ="주문 최소금액은 1000원입니다.")
    private int minOrderprice;

    @Range(min=0,max=10000, message ="배달요금은 10000원까지 가능합니다.")
    private int deliveryFee;

    public void checkMinOrderprice100unit(){
        int minOrderprice=this.minOrderprice;

//        if((minOrderprice%100)!=0){
//            throw new Min
//        }
    }

//    public RestaurantRequestDto(String restaurantName, int minOrderprice, int deliveryFee){
//        this.restaurantName=restaurantName;
//        this.minOrderprice=minOrderprice;
//        this.deliveryFee=deliveryFee;
//
//    }
}

