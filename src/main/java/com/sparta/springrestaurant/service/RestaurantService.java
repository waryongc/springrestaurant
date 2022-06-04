package com.sparta.springrestaurant.service;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final RestaurantService restaurantService;

    public RestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

}

