package yu.seckill.common.exception;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-07
 * @Description:
 */
public class SeckillException extends RuntimeException {

    private Integer code;

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMesaage());
    }

    public SeckillException(Integer code, String messgae) {
        super(messgae);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
