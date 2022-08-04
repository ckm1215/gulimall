package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName undo_log
 */
@TableName(value ="undo_log")
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
     * 
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * 
     */
    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    /**
     * 
     */
    public String getXid() {
        return xid;
    }

    /**
     * 
     */
    public void setXid(String xid) {
        this.xid = xid;
    }

    /**
     * 
     */
    public String getContext() {
        return context;
    }

    /**
     * 
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 
     */
    public Integer getLogStatus() {
        return logStatus;
    }

    /**
     * 
     */
    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    /**
     * 
     */
    public Date getLogCreated() {
        return logCreated;
    }

    /**
     * 
     */
    public void setLogCreated(Date logCreated) {
        this.logCreated = logCreated;
    }

    /**
     * 
     */
    public Date getLogModified() {
        return logModified;
    }

    /**
     * 
     */
    public void setLogModified(Date logModified) {
        this.logModified = logModified;
    }

    /**
     * 
     */
    public String getExt() {
        return ext;
    }

    /**
     * 
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * 
     */
    public byte[] getRollbackInfo() {
        return rollbackInfo;
    }

    /**
     * 
     */
    public void setRollbackInfo(byte[] rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }
}