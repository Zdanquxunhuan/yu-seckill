package yu.seckill.common.exception;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
public enum ErrorCode {

    SUCCESS(1001, "success"),
    FAILURE(2001, "fail"),
    PARAMS_INVALID(2002, "Parameter error"),
    USERNAME_IS_NULL(2003, "User name cannot be empty"),
    PASSWORD_IS_NULL(2004, "Password cannot be empty"),
    USERNAME_IS_ERROR(2005, "User name error"),
    PASSWORD_IS_ERROR(2006, "Password error"),
    SERVER_EXCEPTION(2007, "Server error"),
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
