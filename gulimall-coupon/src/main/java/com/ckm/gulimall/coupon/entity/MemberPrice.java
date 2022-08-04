package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品会员价格
 * @TableName sms_member_price
 */
@TableName(value ="sms_member_price")
public class MemberPrice implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 会员等级id
     */
    private Long memberLevelId;

    /**
     * 会员等级名
     */
    private String memberLevelName;

    /**
     * 会员对应价格
     */
    private BigDecimal memberPrice;

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
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
     * sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * sku_id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 会员等级id
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * 会员等级id
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 会员等级名
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * 会员等级名
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    /**
     * 会员对应价格
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * 会员对应价格
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    public Integer getAddOther() {
        return addOther;
    }

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    public void setAddOther(Integer addOther) {
        this.addOther = addOther;
    }
}