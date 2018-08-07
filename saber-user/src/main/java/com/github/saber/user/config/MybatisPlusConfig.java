package com.github.saber.user.config;

import com.baomidou.mybatisplus.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <b>Description:mybatis-puls配置类</b>
 * <br><b>ClassName:</b> MybatisPlusConfig
 * <br><b>Date:</b> 2018年8月6日 下午3:05:47
 * <br>@author <b>jianb.jiang</b>
 */
@Configuration
@MapperScan("com.github.saber.user.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件，自动识别数据库类型
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    
    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启，不建议在生产环境使用
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
    
    /**
     * 乐观锁插件，需要在实体类的版本字段上添加@Version注解，需要注意：版本字段仅支持int,Integer,long,Long,Date,Timestamp
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
    
}
