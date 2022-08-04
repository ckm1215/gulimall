package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * spu图片
 * @TableName pms_spu_images
 */
@TableName(value ="pms_spu_images")
public class SpuImages implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 图片名
     */
    private String imgName;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 顺序
     */
    private Integer imgSort;

    /**
     * 是否默认图
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
     * spu_id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * spu_id
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * 图片名
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * 图片名
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
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
     * 顺序
     */
    public Integer getImgSort() {
        return imgSort;
    }

    /**
     * 顺序
     */
    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    /**
     * 是否默认图
     */
    public Integer getDefaultImg() {
        return defaultImg;
    }

    /**
     * 是否默认图
     */
    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }
}