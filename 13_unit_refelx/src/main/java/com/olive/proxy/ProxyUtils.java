package com.olive.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: ProxyUtils
 * @date: 2023/11/4 15:48
 * @author: olive
 * @version: 1.0
 */
public class ProxyUtils {

    public static Star createProxy(BigStar bigStar) {
        Star star = (Star) Proxy.newProxyInstance(ProxyUtils.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("sing".equals(method.getName())) {
                    System.out.println("唱歌收费20万");
                } else if ("dance".equals(method.getName())) {
                    System.out.println("跳舞收费100万");
                }
                return method.invoke(bigStar, args);
            }
        });
        return star;
    }
}
