package com.example.couponservice1;

import com.example.couponservice1.model.model.Coupon;
import com.example.couponservice1.model.repos.CouponRepo;
import com.example.couponservice1.ui.ErrorResponseModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CouponService1Application{
        //implements CommandLineRunner

//    private final CouponRepo couponRepo;
//
//    public CouponService1Application(CouponRepo couponRepo) {
//
//        this.couponRepo = couponRepo;
//    }

    public static void main(String[] args) {
        SpringApplication.run(CouponService1Application.class, args);
    }
//    @Override
//    public void run(String... args) throws Exception {
//        couponRepo.save(new Coupon(1L, "CODE-A", new BigDecimal(10), "10-May-2022"));
//        couponRepo.save(new Coupon(2L, "CODE-B", new BigDecimal(11), "11-May-2022"));
//        couponRepo.save(new Coupon(3L, "CODE-C", new BigDecimal(12), "12-May-2022"));

    //}
    @Bean
    public ErrorResponseModel errorResponseModel()
    {
        return  new ErrorResponseModel();
    }


}
