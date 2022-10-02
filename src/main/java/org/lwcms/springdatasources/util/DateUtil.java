package org.lwcms.springdatasources.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @version 1.0
 * @ClassName DateUtil
 * @Author lwcms
 * @Date 2022/9/15 22:04
 **/
public class DateUtil {
    /**
     * @Description 获取年份
     * @author lwcms
     * @date 2022/9/15 22:09
     * @param date
     * @return 返回int类型的年份
     */
    public static int getYear(Date date){
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * @Description 获取月份
     * @author lwcms
     * @date 2022/9/15 22:10
     * @param date
     * @return 返回int类型的月份
     */
    public static int getMonth(Date date){
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONDAY);
    }

    /**
     * @Description 获取系统当前时间
     * @author lwcms
     * @date 2022/9/15 22:10
     * @param
     * @return 返回yyyy-MM格式字符串
     */
    public static String getNowTime(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM");
        return format.format(System.currentTimeMillis());
    }

    /**
     * @Description 获取当前月份的上一个月
     * @author lwcms
     * @date 2022/9/15 22:11
     * @param
     * @return 返回yyyy-MM字符串
     */
    public static String getLastMonth(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONDAY,-1);//上一个月
        return format.format(calendar.getTime());
    }
    /**
     * @Description 获取当前日期
     * @author 雷维昌
     * @date 2022/9/30 0:12
     * @param dateFormat
     * @return String
     */
    public static String getNowDate(String dateFormat){
        SimpleDateFormat format =new SimpleDateFormat(dateFormat);
        Calendar calendar=Calendar.getInstance();
        return format.format(calendar.getTime());
    }
}
