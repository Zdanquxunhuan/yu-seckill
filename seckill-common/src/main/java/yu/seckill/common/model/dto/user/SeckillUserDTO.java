package yu.seckill.common.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-07
 * @Description:
 */
@Data
public class SeckillUserDTO implements Serializable {

    private static final long serialVersionUID = 1576119726547415227L;
    //用户名
    private String userName;
    //密码
    private String password;
}
