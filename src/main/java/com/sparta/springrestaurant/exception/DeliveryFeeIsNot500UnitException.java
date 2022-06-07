package com.sparta.springrestaurant.exception;

public class DeliveryFeeIsNot500UnitException extends RuntimeException{
    public static final String msg="배달 요금의 단위는 500원입니다";

    public DeliveryFeeIsNot500UnitException(){
        super(msg);
    }
}
