package yu.seckill.user.application.service.impl;

import com.yu.seckill.user.domain.model.entity.SeckillUser;
import com.yu.seckill.user.domain.model.repository.SeckillUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yu.seckill.common.cache.distribute.DistributedCacheService;
import yu.seckill.common.constants.SeckillConstants;
import yu.seckill.common.exception.ErrorCode;
import yu.seckill.common.exception.SeckillException;
import yu.seckill.common.shiro.utils.JwtUtils;
import yu.seckill.common.utils.CommonUtils;
import yu.seckill.user.application.service.SeckillUserService;

import java.util.Objects;

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
    @Autowired
    private DistributedCacheService distributedCacheService;

    @Override
    public SeckillUser getSeckillUserByUserName(String userName) {
//        log.info("seckill-user|获取用户信息|{}", userName);
        SeckillUser seckillUser = seckillUserRepository.getSeckillUserByUserName(userName);
        if (seckillUser != null) {
            seckillUser.setPassword("");
        }
        return seckillUser;
    }

    @Override
    public String login(String userName, String password) {

        CommonUtils.requireNonNull(userName, ErrorCode.USERNAME_IS_NULL);
        CommonUtils.requireNonNull(password, ErrorCode.PASSWORD_IS_NULL);

        SeckillUser seckillUser = seckillUserRepository.getSeckillUserByUserName(userName);
        if(Objects.isNull(seckillUser)) throw new SeckillException(ErrorCode.USERNAME_IS_ERROR);

        String token = JwtUtils.sign(seckillUser.getId());
        String key = SeckillConstants.getKey(SeckillConstants.USER_KEY_PREFIX, String.valueOf(seckillUser.getId()));
        distributedCacheService.put(key, seckillUser);

        return token;
    }


}
