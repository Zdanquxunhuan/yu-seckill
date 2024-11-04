package com.yu.seckill.activity.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhongcanyu
 * @date 2024/11/4
 * @description
 */
@Data
public class SeckillActivity implements Serializable {

    private static final long serialVersionUID = -7079319520596736847L;
    //活动id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    //活动名称
    private String activityName;
    //活动开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date startTime;
    //活动结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date endTime;
    //活动状态 0：已发布； 1：上线； -1：下线
    private Integer status;
    //活动描述
    private String activityDesc;
}
