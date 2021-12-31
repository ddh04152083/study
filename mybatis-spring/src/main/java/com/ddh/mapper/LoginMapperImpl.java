package com.ddh.mapper;

import com.ddh.pojo.Login;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class LoginMapperImpl implements LoginMapper {

     private SqlSessionTemplate sqlSession;


    public List<Login> selectLogin() {
        return sqlSession.getMapper(LoginMapper.class).selectLogin();
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Login queryById(long id) {
        return sqlSession.getMapper(LoginMapper.class).queryById(id);
    }
}
