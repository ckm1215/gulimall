package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 首页轮播广告
 * @TableName sms_home_adv
 */
@TableName(value ="sms_home_adv")
public class HomeAdv implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 图片地址
     */
    private String pic;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 点击数
     */
    private Integer clickCount;

    /**
     * 广告详情连接地址
     */
    private String url;

    /**
     * 备注
     */
    private String note;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 发布者
     */
    private Long publisherId;

    /**
     * 审核者
     */
    private Long authId;

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
     * 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 图片地址
     */
    public String getPic() {
        return pic;
    }

    /**
     * 图片地址
     */
    public void setPic(String pic) {
        this.pic = pic;
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
     * 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 点击数
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * 点击数
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * 广告详情连接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 广告详情连接地址
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 发布者
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者
     */
    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 审核者
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * 审核者
     */
    public void setAuthId(Long authId) {
        this.authId = authId;
    }
}