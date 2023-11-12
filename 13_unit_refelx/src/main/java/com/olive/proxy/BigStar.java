package com.olive.proxy;

/**
 * @description: BigStar
 * @date: 2023/11/4 15:35
 * @author: olive
 * @version: 1.0
 */
public class BigStar implements Star {

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "谢谢！谢谢~";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在跳舞---");
    }


    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
