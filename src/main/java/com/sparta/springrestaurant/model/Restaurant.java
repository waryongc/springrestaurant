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
    private String name;

    @Column()
    private int minOrderprice;

    @Column
    private int deliveryFee;

    public Restaurant(RestaurantRequestDto requestDto, Long id){
        this.id=id;
        this.name=requestDto.getName();
        this.minOrderprice=requestDto.getMinOrderprice();
        this.deliveryFee=requestDto.getDeliveryFee();
    }
}

// git test
