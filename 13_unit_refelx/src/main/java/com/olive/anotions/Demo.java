package com.olive.anotions;

/**
 * @description: Demo
 * @date: 2023/12/8 13:13
 * @author: olive
 * @version: 1.0
 */
@MyTest4(value = "牛魔王", bbb = {"java", "c", "c++"})
public class Demo {
    @MyTest4(value = "红孩儿", aaa = 99D, bbb = {"c++", "c", "java"})
    public void test1() throws Exception {
        
    }
}
