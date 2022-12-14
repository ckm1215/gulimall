package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 品牌分类关联
 * @TableName pms_category_brand_relation
 */
@TableName(value ="pms_category_brand_relation")
public class CategoryBrandRelation implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long catelogId;

    /**
     * 
     */
    private String brandName;

    /**
     * 
     */
    private String catelogName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * 分类id
     */
    public Long getCatelogId() {
        return catelogId;
    }

    /**
     * 分类id
     */
    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    /**
     * 
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 
     */
    public String getCatelogName() {
        return catelogName;
    }

    /**
     * 
     */
    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName;
    }
}