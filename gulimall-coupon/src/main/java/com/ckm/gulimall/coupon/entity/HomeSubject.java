package com.ckm.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @TableName sms_home_subject
 */
@TableName(value ="sms_home_subject")
public class HomeSubject implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 专题名字
     */
    private String name;

    /**
     * 专题标题
     */
    private String title;

    /**
     * 专题副标题
     */
    private String subTitle;

    /**
     * 显示状态
     */
    private Integer status;

    /**
     * 详情连接
     */
    private String url;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 专题图片地址
     */
    private String img;

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
     * 专题名字
     */
    public String getName() {
        return name;
    }

    /**
     * 专题名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 专题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 专题标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 专题副标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 专题副标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * 显示状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 显示状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 详情连接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 详情连接
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 专题图片地址
     */
    public String getImg() {
        return img;
    }

    /**
     * 专题图片地址
     */
    public void setImg(String img) {
        this.img = img;
    }
}