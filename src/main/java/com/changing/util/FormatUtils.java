package com.changing.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtils {
	public static final String DATE_PURE = "yyyyMMdd";
	public static final String DATE = "yyyy-MM-dd";
	public static final String HOUR = "HH";
	public static final String TIME = "HH:mm";
	public static final String TIME_PURE = "HHmm";
	public static final String DATETIME = "yyyy-MM-dd HH:mm:ss";
	public static final String DATETIME_M = "yyyy-MM-dd HH:mm";
	public static final String TIMESTAMP = "yyyyMMddHHmmssS";
	public static final String DATETIME_PURE = "yyyyMMddHHmmss";
	public static final String SPECIAL_TIMESTAMP = "yyyyMMdd_HHmm";
	public static final String DATE_TIME_MIL_PURE = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String DATETIME_M_PURE = "yyyyMMddHHmm";

	
	public static String reformat(String strDate, String fromFormat, String toFormat) throws ParseException {
		return dateToStr(dateFromStr(strDate, fromFormat), toFormat);		
	}
	
	public static String dateToStr(Date date, String toFormat) throws ParseException {
		return new SimpleDateFormat(toFormat).format(date);
	}

	public static Date dateFromStr(String strDate, String fromFormat) throws ParseException {
		return new SimpleDateFormat(fromFormat).parse(strDate);
	}
	
	public static String dateToStr(String toFormat) throws ParseException{
		return dateToStr(new Date(), toFormat);
	}
	
    // 时间戳转日期
    public static String timeStampToStr(String stamp, String toFormat) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(toFormat);
        long lt = new Long(stamp);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

}
