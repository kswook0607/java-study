package chapter04.util;

import chapter04.java.util.Date;

public class DataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		
		System.out.println(now);
		printdate01(now);
		printdate02(now);
		
		
		Date d1 = new Date(0); // 1970년 1월 1일 01:00:00 UTC + 9 :KST
		printDate02(d1);
		
		long millis = d1.getTime(); //long 타입의 시간
		d1.setTime(millis + 1000);  // 1초 추가
		printDate01(d1);
		
		
		Date d2 = new Date(2025-1900,6,29);
		Date d3 = new Date(2025-1900,6,29,0,0);
		
	}
	
	private static void printdate02(Date d){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);		
	}
		
	private static void printDate01(Date d) {
		
		int year = d.getYear();
		
		int month = d.getMonth();
		
		int date = d.getDate();
		
		int hours = d.getHours();
		
		int minutes = d.getMinutes();
	
		int seconds = d.getSeconds();
				
		System.out.printf("%d-%d-%d %d:%d:%d", (year + 1900), (month + 1), date, hours, minutes, seconds );
						
	}

}
