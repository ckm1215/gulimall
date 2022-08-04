package com.ckm.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 库存工作单
 * @TableName wms_ware_order_task_detail
 */
@TableName(value ="wms_ware_order_task_detail")
@Data
public class WmsWareOrderTaskDetail implements Serializable {
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
     * sku_name
     */
    private String skuName;

    /**
     * 购买个数
     */
    private Integer skuNum;

    /**
     * 工作单id
     */
    private Long taskId;

    /**
     * 仓库id
     */
    private Long wareId;

    /**
     * 1-已锁定  2-已解锁  3-扣减
     */
    private Integer lockStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}