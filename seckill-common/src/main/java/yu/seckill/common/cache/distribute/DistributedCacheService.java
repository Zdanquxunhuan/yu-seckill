package yu.seckill.common.cache.distribute;

import java.util.concurrent.TimeUnit;

/**
 * @Author: yu
 * @CreateTime: 2024-11-08
 * @Description:
 */
public interface DistributedCacheService {

    void put(String key, String value);

    void put(String key, Object value);

    void put(String key, Object value, long timeout, TimeUnit unit);

    void put(String key, Object value, long expireTime);



    String getString(String key);
}
