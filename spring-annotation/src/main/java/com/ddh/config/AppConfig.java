package com.ddh.config;

import com.ddh.pojo.User;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ddh")  //包扫描
@Import(AppConfig2.class) //导入其他配置文件
public class AppConfig {


    //相当于<bean id ="" class="">
    @Bean
    public User getUser(){
        return new User();
    }
}
