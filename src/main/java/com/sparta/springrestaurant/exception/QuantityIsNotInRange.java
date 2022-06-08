package com.sparta.springrestaurant.exception;

public class QuantityIsNotInRange extends RuntimeException {
    public static final String msg="수량은 1부터 100까지 가능합니다.";
    public QuantityIsNotInRange(){
        String msg1 = msg;
    }
}
