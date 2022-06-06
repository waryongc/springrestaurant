package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.dto.RestaurantDto;
import com.sparta.springrestaurant.dto.RestaurantRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.model.Restaurant;
import com.sparta.springrestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // 신규 메뉴 등록
    public Menu registerMenu(MenuRequestDto requestDto){

//        int restaurantId=id;
        String menuName= requestDto.getMenuName();
        int price=requestDto.getPrice();

        Menu menu=new Menu(menuName,price);
        menuRepository.save(menu);

        return menu;
    }

    // 메뉴판 조회
    public List<Menu> getRestaurantMenus(Long id){

        return menuRepository.findAllById(id);
    }

    // 레스토랑의 메뉴 조회
//    public List<Menu> getMenus(Long restaurantId){ return menuRepository.findAllByRestaurantId(restaurantId);}

}
