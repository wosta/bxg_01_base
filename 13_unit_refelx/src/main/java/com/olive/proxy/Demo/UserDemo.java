package com.olive.proxy.Demo;

/**
 * @description: UserDemo
 * @date: 2023/11/4 16:25
 * @author: olive
 * @version: 1.0
 */
public class UserDemo {
    public static void main(String[] args) {
        UserService us = ProxyUtils.getUserService(new UserServiceImpl());
        us.add();
        us.delete();
        us.select();
    }
}
