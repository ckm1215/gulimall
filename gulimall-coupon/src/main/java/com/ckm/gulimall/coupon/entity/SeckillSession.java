package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀活动场次
 * @TableName sms_seckill_session
 */
@TableName(value ="sms_seckill_session")
public class SeckillSession implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 场次名称
     */
    private String name;

    /**
     * 每日开始时间
     */
    private Date startTime;

    /**
     * 每日结束时间
     */
    private Date endTime;

    /**
     * 启用状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * 场次名称
     */
    public String getName() {
        return name;
    }

    /**
     * 场次名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 每日开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 每日开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 每日结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 每日结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 启用状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 启用状态
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
}