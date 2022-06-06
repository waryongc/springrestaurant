package com.sparta.springrestaurant.controller;

import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.model.Restaurant;
import com.sparta.springrestaurant.repository.RestaurantRepository;
import com.sparta.springrestaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService=restaurantService;
    }

    // 신규 음식점 등록
    @PostMapping("/restaurant/register")
    public String registerRestaurant(RestaurantRequestDto requestDto){

        restaurantService.registerRestaurant(requestDto);

        return "redirect:/";
    }

    // 음식점 조회
    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

}

