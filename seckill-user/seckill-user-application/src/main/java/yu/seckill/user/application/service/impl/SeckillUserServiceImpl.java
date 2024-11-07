package yu.seckill.user.application.service.impl;

import com.yu.seckill.user.domain.model.entity.SeckillUser;
import com.yu.seckill.user.domain.model.repository.SeckillUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yu.seckill.user.application.service.SeckillUserService;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
@Slf4j
@Service
public class SeckillUserServiceImpl implements SeckillUserService {

    @Autowired
    private SeckillUserRepository seckillUserRepository;

    @Override
    public SeckillUser getSeckillUserByUserName(String userName) {
//        log.info("seckill-user|获取用户信息|{}", userName);
        SeckillUser seckillUser = seckillUserRepository.getSeckillUserByUserName(userName);
        if (seckillUser != null){
            seckillUser.setPassword("");
        }
        return seckillUser;
    }
}
