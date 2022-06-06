package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu creatMenu(MenuRequestDto requestDto, Long restaurantId){
        Menu menu=new Menu(requestDto);

        menuRepository.save(menu);

        return menu;
    }

    // 레스토랑의 메뉴 조회
//    public List<Menu> getMenus(Long restaurantId){ return menuRepository.findAllByRestaurantId(restaurantId);}

}
