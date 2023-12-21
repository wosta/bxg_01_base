package com.olive.f_02.th03;

import java.util.concurrent.Callable;

/**
 * @description: MyFuther
 * @date: 2023/12/16 15:36
 * @author: olive
 * @version: 1.0
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + " : i = " + i);
        }
        return "well done!";
    }
}
