package com.xiaojia.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 得到当前系统时间的月份
 * Created by 黄仕杰 on 2019/3/10.
 */
public class GetMonth {
    public static String getmonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(new Date());
        String[] split = time.split("-");
        return split[1];
    }
}
