package yu.seckill.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import yu.seckill.common.config.JdbcConfig;
import yu.seckill.common.config.MyBatisConfig;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
@Configuration
@MapperScan(value = {"com.yu.seckill.user.infrastructure.mapper"})
@PropertySource(value = {"classpath:properties/mysql.properties", "classpath:properties/mybatis.properties"})
@ComponentScan(value = {"com.yu.seckill"})
@Import({JdbcConfig.class, MyBatisConfig.class})
public class TransactionConfig {

    @Bean
    public TransactionManager transactionManager(DruidDataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
