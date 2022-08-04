package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * @TableName pms_spu_comment
 */
@TableName(value ="pms_spu_comment")
public class SpuComment implements Serializable {
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
     * spu_id
     */
    private Long spuId;

    /**
     * 商品名字
     */
    private String spuName;

    /**
     * 会员昵称
     */
    private String memberNickName;

    /**
     * 星级
     */
    private Integer star;

    /**
     * 会员ip
     */
    private String memberIp;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 显示状态[0-不显示，1-显示]
     */
    private Integer showStatus;

    /**
     * 购买时属性组合
     */
    private String spuAttributes;

    /**
     * 点赞数
     */
    private Integer likesCount;

    /**
     * 回复数
     */
    private Integer replyCount;

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    private String resources;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户头像
     */
    private String memberIcon;

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    private Integer commentType;

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
     * sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * sku_id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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
     * 商品名字
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * 商品名字
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    /**
     * 会员昵称
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * 会员昵称
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * 星级
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 星级
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 会员ip
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * 会员ip
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 显示状态[0-不显示，1-显示]
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 显示状态[0-不显示，1-显示]
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 购买时属性组合
     */
    public String getSpuAttributes() {
        return spuAttributes;
    }

    /**
     * 购买时属性组合
     */
    public void setSpuAttributes(String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    /**
     * 点赞数
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * 点赞数
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * 回复数
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * 回复数
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    public String getResources() {
        return resources;
    }

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    public void setResources(String resources) {
        this.resources = resources;
    }

    /**
     * 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 用户头像
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 用户头像
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }
}