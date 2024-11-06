package yu.seckill.user.controller;

import com.yu.seckill.user.domain.model.entity.SeckillUser;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yu.seckill.common.constants.SeckillConstants;
import yu.seckill.common.exception.ErrorCode;
import yu.seckill.common.response.ResponseMessage;
import yu.seckill.common.response.ResponseMessageBuilder;
import yu.seckill.user.application.service.SeckillUserService;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class SeckillUserController {


    @Autowired
    private SeckillUserService seckillUserService;

    /**
     * 获取用户信息
     */
    @RequestMapping(value = "/get", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseMessage<SeckillUser> get(@RequestHeader(SeckillConstants.USER_ID) Long userId, @RequestParam String username){
        log.info("SeckillUserController|获取到的userId|{}", userId);
        return ResponseMessageBuilder.build(ErrorCode.SUCCESS.getCode(), seckillUserService.getSeckillUserByUserName(username));
    }
}
