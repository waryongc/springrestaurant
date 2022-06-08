package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.OrderRequestDto;
import com.sparta.springrestaurant.model.Order;
import com.sparta.springrestaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    // 주문 받기
    public Order serveOrder(OrderRequestDto requestDto){

        int restaurantId=requestDto.getRestaurantId();
        String foods=requestDto.getFoods();

        Order order=new Order(restaurantId,foods);
        orderRepository.save(order);

        return order;
    }
    // 주문 조회
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
}
