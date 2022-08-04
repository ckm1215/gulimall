package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 属性分组
 * @TableName pms_attr_group
 */
@TableName(value ="pms_attr_group")
public class AttrGroup implements Serializable {
    /**
     * 分组id
     */
    @TableId(type = IdType.AUTO)
    private Long attrGroupId;

    /**
     * 组名
     */
    private String attrGroupName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述
     */
    private String descript;

    /**
     * 组图标
     */
    private String icon;

    /**
     * 所属分类id
     */
    private Long catelogId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 分组id
     */
    public Long getAttrGroupId() {
        return attrGroupId;
    }

    /**
     * 分组id
     */
    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    /**
     * 组名
     */
    public String getAttrGroupName() {
        return attrGroupName;
    }

    /**
     * 组名
     */
    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    /**
     * 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 组图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 组图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 所属分类id
     */
    public Long getCatelogId() {
        return catelogId;
    }

    /**
     * 所属分类id
     */
    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }
}