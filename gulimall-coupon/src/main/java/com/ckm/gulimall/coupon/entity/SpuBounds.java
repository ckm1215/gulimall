package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品spu积分设置
 * @TableName sms_spu_bounds
 */
@TableName(value ="sms_spu_bounds")
public class SpuBounds implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long spuId;

    /**
     * 成长积分
     */
    private BigDecimal growBounds;

    /**
     * 购物积分
     */
    private BigDecimal buyBounds;

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    private Integer work;

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
     * 
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * 
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 成长积分
     */
    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    /**
     * 成长积分
     */
    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    /**
     * 购物积分
     */
    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    /**
     * 购物积分
     */
    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    public Integer getWork() {
        return work;
    }

    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    public void setWork(Integer work) {
        this.work = work;
    }
}