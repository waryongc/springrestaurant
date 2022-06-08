package com.sparta.springrestaurant.controller;

import com.sparta.springrestaurant.dto.OrderRequestDto;
import com.sparta.springrestaurant.model.Order;
import com.sparta.springrestaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    // 주문 요청

    @PostMapping("/order/request")
    public Order getOrder(@RequestBody OrderRequestDto requestDto){
        Order order = orderService.serveOrder(requestDto);

        return order;
    }



}
