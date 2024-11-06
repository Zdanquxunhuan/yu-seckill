package yu.seckill.common.model.enums;

public enum SeckillOrderStatus {

    CREATED(1),
    PAYED(2),
    CANCELED(0),
    DELETED(-1),
    ;

    private final Integer code;

    SeckillOrderStatus(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
