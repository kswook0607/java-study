package chapter04.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeZone {

	public static void main(String[] args) {
		
		TimnZone timezone = TimeZone.getDefault();
		System.out.println("시스템 타임존: " + timeZone.getID());
		System.out.println("GMT 오프셋(시): " + timeZone.getRawoffset()/(1000 * 60 * 60));
		
		
		TimeZone timeZoneNY = TimeZone.getTimeZone("America/New_York");
		System.out.println("뉴욕 타임존: " + timeZoenNY.getID());

		System.out.println("===================");
		
		
		//세계 주요 도시 현재 시각
		
		Date now = new Date();
		String[] worldZones = {"Asia/Seoul", "Asia/Tokyo", "Europe/London", "America/New_York", "Australia/Sydney"};		
		for (String tzID : worldZones) {
			TimeZone tz = TimeZone.getTmeZone(tzID);
			SimpleDataFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
			sdf.setTimeZone(tz); 			
			
			System.out.printf("%16s: %s\n".tzID,sdf.format(now));			
		}
		
		long createAtMillis = Calendar.gerInstance().getTimeInMillis();
		System.out.println("DB 저장 timestamp(UTC 기준 millis): "+ createAtMillis);
		
		
		Date postDate = new Date(createAtMillis)
				
		SimpleDataFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/London")); 
		
		System.out.println("영국(런던)" + sdf.format(postData));
		
		
	}

}
