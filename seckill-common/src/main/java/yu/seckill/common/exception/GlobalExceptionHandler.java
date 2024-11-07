package yu.seckill.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import yu.seckill.common.response.ResponseMessage;
import yu.seckill.common.response.ResponseMessageBuilder;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-07
 * @Description:
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常处理，统一返回状态码
     */
    @ExceptionHandler(SeckillException.class)
    public ResponseMessage<String> handleSeckillException(SeckillException e) {
        log.error("服务器抛出了异常：{}", e);
        return ResponseMessageBuilder.build(e.getCode(), e.getMessage());
    }

    /**
     * 全局异常处理，统一返回状态码
     */
    @ExceptionHandler(Exception.class)
    public ResponseMessage<String> handleException(Exception e) {
        log.error("服务器抛出了异常：{}", e);
        return ResponseMessageBuilder.build(ErrorCode.SERVER_EXCEPTION.getCode(), e.getMessage());
    }

}
