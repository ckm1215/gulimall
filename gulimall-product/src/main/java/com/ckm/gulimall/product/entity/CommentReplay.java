package com.ckm.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 商品评价回复关系
 * @TableName pms_comment_replay
 */
@TableName(value ="pms_comment_replay")
public class CommentReplay implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 评论id
     */
    private Long commentId;

    /**
     * 回复id
     */
    private Long replyId;

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
     * 评论id
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 评论id
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 回复id
     */
    public Long getReplyId() {
        return replyId;
    }

    /**
     * 回复id
     */
    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }
}