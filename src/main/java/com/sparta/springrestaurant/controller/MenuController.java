package com.sparta.springrestaurant.controller;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //json으로 데이터를 주고받기
public class MenuController {
    private MenuService menuService;

    @Autowired
public MenuController(MenuService menuSerivce){
        this.menuService=menuSerivce;
    }

    // 신규 메뉴 등록
    @PostMapping("/restaurant/{restaurantId}/food/register")
    public List<Menu> registerMenu(@RequestBody List<MenuRequestDto> requestDto,@PathVariable Long restaurantId){
        List<Menu> menu=menuService.registerMenu(requestDto,restaurantId);
        return menu;
    }

    // 메뉴판 조회
    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Menu> getRestaurantMenus(@PathVariable Long restaurantId){
        return menuService.getRestaurantMenus(restaurantId);
    }

//        // 레스토랑 id
////        Long restaruantId=restantDetails.getRestaurant()
//    }
}