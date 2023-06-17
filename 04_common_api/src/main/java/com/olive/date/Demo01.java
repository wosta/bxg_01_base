package com.olive.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        String date1 = "1989年11月21日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = simpleDateFormat.parse(date1);
        System.out.println(parse);

    }
}
