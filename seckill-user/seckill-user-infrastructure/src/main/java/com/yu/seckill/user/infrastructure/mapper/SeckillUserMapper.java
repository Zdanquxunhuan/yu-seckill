package com.yu.seckill.user.infrastructure.mapper;

import com.yu.seckill.user.domain.model.entity.SeckillUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhongcanyu
 * @date 2024/11/4
 * @description
 */
public interface SeckillUserMapper {

    /**
     * 根据用户名获取用户信息
     */
    SeckillUser getSeckillUserByUserName(@Param("userName") String userName);

}
