package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import com.sparta.springrestaurant.model.Restaurant;
import com.sparta.springrestaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    // 음식점 등록
    @Transactional
    public Restaurant registerRestaurant(RestaurantRequestDto requestDto) {

//        String restaurantName= requestDto.getRestaurantName();
        int minOrderprice=requestDto.getMinOrderprice();
        int deliveryFee=requestDto.getDeliveryFee();

        Restaurant restaurant = new Restaurant(requestDto);

        if (minOrderprice < 1000 || minOrderprice > 100000) {
            throw new IllegalArgumentException("주문 금액은 1000원에서 100000원까지 가능합니다");
        }
        if ((minOrderprice % 100) != 0) {
            throw new IllegalArgumentException("최소 주문 금액은 100원단위로만 가능합니다.");
        }
        if (deliveryFee < 0 || deliveryFee > 10000) {
            throw new IllegalArgumentException("기본 배달비는 0원에서 10000원까지만 가능합니다.");
        }
        if ((deliveryFee % 500) != 0) {
            throw new IllegalArgumentException("기본 배달비는 500원단위로만 가능합니다.");
        }

            restaurantRepository.save(restaurant);

            return restaurant;
    }
    // 음식점 조회
    public List<Restaurant> getAllRestaurants () {
        return restaurantRepository.findAll();
    }
}

