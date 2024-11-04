package com.yu.seckill.user.infrastructure.repository;

import com.yu.seckill.user.domain.model.entity.SeckillUser;
import com.yu.seckill.user.domain.model.repository.SeckillUserRepository;
import com.yu.seckill.user.infrastructure.mapper.SeckillUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhongcanyu
 * @date 2024/11/4
 * @description
 */
@Component
public class SeckillUserRepositoryImpl implements SeckillUserRepository {

    @Autowired
    private SeckillUserMapper seckillUserMapper;

    @Override
    public SeckillUser getSeckillUserByUserName(String userName) {
        return seckillUserMapper.getSeckillUserByUserName(userName);
    }
}
