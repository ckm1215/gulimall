package com.ckm.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ckm.gulimall.coupon.entity.Coupon;
import com.ckm.gulimall.coupon.service.CouponService;
import com.ckm.gulimall.coupon.mapper.CouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【sms_coupon(优惠券信息)】的数据库操作Service实现
* @createDate 2022-08-04 16:27:26
*/
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon>
    implements CouponService{

    @Autowired
    private CouponMapper couponMapper;

}




