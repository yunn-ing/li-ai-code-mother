package com.liyurui.yuaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.liyurui.yuaicodemother.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)// 启用AOP代理对象暴露功能, 以支持内部方法调用的切面功能,如事务等,详见 https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-proxying

public class YuAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuAiCodeMotherApplication.class, args);
    }

}

