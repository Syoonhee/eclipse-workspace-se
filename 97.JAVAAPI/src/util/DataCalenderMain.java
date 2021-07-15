package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataCalenderMain {

	public static void main(String[] args) throws ParseException {
		/*
		 * java.util.Date
		 */
		
		Date now = new Date();
		String nowStr = now.toString(); //toString()메소드: 자기 자신을 대표하는 문자열 반환? 
		System.out.println(nowStr);
		String nowLocaleStr = now.toLocaleString(); //locale(장소)마다 언어가 다름,to~웬만하면 안 쓰는 게..
		System.out.println(nowLocaleStr);
		System.out.println("------시간저장형식----------");
		long currentTimeMillis1 = now.getTime(); 
		/*
		 * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMTrepresented by this Date object.
		 */
		System.out.println(currentTimeMillis1);
		
		long currentTimeMillis2 = System.currentTimeMillis();
		/*
		 * the difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
		 */
		System.out.println(currentTimeMillis2);
		System.out.println("----------SimpleDateFormat[Date-->String]----------------");
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.applyPattern("yyyy 년 MM 월 dd 일");
		String formatStr1 =sdf1.format(now); 
		/*
		 * format() -> Returns:the formatted time string.
		 */
		
		System.out.println(formatStr1);
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println(yearStr);
		System.out.println(Integer.parseInt(yearStr)); 
		
		
		System.out.println("-----------SimpleDateFormat[String-->Date]----------------");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-07-15");
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("2002/02/02 02:22:22");
		/*
		 * java.util.Cal
		 */
		
		Calendar call = Calendar.getInstance();
		System.out.println(call.getCalendarType());
		long currentTimeMillis3 = call.getTimeInMillis();
		System.out.println(currentTimeMillis3);
		int year = call.get(Calendar.YEAR);
		int month = call.get(Calendar.MONTH) + 1;
		int day = call.get(Calendar.DAY_OF_MONTH);
		int hour = call.get(Calendar.HOUR);
		int minute = call.get(Calendar.MINUTE);
		int sec = call.get(Calendar.SECOND);
		int msec = call.get(Calendar.MILLISECOND);
		
		System.out.println(year +"/" + month + "/" + day + " " + hour + ":" +  minute + ":" + sec + "."+ msec);

		Calendar cal2 = Calendar.getInstance();
		cal2.clear();
		cal2.set(2021, Calendar.AUGUST, 8, 8, 8, 8);
		System.out.println(cal2);
		Calendar cal3 = Calendar.getInstance();
		cal3.clear();
		cal3.set(Calendar.YEAR, 2021);
		cal3.set(Calendar.MONTH, Calendar.NOVEMBER);
		System.out.println(cal3);
		Calendar cal4 = Calendar.getInstance();
		cal4.setTimeInMillis(System.currentTimeMillis());
		System.out.println(cal4);
		System.out.println("---------------Date<---->Calendar----------------");
		Date date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse("2021/05/02 10:32");
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(date1.getTime());
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.clear();
		calendar2.set(2019, Calendar.JANUARY, 3);
		Date date2 = new Date(calendar2.getTimeInMillis());
		
		/**********Calendar 객체 메쏘드******************/
		Calendar calendar3 = Calendar.getInstance();
		calendar3.clear();
		calendar3.set(2019, Calendar.JANUARY, 5);
		
		Calendar calendar4 = Calendar.getInstance();
		calendar4.clear();
		calendar4.set(2017, Calendar.MAY, 10);
		
		Calendar calendar5 = Calendar.getInstance();
		calendar5.clear();
		calendar5.set(2021, Calendar.APRIL, 20);
		
		System.out.println("compareTo:" + calendar3.compareTo(calendar4));
		System.out.println("equals:" + calendar3.equals(calendar4));
		System.out.println(calendar3.compareTo(calendar5));
		System.out.println(calendar5.equals(calendar3));
		
		System.out.println("원날짜:" + calendar3.get(Calendar.YEAR)+"년 "+ calendar3.get(Calendar.MONTH)+1 + "월 " + calendar3.get(Calendar.DAY_OF_MONTH) +" 일");
		calendar3.add(Calendar.DATE, 5);
		System.out.println("5일후:" + calendar3.get(Calendar.YEAR) + "년 " + (calendar3.get(Calendar.MONTH) + 1) + "월 "
				+ calendar3.get(Calendar.DAY_OF_MONTH) + " 일");
		calendar3.add(Calendar.DATE, -10);
		System.out.println("10일 전:" + calendar3.get(Calendar.YEAR) + "년 " + (calendar3.get(Calendar.MONTH) + 1) + "월 "
				+ calendar3.get(Calendar.DAY_OF_MONTH) + " 일");
		calendar3.add(Calendar.MONTH, 6);
		System.out.println("6개월 후:" + calendar3.get(Calendar.YEAR) + "년 " + (calendar3.get(Calendar.MONTH) + 1) + "월 "
				+ calendar3.get(Calendar.DAY_OF_MONTH) + " 일");
		calendar3.add(Calendar.YEAR, 1);
		System.out.println("1년 후:" + calendar3.get(Calendar.YEAR) + "년 " + (calendar3.get(Calendar.MONTH) + 1) + "월 "
				+ calendar3.get(Calendar.DAY_OF_MONTH) + " 일");
		
		/*********************Date객체메쏘드**************************/
		
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-07");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-08");
		System.out.println("equals:" + date3.equals(date4));
		System.out.println("compareTo:" + date3.compareTo(date4));
		System.out.println("compareTo:" + date3.compareTo(date5));
		System.out.println("compareTo:" + date3.compareTo(date3));
		
	}

}
