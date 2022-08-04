package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 品牌
 * @TableName pms_brand
 */
@TableName(value ="pms_brand")
public class Brand implements Serializable {
    /**
     * 品牌id
     */
    @TableId(type = IdType.AUTO)
    private Long brandId;

    /**
     * 品牌名
     */
    private String name;

    /**
     * 品牌logo地址
     */
    private String logo;

    /**
     * 介绍
     */
    private String descript;

    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;

    /**
     * 检索首字母
     */
    private String firstLetter;

    /**
     * 排序
     */
    private Integer sort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 品牌id
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 品牌名
     */
    public String getName() {
        return name;
    }

    /**
     * 品牌名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 品牌logo地址
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 品牌logo地址
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 介绍
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 介绍
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 显示状态[0-不显示；1-显示]
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 显示状态[0-不显示；1-显示]
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 检索首字母
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * 检索首字母
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
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
}