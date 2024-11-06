package yu.seckill.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
@EnableAsync
@SpringBootApplication
public class SeckillUserStarter {


    public static void main(String[] args) {
        SpringApplication.run(SeckillUserStarter.class, args);
    }
}
