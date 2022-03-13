package com.example.productservice.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CouponNotFoundException extends RuntimeException{

    private String message;

}
