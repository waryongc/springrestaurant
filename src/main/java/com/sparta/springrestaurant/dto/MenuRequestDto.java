package com.sparta.springrestaurant.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.time.temporal.ValueRange;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MenuRequestDto {

    private String menuName;

    @Range(min=100,max=1000000, message ="100원부터 1000000원까지 가능합니다.")
    private int price;
}
