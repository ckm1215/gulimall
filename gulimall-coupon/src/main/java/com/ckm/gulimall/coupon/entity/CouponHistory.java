package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券领取历史记录
 * @TableName sms_coupon_history
 */
@TableName(value ="sms_coupon_history")
public class CouponHistory implements Serializable {
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
     * 会员id
     */
    private Long memberId;

    /**
     * 会员名字
     */
    private String memberNickName;

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    private Integer getType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    private Integer useType;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private Long orderSn;

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
     * 会员id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员名字
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * 会员名字
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    public Integer getGetType() {
        return getType;
    }

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    public Integer getUseType() {
        return useType;
    }

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    /**
     * 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单号
     */
    public Long getOrderSn() {
        return orderSn;
    }

    /**
     * 订单号
     */
    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }
}