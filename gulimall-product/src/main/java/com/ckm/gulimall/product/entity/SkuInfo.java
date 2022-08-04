package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sku信息
 * @TableName pms_sku_info
 */
@TableName(value ="pms_sku_info")
public class SkuInfo implements Serializable {
    /**
     * skuId
     */
    @TableId(type = IdType.AUTO)
    private Long skuId;

    /**
     * spuId
     */
    private Long spuId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * sku介绍描述
     */
    private String skuDesc;

    /**
     * 所属分类id
     */
    private Long catalogId;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 默认图片
     */
    private String skuDefaultImg;

    /**
     * 标题
     */
    private String skuTitle;

    /**
     * 副标题
     */
    private String skuSubtitle;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 销量
     */
    private Long saleCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * skuId
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * spuId
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * spuId
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * sku名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * sku名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * sku介绍描述
     */
    public String getSkuDesc() {
        return skuDesc;
    }

    /**
     * sku介绍描述
     */
    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    /**
     * 所属分类id
     */
    public Long getCatalogId() {
        return catalogId;
    }

    /**
     * 所属分类id
     */
    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
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
     * 默认图片
     */
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    /**
     * 默认图片
     */
    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    /**
     * 标题
     */
    public String getSkuTitle() {
        return skuTitle;
    }

    /**
     * 标题
     */
    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    /**
     * 副标题
     */
    public String getSkuSubtitle() {
        return skuSubtitle;
    }

    /**
     * 副标题
     */
    public void setSkuSubtitle(String skuSubtitle) {
        this.skuSubtitle = skuSubtitle;
    }

    /**
     * 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 销量
     */
    public Long getSaleCount() {
        return saleCount;
    }

    /**
     * 销量
     */
    public void setSaleCount(Long saleCount) {
        this.saleCount = saleCount;
    }
}