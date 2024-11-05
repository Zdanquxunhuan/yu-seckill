package com.yu.seckill.order.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhongcanyu
 * @date 2024/11/5
 * @description
 */
@Data
public class SeckillOrder implements Serializable {

    private static final long serialVersionUID = -2900817329676795585L;
    //订单id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    //用户id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;
    //商品id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long goodsId;
    //商品名称
    private String goodsName;
    //秒杀活动价格
    private BigDecimal activityPrice;
    //购买数量
    private Integer quantity;
    //订单总金额
    private BigDecimal orderPrice;
    //活动id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long activityId;
    //订单状态 1：已创建 2：已支付 0：已取消； -1：已删除
    private Integer status;
    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date createTime;
}
