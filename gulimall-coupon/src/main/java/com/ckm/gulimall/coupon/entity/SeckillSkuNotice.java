package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀商品通知订阅
 * @TableName sms_seckill_sku_notice
 */
@TableName(value ="sms_seckill_sku_notice")
public class SeckillSkuNotice implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 活动场次id
     */
    private Long sessionId;

    /**
     * 订阅时间
     */
    private Date subcribeTime;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 通知方式[0-短信，1-邮件]
     */
    private Integer noticeType;

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
     * member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * member_id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
     * 活动场次id
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * 活动场次id
     */
    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 订阅时间
     */
    public Date getSubcribeTime() {
        return subcribeTime;
    }

    /**
     * 订阅时间
     */
    public void setSubcribeTime(Date subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    /**
     * 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 通知方式[0-短信，1-邮件]
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * 通知方式[0-短信，1-邮件]
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }
}