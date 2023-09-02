package com.olive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: LoggerDemo
 * @date: 2023/7/8 11:17
 * @author: olive
 * @version: 1.0
 */
public class LoggerDemo {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        LOGGER.info("hello");
    }
}
