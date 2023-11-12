package com.olive.proxy;

/**
 * @description: ProxyTest
 * @date: 2023/11/4 15:56
 * @author: olive
 * @version: 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Star star = ProxyUtils.createProxy(new BigStar("周杰伦"));
        star.sing("双节棍");
        star.dance();
    }
}
