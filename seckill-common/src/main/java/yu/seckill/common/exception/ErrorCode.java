package yu.seckill.common.exception;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
public enum ErrorCode {

    SUCCESS(1001, "成功"),
    FAILURE(2001, "失败"),
    ;

    private final Integer code;
    private final String mesaage;

    ErrorCode(Integer code, String mesaage) {
        this.code = code;
        this.mesaage = mesaage;
    }

    public Integer getCode() {
        return code;
    }

    public String getMesaage() {
        return mesaage;
    }
}
