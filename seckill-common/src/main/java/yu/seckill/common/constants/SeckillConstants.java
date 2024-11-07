package yu.seckill.common.constants;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
public class SeckillConstants {

    /**
     * 用户id
     */
    public static final String USER_ID = "userId";

    /**
     * 用户缓存前缀
     */
    public static final String USER_KEY_PREFIX = "user:";

    /**
     * 获取Key
     */
    public static String getKey(String prefix, String key){
        return prefix.concat(key);
    }


    /**
     * token的载荷中盛放的信息 只盛放一个userName 其余什么也不再盛放
     */
    public static final String TOKEN_CLAIM = "userId";


    /**
     * jwtToken过期时间 默认为7天
     */
    public static final Long TOKEN_EXPIRE_TIME = 7 * 24 * 60 * 60 * 1000L;

    /**
     * token请求头名称
     */
    public static final String TOKEN_HEADER_NAME = "access-token";

    /**
     * JWT的密钥
     */
    public static final String JWT_SECRET = "a814edb0e7c1ba4c";


}
