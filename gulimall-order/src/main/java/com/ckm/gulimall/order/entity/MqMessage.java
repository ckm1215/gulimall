package com.ckm.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName mq_message
 */
@TableName(value ="mq_message")
@Data
public class MqMessage implements Serializable {
    /**
     * 
     */
    @TableId
    private String messageId;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String toExchane;

    /**
     * 
     */
    private String routingKey;

    /**
     * 
     */
    private String classType;

    /**
     * 0-新建 1-已发送 2-错误抵达 3-已抵达
     */
    private Integer messageStatus;

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