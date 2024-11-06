package yu.seckill.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: Administrator
 * @CreateTime: 2024-11-06
 * @Description:
 */
public class MyBatisConfig {

    @Value("${mybatis.scanpackages}")
    private String scanPackages;

    public SqlSessionFactoryBean sqlSessionFactoryBean(DruidDataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(scanPackages);
        return sqlSessionFactoryBean;
    }
}
