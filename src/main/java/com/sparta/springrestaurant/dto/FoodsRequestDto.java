package com.sparta.springrestaurant.dto;

import com.sparta.springrestaurant.exception.QuantityIsNotInRange;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FoodsRequestDto {

    private String id;

    @Range(min=1, max=100, message="수량은 1부터 100까지 가능합니다.")
    private int quantity;

    public void checkQuantityInRange(){
        int quantity=this.quantity;
        if(quantity<0 || quantity>100){
            throw new QuantityIsNotInRange();
        }
    }



}
