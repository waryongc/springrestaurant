package com.sparta.springrestaurant.exception;

public class MinOrderpriceIsNotInRangeException extends RuntimeException {
    public static final String msg="최수 주문 금액은 1000원부터 100000원입니다.";

    public MinOrderpriceIsNotInRangeException(){
        String msg1 = msg;
    }
}
