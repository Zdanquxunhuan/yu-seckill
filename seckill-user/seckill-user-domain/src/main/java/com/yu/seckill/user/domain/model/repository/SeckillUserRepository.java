package com.yu.seckill.user.domain.model.repository;

import com.yu.seckill.user.domain.model.entity.SeckillUser;

public interface SeckillUserRepository {

    /**
     * Get user information based on user name
     */
    SeckillUser getSeckillUserByUserName(String userName);
}
