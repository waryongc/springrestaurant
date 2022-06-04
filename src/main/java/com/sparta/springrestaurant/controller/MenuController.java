package com.sparta.springrestaurant.controller;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //json으로 데이터를 주고받기
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuSerivce){
        this.menuService=menuSerivce;
    }

    @PostMapping("/restaurant/{restaurantId}/food/register")
    public Menu creatMenu(@RequestBody MenuRequestDto requestDto){

    }
}
