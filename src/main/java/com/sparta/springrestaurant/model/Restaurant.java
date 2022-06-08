package com.sparta.springrestaurant.model;

import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String restaurantName;

    @Column
    private int minOrderprice;

    @Column
    private int deliveryFee;

    // 레스토랑 생성 시 이용
//    public Restaurant(String restaurantName, int minOrderprice, int deliveryFee){
////        this.id=id;
//        this.restaurantName=restaurantName;
//        this.minOrderprice=minOrderprice;
//        this.deliveryFee=deliveryFee;
//    }

    public Restaurant(RestaurantRequestDto requestDto){
        this.restaurantName= requestDto.getRestaurantName();
        this.minOrderprice= requestDto.getMinOrderprice();
        this.deliveryFee= requestDto.getDeliveryFee();
    }


}

// git test
