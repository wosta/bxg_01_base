package com.olive._01myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/2/5 12:49
 * @modified By
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("F:\\IT\\Java\\temp");
        long time = file.lastModified();
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-+年MM月dd日 hh:mm:ss");
        Date date = new Date(time);
        String format = sdf.format(date);
        System.out.println(format);

        String name = "ss";
        method();
    }
    public static void method() {
        String name = "bbb";

    }
}
