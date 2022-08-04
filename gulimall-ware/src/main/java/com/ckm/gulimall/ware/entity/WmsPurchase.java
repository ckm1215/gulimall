package com.ckm.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * @TableName wms_purchase
 */
@TableName(value ="wms_purchase")
@Data
public class WmsPurchase implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long assigneeId;

    /**
     * 
     */
    private String assigneeName;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private Integer priority;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Long wareId;

    /**
     * 
     */
    private BigDecimal amount;

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
}