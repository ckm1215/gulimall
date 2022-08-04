package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券信息
 * @TableName sms_coupon
 */
@TableName(value ="sms_coupon")
public class Coupon implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    private Integer couponType;

    /**
     * 优惠券图片
     */
    private String couponImg;

    /**
     * 优惠卷名字
     */
    private String couponName;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 每人限领张数
     */
    private Integer perLimit;

    /**
     * 使用门槛
     */
    private BigDecimal minPoint;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    private Integer useType;

    /**
     * 备注
     */
    private String note;

    /**
     * 发行数量
     */
    private Integer publishCount;

    /**
     * 已使用数量
     */
    private Integer useCount;

    /**
     * 领取数量
     */
    private Integer receiveCount;

    /**
     * 可以领取的开始日期
     */
    private Date enableStartTime;

    /**
     * 可以领取的结束日期
     */
    private Date enableEndTime;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    private Integer memberLevel;

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    private Integer publish;

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
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    public Integer getCouponType() {
        return couponType;
    }

    /**
     * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     */
    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    /**
     * 优惠券图片
     */
    public String getCouponImg() {
        return couponImg;
    }

    /**
     * 优惠券图片
     */
    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    /**
     * 优惠卷名字
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 优惠卷名字
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 每人限领张数
     */
    public Integer getPerLimit() {
        return perLimit;
    }

    /**
     * 每人限领张数
     */
    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    /**
     * 使用门槛
     */
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    /**
     * 使用门槛
     */
    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    public Integer getUseType() {
        return useType;
    }

    /**
     * 使用类型[0->全场通用；1->指定分类；2->指定商品]
     */
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    /**
     * 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 发行数量
     */
    public Integer getPublishCount() {
        return publishCount;
    }

    /**
     * 发行数量
     */
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    /**
     * 已使用数量
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * 已使用数量
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    /**
     * 领取数量
     */
    public Integer getReceiveCount() {
        return receiveCount;
    }

    /**
     * 领取数量
     */
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    /**
     * 可以领取的开始日期
     */
    public Date getEnableStartTime() {
        return enableStartTime;
    }

    /**
     * 可以领取的开始日期
     */
    public void setEnableStartTime(Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    /**
     * 可以领取的结束日期
     */
    public Date getEnableEndTime() {
        return enableEndTime;
    }

    /**
     * 可以领取的结束日期
     */
    public void setEnableEndTime(Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    /**
     * 优惠码
     */
    public String getCode() {
        return code;
    }

    /**
     * 优惠码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    public Integer getMemberLevel() {
        return memberLevel;
    }

    /**
     * 可以领取的会员等级[0->不限等级，其他-对应等级]
     */
    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    public Integer getPublish() {
        return publish;
    }

    /**
     * 发布状态[0-未发布，1-已发布]
     */
    public void setPublish(Integer publish) {
        this.publish = publish;
    }
}