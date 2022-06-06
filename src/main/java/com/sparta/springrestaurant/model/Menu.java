package com.sparta.springrestaurant.model;

import com.sparta.springrestaurant.dto.MenuRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter //get 함수를 일괄적으로 만들어줍니다
@Setter
@NoArgsConstructor //기본 생성자를 만들어줍니다
@Entity
public class Menu {

    // ID 가 자동으로 생성 및 증가
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable=false, unique = true)
    private String menuName;

    @Column(nullable = false)
    private int price;

//    @Column(nullable = false)
//    private Long restaurantId;

    // 메뉴 등록시 사용
    public Menu(MenuRequestDto requestDto){

//        this.restaurantId=restaurandId;
        this.menuName=requestDto.getMenuName();
        this.price=requestDto.getPrice();

    }
}
