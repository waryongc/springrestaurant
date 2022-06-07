package com.sparta.springrestaurant.exception;

public class DeliveryFeeIsNotInRangeException extends RuntimeException {
    public static final String msg="배달 요금은 0원부터 10000원입니다.";
    public DeliveryFeeIsNotInRangeException(){
        super(msg);
    }
}
