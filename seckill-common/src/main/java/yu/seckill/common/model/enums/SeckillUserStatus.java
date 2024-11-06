package yu.seckill.common.model.enums;

public enum SeckillUserStatus {

    NORMAL(1),
    FREEZE(2),
    ;

    private final Integer code;

    SeckillUserStatus(Integer code) {
        this.code = code;
    }
}
