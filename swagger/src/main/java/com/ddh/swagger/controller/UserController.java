package com.ddh.swagger.controller;


import com.ddh.swagger.Service.UserService;
import com.ddh.swagger.bean.UserBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = " 对用户的增删改查进行管理")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addOrUpdate")
    @ApiOperation(value = "增加或修改用户信息", notes = "添加或修改用户信息")
    public UserBean addOrUpdateUser(@RequestBody UserBean userBean) {
        return userService.addOrUpdateUser(userBean);
    }

    @DeleteMapping("/deleteUserById/{id}")
    @ApiOperation(value = "根据用户id删除用户信息", notes = "")
    @ApiImplicitParam(paramType = "query", name = "id", value = "用户id", required = true, dataType = "Long")
    public String deleteUserById(@PathVariable("id") long id) {
        userService.deleteUserById(id);
        return "删除成功";
    }

    @ApiOperation(value = "根据用户id获取用户信息", notes = "")
    @ApiImplicitParam(paramType = "query", name = "id", value = "用户id", required = true, dataType = "Long")
    @GetMapping("/get/{id}")
    public UserBean getUserById(@PathVariable("id") long id) {

        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "获取用户列表信息", notes = "")
    public List<UserBean> getAllUser() {
        return userService.getAllUser();
    }

}
