package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 商品三级分类
 * @TableName pms_category
 */
@TableName(value ="pms_category")
public class Category implements Serializable {
    /**
     * 分类id
     */
    @TableId(type = IdType.AUTO)
    private Long catId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类id
     */
    private Long parentCid;

    /**
     * 层级
     */
    private Integer catLevel;

    /**
     * 是否显示[0-不显示，1显示]
     */
    private Integer showStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标地址
     */
    private String icon;

    /**
     * 计量单位
     */
    private String productUnit;

    /**
     * 商品数量
     */
    private Integer productCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * 分类id
     */
    public void setCatId(Long catId) {
        this.catId = catId;
    }

    /**
     * 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 父分类id
     */
    public Long getParentCid() {
        return parentCid;
    }

    /**
     * 父分类id
     */
    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    /**
     * 层级
     */
    public Integer getCatLevel() {
        return catLevel;
    }

    /**
     * 层级
     */
    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    /**
     * 是否显示[0-不显示，1显示]
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 是否显示[0-不显示，1显示]
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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
     * 图标地址
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标地址
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 计量单位
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * 计量单位
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    /**
     * 商品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 商品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}