package com.ckm.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 会员统计信息
 * @TableName ums_member_statistics_info
 */
@TableName(value ="ums_member_statistics_info")
@Data
public class UmsMemberStatisticsInfo implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 累计消费金额
     */
    private BigDecimal consumeAmount;

    /**
     * 累计优惠金额
     */
    private BigDecimal couponAmount;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    private Integer couponCount;

    /**
     * 评价数
     */
    private Integer commentCount;

    /**
     * 退货数量
     */
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 关注数量
     */
    private Integer attendCount;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 收藏的商品数量
     */
    private Integer collectProductCount;

    /**
     * 收藏的专题活动数量
     */
    private Integer collectSubjectCount;

    /**
     * 收藏的评论数量
     */
    private Integer collectCommentCount;

    /**
     * 邀请的朋友数量
     */
    private Integer inviteFriendCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}