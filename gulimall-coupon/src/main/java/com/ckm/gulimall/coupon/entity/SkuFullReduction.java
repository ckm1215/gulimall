package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品满减信息
 * @TableName sms_sku_full_reduction
 */
@TableName(value ="sms_sku_full_reduction")
public class SkuFullReduction implements Serializable {
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
     * 满多少
     */
    private BigDecimal fullPrice;

    /**
     * 减多少
     */
    private BigDecimal reducePrice;

    /**
     * 是否参与其他优惠
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
     * 满多少
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * 满多少
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * 减多少
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * 减多少
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    /**
     * 是否参与其他优惠
     */
    public Integer getAddOther() {
        return addOther;
    }

    /**
     * 是否参与其他优惠
     */
    public void setAddOther(Integer addOther) {
        this.addOther = addOther;
    }
}