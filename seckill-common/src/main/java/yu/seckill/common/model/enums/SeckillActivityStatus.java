package yu.seckill.common.model.enums;

public enum SeckillActivityStatus {

    PUBLISHED(0),
    ONLINE(1),
    OFFLINE(2),
    ;

    private final Integer code;

    SeckillActivityStatus(Integer code) {
        this.code = code;
    }

    public static boolean isOnline(Integer code) {
        return ONLINE.code.equals(code);
    }

    public static boolean isOffline(Integer code) {
        return OFFLINE.code.equals(code);
    }
}
