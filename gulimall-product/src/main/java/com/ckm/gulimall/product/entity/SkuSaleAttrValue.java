package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * sku销售属性&值
 * @TableName pms_sku_sale_attr_value
 */
@TableName(value ="pms_sku_sale_attr_value")
public class SkuSaleAttrValue implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * attr_id
     */
    private Long attrId;

    /**
     * 销售属性名
     */
    private String attrName;

    /**
     * 销售属性值
     */
    private String attrValue;

    /**
     * 顺序
     */
    private Integer attrSort;

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
     * attr_id
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * attr_id
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 销售属性名
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 销售属性名
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * 销售属性值
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * 销售属性值
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
}