package com.sparta.springrestaurant.repository;

import com.sparta.springrestaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Menu, Long> {
    Optional<Menu> findByname(String name);
}
