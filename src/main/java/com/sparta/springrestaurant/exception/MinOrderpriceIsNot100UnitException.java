package com.sparta.springrestaurant.exception;

public class MinOrderpriceIsNot100UnitException extends RuntimeException {
    private static final String msg="최소 주문 금액의 단위는 100원 입니다.";

    public MinOrderpriceIsNot100UnitException(){
        String message1 = msg;
        // or
        // super(msg);
    }
}
