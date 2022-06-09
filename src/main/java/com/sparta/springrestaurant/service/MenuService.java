package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // 신규 메뉴 등록
    @Transactional
    public Menu registerMenu(MenuRequestDto requestDto){

//        int restaurantId=id;
        String menuName= requestDto.getMenuName();
        int price=requestDto.getPrice();

        Menu menu=new Menu(menuName,price);

        if(price<100 || price>1000000){
            throw new IllegalArgumentException("가격은 100원에서 1000000원까지만 가능합니다.");
        }
        if((price%100)!=0){
            throw new IllegalArgumentException("가격은 100원 단위로만 입력 가능합니다.");
        }

        menuRepository.save(menu);
        return menu;
    }

    // 메뉴판 조회
    public List<Menu> getRestaurantMenus(Long restaurantid){

        return menuRepository.findAllById(restaurantid);
    }

    // 레스토랑의 메뉴 조회
//    public List<Menu> getMenus(Long restaurantId){ return menuRepository.findAllByRestaurantId(restaurantId);}

}
