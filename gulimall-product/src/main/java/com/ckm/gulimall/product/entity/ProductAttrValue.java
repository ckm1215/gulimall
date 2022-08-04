package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * spu属性值
 * @TableName pms_product_attr_value
 */
@TableName(value ="pms_product_attr_value")
public class ProductAttrValue implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性名
     */
    private String attrName;

    /**
     * 属性值
     */
    private String attrValue;

    /**
     * 顺序
     */
    private Integer attrSort;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    private Integer quickShow;

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
     * 商品id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * 商品id
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 属性id
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * 属性id
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 属性名
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 属性名
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * 属性值
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * 属性值
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 顺序
     */
    public Integer getAttrSort() {
        return attrSort;
    }

    /**
     * 顺序
     */
    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    public Integer getQuickShow() {
        return quickShow;
    }

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    public void setQuickShow(Integer quickShow) {
        this.quickShow = quickShow;
    }
}