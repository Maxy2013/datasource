package com.wxxcx.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author lz
 * 2018/9/26 14:21
 */
@Configuration
@MapperScan(basePackages = {"com.wxxcx.demo.dao" }, sqlSessionFactoryRef = "sqlSessionFactory")

public class DataSourceConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.drive}")
    private String driver;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.userpassword}")
    private String password;

    @Value("${jdbc.mapperLocations}")
    private String mapperLocations;

    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().url(url).username(username).password(password).driverClassName(driver).build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

}
