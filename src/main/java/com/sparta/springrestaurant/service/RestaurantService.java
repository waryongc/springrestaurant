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

    public void registerRestaurant(RestaurantRequestDto requestDto){

        String restaurantName= requestDto.getRestaurantName();
        int minOrderprice=requestDto.getMinOrderprice();
        int deliveryFee=requestDto.getDeliveryFee();

        Restaurant restaurant = new Restaurant(restaurantName,minOrderprice,deliveryFee);
        restaurantRepository.save(restaurant);


    }

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }
}

