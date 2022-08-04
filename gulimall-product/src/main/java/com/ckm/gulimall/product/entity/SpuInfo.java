package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * spu信息
 * @TableName pms_spu_info
 */
@TableName(value ="pms_spu_info")
public class SpuInfo implements Serializable {
    /**
     * 商品id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 商品描述
     */
    private String spuDescription;

    /**
     * 所属分类id
     */
    private Long catalogId;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 
     */
    private BigDecimal weight;

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    private Integer publishStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    public Long getId() {
        return id;
    }

    /**
     * 商品id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商品名称
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * 商品名称
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    /**
     * 商品描述
     */
    public String getSpuDescription() {
        return spuDescription;
    }

    /**
     * 商品描述
     */
    public void setSpuDescription(String spuDescription) {
        this.spuDescription = spuDescription;
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
     * 
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}