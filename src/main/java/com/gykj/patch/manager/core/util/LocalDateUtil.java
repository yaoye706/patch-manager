package com.gykj.patch.manager.core.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
/**
 * jdk1.8 localDate工具类
 */
public class LocalDateUtil {
	/**
	 * yyyy-MM-dd
	 */
	public static final String DAY_FORMAT = "yyyy-MM-dd";
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String FULL_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获得当前时间的yyyy-MM-dd格式字符串
	 * @return String
	 */
	public static String getCurrentDate(){
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate today = LocalDate.now();
		String nowDate = today.format(df);
		return nowDate;
	}
	/**
	 * 获得当前时间的yyyy-MM-dd HH:mm:ss格式字符串
	 * @return String
	 */
	public static String getLocalDateTime(){
		DateTimeFormatter df = DateTimeFormatter.ofPattern(FULL_FORMAT);
		LocalDateTime today = LocalDateTime.now();
		String nowDate = today.format(df);
		return nowDate;
	}

	/**
	 * LocalDate转化为指定格式字符串
	 * @param fromDate
	 * @param dateFormat
	 * @return
	 */
	public static String getLocalDate(LocalDate fromDate, String dateFormat){
		DateTimeFormatter  df = DateTimeFormatter.ofPattern(dateFormat);
		if(fromDate != null){
			String dateStr = fromDate.format(df);
			return dateStr;
		}
		return null ;

	}
	public static String getLocalDateTime(LocalDateTime fromDateTime, String dateTimeFotmat){
		DateTimeFormatter df = DateTimeFormatter.ofPattern(dateTimeFotmat);
		if(fromDateTime != null){
			String localTime = fromDateTime.format(df);
			return localTime;
		}
		return null;

	}

	/**
	 * 获得一年后的日期格式字符串
	 */
	public static String getOneYearLaterDate(String beginDate,String dateFormat){
		LocalDate fromDate = fromString2LocalDate(beginDate,dateFormat);
		if(fromDate != null){
			LocalDate toDate = fromDate.plus(1, ChronoUnit.YEARS);
			return getLocalDate(toDate,dateFormat);
		}
		return null;

	}

