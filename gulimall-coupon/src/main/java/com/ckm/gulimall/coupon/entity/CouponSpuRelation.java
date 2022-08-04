package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 优惠券与产品关联
 * @TableName sms_coupon_spu_relation
 */
@TableName(value ="sms_coupon_spu_relation")
public class CouponSpuRelation implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 优惠券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 优惠券id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * spu_id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * spu_id
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * spu_name
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * spu_name
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }
}