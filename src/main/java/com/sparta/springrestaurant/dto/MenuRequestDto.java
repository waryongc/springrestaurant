package com.sparta.springrestaurant.dto;


import com.sparta.springrestaurant.exception.PriceIsNot100Unit;
import com.sparta.springrestaurant.exception.PriceIsNotInRange;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import java.time.temporal.ValueRange;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MenuRequestDto {

    @NotBlank
    private String menuName;

    @Range(min=100,max=1000000, message ="100원부터 1000000원까지 가능합니다.")
    private int price;

    public void checkPriceIsInRange(){
        int price=this.price;
        if(price<100 || price>1000000){
            throw new PriceIsNotInRange();
        }
    }

    public void checkPriceIs100Unit(){
        int price=this.price;
        if((price%100)!=0){
            throw new PriceIsNot100Unit();
        }
    }
}
