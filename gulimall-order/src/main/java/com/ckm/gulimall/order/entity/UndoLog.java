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
 * @TableName undo_log
 */
@TableName(value ="undo_log")
@Data
public class UndoLog implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long branchId;

    /**
     * 
     */
    private String xid;

    /**
     * 
     */
    private String context;

    /**
     * 
     */
    private Integer logStatus;

    /**
     * 
     */
    private Date logCreated;

    /**
     * 
     */
    private Date logModified;

    /**
     * 
     */
    private String ext;

    /**
     * 
     */
    private byte[] rollbackInfo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}