package com.sparta.springrestaurant.repository;

import com.sparta.springrestaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Long> {
//    List<Menu> findAllById(Long id);
//    List<Menu> findAllByRestaurantId(Long restaurantId);

}
