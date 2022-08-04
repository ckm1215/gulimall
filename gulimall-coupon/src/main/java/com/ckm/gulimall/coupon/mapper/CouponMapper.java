package com.ckm.gulimall.coupon.mapper;

import com.ckm.gulimall.coupon.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【sms_coupon(优惠券信息)】的数据库操作Mapper
* @createDate 2022-08-04 16:27:26
* @Entity com.ckm.gulimall.coupon.entity.Coupon
*/
@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {

}




