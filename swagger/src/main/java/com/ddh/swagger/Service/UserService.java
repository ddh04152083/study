package com.ddh.swagger.Service;

import com.ddh.swagger.bean.UserBean;

import java.util.List;

/**
 * user service 接口
 */
public interface UserService {

    /**
     * 添加或更新用户信息
     */
    UserBean addOrUpdateUser(UserBean user);

    /**
     * 删除用户信息
     *
     * @param id 用户id
     */
    void deleteUserById(long id);

    /**
     * 获取所有用户信息
     *
     * @return 所有用户信息
     */
    List<UserBean> getAllUser();

    /**
     * 根据id 获取该用户的基本信息
     *
     * @param id 参数id
     * @return user info
     */
    UserBean getUserById(long id);
}
