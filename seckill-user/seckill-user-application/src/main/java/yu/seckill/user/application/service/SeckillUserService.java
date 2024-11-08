package yu.seckill.user.application.service;

import com.yu.seckill.user.domain.model.entity.SeckillUser;

public interface SeckillUserService {

    /**
     * 根据用户名获取用户信息
     */
    SeckillUser getSeckillUserByUserName(String userName);

    String login(String userName, String password);
}
