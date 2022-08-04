package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * sku图片
 * @TableName pms_sku_images
 */
@TableName(value ="pms_sku_images")
public class SkuImages implements Serializable {
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
     * 图片地址
     */
    private String imgUrl;

    /**
     * 排序
     */
    private Integer imgSort;

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    private Integer defaultImg;

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
     * 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 排序
     */
    public Integer getImgSort() {
        return imgSort;
    }

    /**
     * 排序
     */
    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    public Integer getDefaultImg() {
        return defaultImg;
    }

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }
}