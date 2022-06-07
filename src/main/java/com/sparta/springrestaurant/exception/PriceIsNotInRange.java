package com.sparta.springrestaurant.exception;

public class PriceIsNotInRange extends RuntimeException {
    public static final String msg="음식의 가격은 100원부터 1000000원까지 입니다.";

    public PriceIsNotInRange(){
        String msg1 = msg;
    }
}
