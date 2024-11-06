package yu.seckill.common.response;

/**
 * @Author: yu
 * @CreateTime: 2024-11-06
 * @Description: 返回消息构造器
 */
public class ResponseMessageBuilder {

    public static <T> ResponseMessage<T> build(Integer code, T body) {
        return new ResponseMessage<>(code, body);
    }

    public static <T> ResponseMessage<T> build(Integer code) {
        return new ResponseMessage<>(code);
    }
}
