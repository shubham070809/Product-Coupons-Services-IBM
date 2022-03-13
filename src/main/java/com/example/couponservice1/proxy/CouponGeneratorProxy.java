package com.example.couponservice1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient("GENERATOR-SERVICE-WS")
public interface CouponGeneratorProxy {
    @GetMapping("/generates")
    public Generator generateCoupon();
}