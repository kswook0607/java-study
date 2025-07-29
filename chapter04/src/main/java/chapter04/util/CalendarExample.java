package chapter04.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		printDate(cal.getTime());
		printDate(cal.getTime());

		cal.set(Calendar, YEAR, 2024);
		cal.set(Calendar, MONTH, 11);
		cal.set(Calendar, DATE, 25);
		printDate(cal);
		
		cal.set(2000, 12,26);
		cal.add(Calendar.DATE, 100);
		printDate(cal);
	
	}
		
		private static void printdate02(Date d){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String date = sdf.format(d);
			System.out.println(date);		
		}
			
		private static void printDate(Calendar cal) {
			final String[] DAYS = {"일", "월", "화", "수", "목", "금", "토"};
			
			int year = cal.get(Calendar.YEAR);
			
			int month = cal.get(Calendar.MONTH);
			
			int date = cal.get(Calendar.DATE);
			
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			int hours = cal.get(Calendar.HOUR);
			
			int minutes = cal.get(Calendar.MINUTES);
		
			int seconds = cal.get(Calendar.SECOND);
					
			System.out.printf("%d-%d-%d (%s) %d:%d:%d", 
				year, (month + 1), date, DAYS[day-1], hour, minute, second);							
		}
		

		

	}

