package com.example.coupongenerationservice.service;

import com.example.coupongenerationservice.model.CouponGenerator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;
@Service
public class GeneratorService {
    public CouponGenerator generateCoupon()
    {
        CouponGenerator couponGenerator=new CouponGenerator();
        String[] str= UUID.randomUUID().toString().split("-");
        couponGenerator.setCouponCode(str[0]);
        couponGenerator.setDiscount(new BigDecimal(new Random().nextInt(20)));
        return couponGenerator;
    }
}
