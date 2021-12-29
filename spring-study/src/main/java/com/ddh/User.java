package com.ddh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * xml适用于任何场合维护简单方便
 * 注解相对比较难维护
 *
 * 实践：xml用来管理bean ;注解用来负责属性的注入
 *
 */
@Component
@Scope("singleton")
public class User {


    @Value("ddh")
    private String username;
}
