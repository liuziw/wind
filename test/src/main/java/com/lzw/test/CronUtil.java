package com.lzw.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuziw
 * @date 2019/9/2 11:19
 */
public class CronUtil {

    /*** 
          *  
          * @param date 
          * @param dateFormat : e.g:yyyy-MM-dd HH:mm:ss 
          * @return 
          */
    public static String formatDateByPattern(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /*** 
          * convert Date to cron ,eg.  "0 06 10 15 1 ? 2014" 
          * @param date  : 时间点 
          * @return 
          */
    public static String getCron(Date date) {
        String dateFormat = "ss mm HH dd MM ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }

    public static void main1(String[] args) {
        String cron = CronUtil.getCron(new Date(1595907250512L));
        System.out.println(cron);
    }

    public static void main(String[] args) {
        String str = "^(?!.*(abdc)).*$";

        String regex = "[a]";
        System.out.println(str.matches(regex));
    }
}