	/**
	 * 时间格式字符串转化为指定格式的时间
	 * @param beginDate
	 * @param dateFormat
	 * @return
	 */
	public static LocalDate fromString2LocalDate(String beginDate,String dateFormat){
		DateTimeFormatter  df = DateTimeFormatter.ofPattern(dateFormat);
		try {
			LocalDate fromDate = LocalDate.parse(beginDate,df);
			return fromDate;
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * 时间格式字符串转化为指定格式的时间
	 * @param beginDateTime
	 * @param dateFormat
	 * @return
	 */
	public static LocalDateTime fromString2LocalDateTime(String beginDateTime,String dateFormat){
		DateTimeFormatter  df = DateTimeFormatter.ofPattern(dateFormat);
		try {
			LocalDateTime fromDateTime = LocalDateTime.parse(beginDateTime,df);
			return fromDateTime;
		} catch (Exception e) {
			return null;
		}

	}
	/**
	 * 获得毫秒数
	 * @param localDateTime
	 * @return
	 */
	public static long getTimestampOfDateTime(LocalDateTime localDateTime) {
		ZoneId zone = ZoneId.systemDefault();
		Instant instant = localDateTime.atZone(zone).toInstant();
		return instant.toEpochMilli();
	}


	/**
	 * 根据出生日期(yyyy-MM-dd)字符串计算年龄
	 * @param birthDay
	 * @return
	 */
	public static Integer getAgeByBirthDay(String birthDay){
		LocalDate birthDate = fromString2LocalDate(birthDay,DAY_FORMAT);
		LocalDate currentDate = LocalDate.now();
		if(birthDate != null){
			//判断birthDay是否合法
			if(currentDate.isBefore(birthDate)){
				return 0 ;
			}else{
				int age = birthDate.until(currentDate).getYears();
				return age ;
			}

		}else{
			return null ;
		}

	}
	/**
	 * Long类型时间戳转化为LocalDateTime
	 * @param dateTimeLong
	 * @return
	 */
	public static LocalDateTime fromLong2LocalDateTime(Long dateTimeLong) {
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(dateTimeLong), ZoneId.systemDefault());
		return dateTime;
	}

	/**
	 * 获取本月第一天
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDate getFirstDayOfCurrentMonth() {
		LocalDate currentDay = LocalDate.now();
		return currentDay.with(TemporalAdjusters.firstDayOfMonth());
	}
	/**
	 * 获取上月第一天
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDate getFirstMonthOfDay() {
		LocalDate localDate = LocalDate.now();
		if(localDate.getMonthValue() == 1){
			LocalDate lastMonth = LocalDate.of(localDate.getYear() -1, 12, 1);
			LocalDate lastDay = lastMonth.with(TemporalAdjusters.lastDayOfMonth());
			return lastMonth;
		} else {
			LocalDate lastMonth = LocalDate.of(localDate.getYear(), localDate.getMonthValue() - 1, 1);
			LocalDate lastDay = lastMonth.with(TemporalAdjusters.lastDayOfMonth());
			return lastMonth;
		}
	}
	/**
	 * 获取本月最后一天
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDate getLastDayOfCurrentMonth() {
		LocalDate currentDay = LocalDate.now();
		return currentDay.with(TemporalAdjusters.lastDayOfMonth());
	}
	/**
	 * 获取上月最后一天
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDate getLastMonthOfDay() {
		LocalDate localDate = LocalDate.now();
		if(localDate.getMonthValue() == 1){
			LocalDate lastMonth = LocalDate.of(localDate.getYear() -1, 12, 1);
			LocalDate lastDay = lastMonth.with(TemporalAdjusters.lastDayOfMonth());
			return lastDay;
		} else {
			LocalDate lastMonth = LocalDate.of(localDate.getYear(), localDate.getMonthValue() - 1, 1);
			LocalDate lastDay = lastMonth.with(TemporalAdjusters.lastDayOfMonth());
			return lastDay;
		}
	}
	/**
	 * 获取当天开始时间 2019-06-12 00:00:00
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDateTime getTodayBeginTime(){
		LocalDate currentDay = LocalDate.now();
		return LocalDateTime.of(currentDay, LocalTime.MIN);
	}

	/**
	 * 获取当天结束时间 2019-06-12 23:59:59
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDateTime getTodayEndTime(){
		LocalDate currentDay = LocalDate.now();
		return LocalDateTime.of(currentDay, LocalTime.MAX);
	}

	/**
	 * 获取本周开始时间 2019-06-10 00:00:00
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDateTime getWeekBeginTime(){
		LocalDateTime currentDateTime = LocalDateTime.now();
		int currentOrdinal = currentDateTime.getDayOfWeek().ordinal();
		return currentDateTime.minusDays(currentOrdinal)
				.withHour(0).withMinute(0).withSecond(0).withNano(0);
	}

	/**
	 * 获取本周开始时间 2019-06-10
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static String getWeekBeginTimeString(){
		LocalDateTime currentDateTime = LocalDateTime.now();
		int currentOrdinal = currentDateTime.getDayOfWeek().ordinal();
		LocalDateTime weekBeginDateTime =  currentDateTime.minusDays(currentOrdinal)
				.withHour(0).withMinute(0).withSecond(0).withNano(0);
		return getLocalDateTime(weekBeginDateTime,DAY_FORMAT);
	}

	/**
	 * 获取本周结束时间 2019-06-16 23:59:59
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static LocalDateTime getWeekEndTime(){
		LocalDateTime currentDateTime = LocalDateTime.now();
		int currentOrdinal = currentDateTime.getDayOfWeek().ordinal();
		return currentDateTime.plusDays(6-currentOrdinal)
				.withHour(23).withMinute(59).withSecond(59).withNano(999999999);
	}

	/**
	 * 获取本周结束时间字符串 2019-06-16
	 * @return
	 * @author wangjk
	 * @date 2019年6月12日
	 */
	public static String getWeekEndTimeString(){
		LocalDateTime currentDateTime = LocalDateTime.now();
		int currentOrdinal = currentDateTime.getDayOfWeek().ordinal();
		LocalDateTime weekEndDateTime = currentDateTime.plusDays(6-currentOrdinal)
				.withHour(23).withMinute(59).withSecond(59).withNano(999999999);
		return getLocalDateTime(weekEndDateTime,DAY_FORMAT);
	}

	/**
	 * 获取两个时间之间的分钟数
	 * @param inT
	 * @param outT
	 * @return
	 */
	public  static long  getMinute(LocalDateTime inT,LocalDateTime outT){
		Duration duration = Duration.between(inT,outT);
		return duration.toMinutes();
	}
	/**
	 * 将分钟转化为小时
	 * @param minutes
	 * @return
	 */
	public static String minuteToHour(long minutes){
		String tips = minutes+"分钟";
		if(minutes>60){
			int time = (int) minutes;
			int hours = (int) Math.floor(time / 60);
			int minute = time % 60;
			tips = hours+"小时";
			if(minute > 0){
				tips = tips+minute+"分钟";
			}
		}
		return tips;
	}

	/**
	 * 查看两个时间相差几天
	 * @param inT
	 * @param outT
	 * @return
	 */
	public  static long  getDay(LocalDateTime inT,LocalDateTime outT){
		Period next = Period.between(inT.toLocalDate(),outT.toLocalDate());
		return next.getDays();
	}
	/**
	 * 判断是否是同一天
	 * @param inT
	 * @param outT
	 * @return
	 */
	public static boolean isOneDay(String inT,String outT){
		if(fromString2LocalDateTime(inT,FULL_FORMAT).toLocalDate()
				.equals(fromString2LocalDateTime(outT,FULL_FORMAT).toLocalDate())){
			return true;
		}
		return  false;
	}

	/**
	 *
	 * 将时间段转化为时间
	 * @param start 起始时间 08:00
	 * @param end 结束时间 16:30
	 * @param ST 开始时间
	 * @param ET 结束时间
	 * @return
	 */
	 public static  Map<String,String> getDateTimeByTime(String start,String end,LocalDate ST,LocalDate ET){
		Map<String,String> timeMap =  new HashMap<>();
		LocalTime startTime = LocalTime.parse(start+":00",
				DateTimeFormatter.ofPattern("HH:mm:ss"));
		LocalTime endTime = LocalTime.parse(end+":00",
				DateTimeFormatter.ofPattern("HH:mm:ss"));
		timeMap.put("ST",ST.atTime(startTime).toString());
		timeMap.put("ET",ET.atTime(endTime).toString());
		return timeMap;
	}
	//测试
	public static void main(String[] args) {
		String todayTime = LocalDateUtil.getCurrentDate();//当前时间
		String yesTime = LocalDateUtil.getLocalDate(LocalDate.now().plusDays(-1), LocalDateUtil.DAY_FORMAT);//昨天时间
		String weekTime = String.valueOf(LocalDateUtil.getWeekBeginTimeString());//获取本周第一天
		String weekEndTime = String.valueOf(LocalDateUtil.getWeekEndTimeString());//获取本周最后一天
		LocalDateTime localDateTime = LocalDateUtil.getWeekBeginTime().plusWeeks(-1);//获取上周第一天
		String lastWeekTime = LocalDateUtil.getLocalDateTime(localDateTime, LocalDateUtil.DAY_FORMAT);//转换成年月日格式
		LocalDateTime locaDateTime = LocalDateUtil.getWeekEndTime().plusWeeks(-1);//获取上周最后一天
		String lastWeekEndTime = LocalDateUtil.getLocalDateTime(locaDateTime, LocalDateUtil.DAY_FORMAT);
		String firstTime = String.valueOf(LocalDateUtil.getFirstDayOfCurrentMonth());//获取本月第一天时间
		String lastTime = String.valueOf(LocalDateUtil.getLastDayOfCurrentMonth());//获取本月最后一天时间
		String lastMonthFirstTime = String.valueOf(LocalDateUtil.getFirstDayOfCurrentMonth().plusMonths(-1));//获取上个月第一天时间
		String lastMonthLastTime = String.valueOf(LocalDateUtil.getLastDayOfCurrentMonth().plusMonths(-1));//获取上个月最后一天时间
		
		//得到两个时间(年月日时分秒)从而换算相差小时数
	}
}
