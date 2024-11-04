package com.yu.seckill.user.domain.model.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;

@Data
public class SeckillUser implements Serializable {

    private static final long serialVersionUID = -3004624289691589697L;
    //用户id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    //用户名
    private String userName;
    //密码
    private String password;
    //1：正常；2：冻结
    private Integer status;
}
