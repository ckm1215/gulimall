package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀活动
 * @TableName sms_seckill_promotion
 */
@TableName(value ="sms_seckill_promotion")
public class SeckillPromotion implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 开始日期
     */
    private Date startTime;

    /**
     * 结束日期
     */
    private Date endTime;

    /**
     * 上下线状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long userId;

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
     * 活动标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 活动标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 开始日期
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开始日期
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束日期
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束日期
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 上下线状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 上下线状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 创建人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 创建人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}