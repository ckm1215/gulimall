package com.ckm.gulimall.coupon;

import com.ckm.gulimall.coupon.mapper.CouponMapper;
import org.junit.jupiter.api.Test;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponMapper couponMapper;

    @Test
    void contextLoads() {
        System.out.println(couponMapper.selectById(1));
    }

}
