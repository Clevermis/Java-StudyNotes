package com.clevermis.demo02;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServicePorxy userServicePorxy = new UserServicePorxy();
        userServicePorxy.setUserService(userService);
        userServicePorxy.add();
    }
}
