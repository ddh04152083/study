package com.ddh.swagger.Service.impl;

import com.ddh.swagger.Service.UserService;
import com.ddh.swagger.bean.UserBean;
import com.ddh.swagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service impl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserBean addOrUpdateUser(UserBean user) {

        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserBean> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserBean getUserById(long id) {
        return userRepository.getOne(id);
    }
}
