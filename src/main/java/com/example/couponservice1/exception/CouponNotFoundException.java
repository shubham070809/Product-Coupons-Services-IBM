package com.example.couponservice1.exception;

public class CouponNotFoundException extends RuntimeException{

    private String message;
    public CouponNotFoundException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
