package com.example.productservice.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Coupon {
    private Long id;
    private String code;
    private BigDecimal discount;
    private String expDate;
}
