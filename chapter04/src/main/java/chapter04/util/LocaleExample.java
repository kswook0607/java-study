package chapter04.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Date now = new Date();
		
		DateForamt dfkoea = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println("란국: " + dfkoea.format(now));
		
		DateForamt dfUS = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.println("미국: " + dfUS.format(now));
		
		DateForamt dfJapan = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
		System.out.println("일본: " + dfJapan.format(now));
	}

}
