package com.ddh.mapper;

import com.ddh.pojo.Login;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginMapper {

    List<Login> selectLogin();

    Login queryById(@Param("id") long id);
}
