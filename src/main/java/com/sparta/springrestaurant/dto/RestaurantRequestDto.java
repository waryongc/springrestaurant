package com.sparta.springrestaurant.dto;

import com.sparta.springrestaurant.exception.DeliveryFeeIsNot500UnitException;
import com.sparta.springrestaurant.exception.DeliveryFeeIsNotInRangeException;
import com.sparta.springrestaurant.exception.MinOrderpriceIsNot100UnitException;
import com.sparta.springrestaurant.exception.MinOrderpriceIsNotInRangeException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RestaurantRequestDto {

//    @NotBlank
    private String restaurantName;

//    @Range(min=1000,max=100000, message ="주문 최소금액은 1000원입니다.")
    private int minOrderprice;

//    @Range(min=0,max=10000, message ="배달요금은 10000원까지 가능합니다.")
    private int deliveryFee;

//    public void checkMinOrderpriceIs100unit(){
//        int minOrderprice=this.minOrderprice;
//
//        if((minOrderprice%100)!=0){
//            throw new MinOrderpriceIsNot100UnitException();
//        }
//    }
//
//    public void checkMinOrderpriceIsInRange(){
//        int minOrderprice=this.minOrderprice;
//        if (minOrderprice<1000 || minOrderprice>100000){
//            throw new MinOrderpriceIsNotInRangeException();
//        }
//    }
//
//    public void checkDeliveryFeeIs500Unit(){
//        int deliveryFee=this.deliveryFee;
//        if((deliveryFee%500)!=0){
//            throw new DeliveryFeeIsNot500UnitException();
//        }
//    }
//
//    public void checkDeliveryFeeIsInRange(){
//        int deliveryFee=this.deliveryFee;
//        if(deliveryFee<0 || deliveryFee>10000){
//            throw new DeliveryFeeIsNotInRangeException();
//        }
//    }

//    public RestaurantRequestDto(String restaurantName, int minOrderprice, int deliveryFee){
//        this.restaurantName=restaurantName;
//        this.minOrderprice=minOrderprice;
//        this.deliveryFee=deliveryFee;
//
//    }
}

