package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 优惠券分类关联
 * @TableName sms_coupon_spu_category_relation
 */
@TableName(value ="sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelation implements Serializable {
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
     * 产品分类id
     */
    private Long categoryId;

    /**
     * 产品分类名称
     */
    private String categoryName;

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
     * 产品分类id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 产品分类id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 产品分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 产品分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}