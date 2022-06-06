package com.sparta.springrestaurant.repository;

import com.sparta.springrestaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByname(String restaurantName);
}
