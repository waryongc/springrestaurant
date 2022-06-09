package com.sparta.springrestaurant.service;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import com.sparta.springrestaurant.model.Menu;
import com.sparta.springrestaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public List<Menu> registerMenu(List<MenuRequestDto> requestDto,Long restaurantId){

//        int restaurantId=id;
//        String menuName= requestDto.getMenuName();
//        int price=requestDto.getPrice();

//        Menu menu=new Menu(menuName,price,restaurantId);
        List<Menu> menuList=new ArrayList<>();

        for(MenuRequestDto menus :requestDto){
            menuList.add(new Menu(menus.getMenuName(),menus.getPrice(),restaurantId));

            if(menus.getPrice()<100 || menus.getPrice()>1000000){
                throw new IllegalArgumentException("가격은 100원에서 1000000원까지만 가능합니다.");
            }
            if((menus.getPrice()%100)!=0){
                throw new IllegalArgumentException("가격은 100원 단위로만 입력 가능합니다.");
            }
        }
        return menuRepository.saveAll(menuList);
    }

    // 메뉴판 조회
    public List<Menu> getRestaurantMenus(Long restaurantId){

        return menuRepository.findAllByRestaurantId(restaurantId);
    }

    // 레스토랑의 메뉴 조회
//    public List<Menu> getMenus(Long restaurantId){ return menuRepository.findAllByRestaurantId(restaurantId);}

}
