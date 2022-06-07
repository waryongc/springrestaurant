package com.sparta.springrestaurant.exception;

public class PriceIsNot100Unit extends RuntimeException {
    public static final String msg="음식 가격의 단위는 100원입니다.";

    public PriceIsNot100Unit(){
        super(msg);
    }
}
