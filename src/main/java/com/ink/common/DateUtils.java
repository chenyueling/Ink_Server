package com.ink.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenyueling on 2015/7/26.
 */
public class DateUtils {

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static final String DateToString(Date date){
        return simpleDateFormat.format(date);
    }
}
