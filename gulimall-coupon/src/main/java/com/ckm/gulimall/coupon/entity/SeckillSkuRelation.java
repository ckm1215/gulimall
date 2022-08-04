package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 秒杀活动商品关联
 * @TableName sms_seckill_sku_relation
 */
@TableName(value ="sms_seckill_sku_relation")
public class SeckillSkuRelation implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 活动id
     */
    private Long promotionId;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀总量
     */
    private Integer seckillCount;

    /**
     * 每人限购数量
     */
    private Integer seckillLimit;

    /**
     * 排序
     */
    private Integer seckillSort;

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
     * 活动id
     */
    public Long getPromotionId() {
        return promotionId;
    }

    /**
     * 活动id
     */
    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * 活动场次id
     */
    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    /**
     * 活动场次id
     */
    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    /**
     * 商品id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 商品id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 秒杀价格
     */
    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    /**
     * 秒杀价格
     */
    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    /**
     * 秒杀总量
     */
    public Integer getSeckillCount() {
        return seckillCount;
    }

    /**
     * 秒杀总量
     */
    public void setSeckillCount(Integer seckillCount) {
        this.seckillCount = seckillCount;
    }

    /**
     * 每人限购数量
     */
    public Integer getSeckillLimit() {
        return seckillLimit;
    }

    /**
     * 每人限购数量
     */
    public void setSeckillLimit(Integer seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    /**
     * 排序
     */
    public Integer getSeckillSort() {
        return seckillSort;
    }

    /**
     * 排序
     */
    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }
}