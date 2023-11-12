package com.olive.proxy.Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: ProxyUtils
 * @date: 2023/11/4 16:17
 * @author: olive
 * @version: 1.0
 */
public class ProxyUtils {
    public static UserService getUserService(UserService userService) {
        UserService us = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = 0L;
                long end = 0L;
                if ("add".equals(method.getName())) {
                    start = System.currentTimeMillis();
                    Object obj = method.invoke(userService, args);
                    end = System.currentTimeMillis();
                    System.out.println(method.getName() + "共计消耗：" + (end - start) + "毫秒");
                    return obj;
                } else if ("delete".equals(method.getName())) {
                    start = System.currentTimeMillis();
                    Object obj = method.invoke(userService, args);
                    end = System.currentTimeMillis();
                    System.out.println(method.getName() + "共计消耗：" + (end - start) + "毫秒");
                    return obj;
                } else if ("select".equals(method.getName())) {
                    start = System.currentTimeMillis();
                    Object invoke = method.invoke(userService, args);
                    end = System.currentTimeMillis();
                    System.out.println(method.getName() + "共计消耗：" + (end - start) + "毫秒");
                    return invoke;
                } else {
                    return method.invoke(userService, args);
                }
            }
        });
        return us;
    }
}
