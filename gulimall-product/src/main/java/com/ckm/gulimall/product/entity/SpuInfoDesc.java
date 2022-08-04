package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * spu信息介绍
 * @TableName pms_spu_info_desc
 */
@TableName(value ="pms_spu_info_desc")
public class SpuInfoDesc implements Serializable {
    /**
     * 商品id
     */
    @TableId
    private Long spuId;

    /**
     * 商品介绍
     */
    private String decript;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
     * 商品介绍
     */
    public String getDecript() {
        return decript;
    }

    /**
     * 商品介绍
     */
    public void setDecript(String decript) {
        this.decript = decript;
    }
}