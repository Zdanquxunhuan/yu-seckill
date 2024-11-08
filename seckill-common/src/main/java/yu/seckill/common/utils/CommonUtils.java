package yu.seckill.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import yu.seckill.common.exception.ErrorCode;
import yu.seckill.common.exception.SeckillException;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-08
 * @Description:
 */
public class CommonUtils {

    public static <T> T requireNonNull(T obj, String msg) {

        if (obj == null) {
            throw new SeckillException(msg);
        }

        if (obj instanceof String) {
            if (StringUtils.isBlank((String) obj)) {
                throw new SeckillException(msg);
            }
        }

        if (obj instanceof Collections) {
            if (CollectionUtils.isEmpty((Collection<?>) obj)) {
                throw new SeckillException(msg);
            }
        }

        if (obj instanceof Map) {
            if (MapUtils.isEmpty((Map<?, ?>) obj)) {
                throw new SeckillException(msg);
            }
        }

        return obj;
    }

    public static <T> T requireNonNull(T obj, ErrorCode errorCode) {

        if (obj == null) {
            throw new SeckillException(errorCode);
        }

        if (obj instanceof String) {
            if (StringUtils.isBlank((String) obj)) {
                throw new SeckillException(errorCode);
            }
        }

        if (obj instanceof Collections) {
            if (CollectionUtils.isEmpty((Collection<?>) obj)) {
                throw new SeckillException(errorCode);
            }
        }

        if (obj instanceof Map) {
            if (MapUtils.isEmpty((Map<?, ?>) obj)) {
                throw new SeckillException(errorCode);
            }
        }

        return obj;
    }
}
