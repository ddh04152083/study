package com.ddh.dmeo2;

public class UserServiceProxy implements UserService {


    private UserServiceImpl userService;

    public void add() {
        this.log("add");
        userService.add();

    }

    public void delete() {
        this.log("delete");
        userService.delete();
    }

    public void query() {
        this.log("query");
        userService.query();
    }

    public void update() {
        this.log("update");
        userService.update();
    }
     private void log(String log){
         System.out.println("[debug] " + log);
     }
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
