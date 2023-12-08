package com.olive.anotions;

/**
 * @description: MyAnno1
 * @date: 2023/12/8 11:45
 * @author: olive
 * @version: 1.0
 */
public @interface MyAnno1 {
    String aaa();

    boolean bbb() default false;

    String[] ccc();
}
