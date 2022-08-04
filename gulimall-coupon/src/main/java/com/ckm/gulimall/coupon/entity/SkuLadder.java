package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品阶梯价格
 * @TableName sms_sku_ladder
 */
@TableName(value ="sms_sku_ladder")
public class SkuLadder implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;

    /**
     * 满几件
     */
    private Integer fullCount;

    /**
     * 打几折
     */
    private BigDecimal discount;

    /**
     * 折后价
     */
    private BigDecimal price;

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    private Integer addOther;

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
     * spu_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * spu_id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 满几件
     */
    public Integer getFullCount() {
        return fullCount;
    }

    /**
     * 满几件
     */
    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    /**
     * 打几折
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 打几折
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 折后价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 折后价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    public Integer getAddOther() {
        return addOther;
    }

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    public void setAddOther(Integer addOther) {
        this.addOther = addOther;
    }
}