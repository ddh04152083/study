package com.ddh.swagger.config;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysqlConfig extends MySQL8Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }

}
