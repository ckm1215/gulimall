package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 属性&属性分组关联
 * @TableName pms_attr_attrgroup_relation
 */
@TableName(value ="pms_attr_attrgroup_relation")
public class AttrAttrgroupRelation implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性分组id
     */
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    private Integer attrSort;

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
     * 属性id
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * 属性id
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 属性分组id
     */
    public Long getAttrGroupId() {
        return attrGroupId;
    }

    /**
     * 属性分组id
     */
    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    /**
     * 属性组内排序
     */
    public Integer getAttrSort() {
        return attrSort;
    }

    /**
     * 属性组内排序
     */
    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }
}