package com.yu.seckill.goods.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
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
public class SeckillGoods implements Serializable  {

    private static final long serialVersionUID = -8447592991812016065L;
    //数据id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    //商品名称
    private String goodsName;
    //秒杀活动id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long activityId;
    //活动开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date startTime;
    //活动结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date endTime;
    //商品原价
    private BigDecimal originalPrice;
    //秒杀活动价格
    private BigDecimal activityPrice;
    //初始库存，如果设置了分桶库存，则此字段无效，库存由库存服务进行处理
    private Integer initialStock;
    //限购个数
    private Integer limitNum;
    //当前可用库存，如果设置了分桶库存，则此字段无效，库存由库存服务进行处理
    private Integer availableStock;
    //描述
    private String description;
    //图片
    private String imgUrl;
    //秒杀状态 0：已发布； 1：上线； -1：下线
    private Integer status;
    //分桶数量
    private Integer bucketsQuantity;

    public boolean validateParams(){
        if (StringUtils.isEmpty(goodsName)
                || activityId == null
                || startTime == null
                || endTime == null
                || startTime.after(endTime)
                || endTime.before(new Date())
                || activityPrice == null
                || activityPrice.compareTo(BigDecimal.ZERO) < 0
                || originalPrice == null
                || originalPrice.compareTo(BigDecimal.ZERO) < 0
                || initialStock == null
                || initialStock <= 0
                || limitNum == null
                || limitNum <= 0){
            return false;
        }
        return true;
    }
}
