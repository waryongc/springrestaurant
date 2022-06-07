package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import com.sparta.springrestaurant.model.Restaurant;
import com.sparta.springrestaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    // 음식점 등록
    public Restaurant registerRestaurant(RestaurantRequestDto requestDto){

        String restaurantName= requestDto.getRestaurantName();
        int minOrderprice=requestDto.getMinOrderprice();
        int deliveryFee=requestDto.getDeliveryFee();

        Restaurant restaurant = new Restaurant(restaurantName,minOrderprice,deliveryFee);
        restaurantRepository.save(restaurant);


        return restaurant;
    }

    // 음식점 조회
    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }
}

