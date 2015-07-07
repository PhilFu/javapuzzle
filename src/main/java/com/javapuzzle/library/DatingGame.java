package com.javapuzzle.library;

import java.util.Calendar;
import java.util.Date;

/**
 * In Calendar&Date, month start with 0, so December is 11
 * Date.getDay() return a day of week, not a day of month.
 * 
 * You should avoid of use Date, use Calendar instead
 * 
 * @author DeBen
 *
 */
public class DatingGame {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, 12, 31);
		System.out.println(calendar.get(Calendar.YEAR) + "");

		Date date = calendar.getTime();
		System.out.println(date.getDay());
		
		calendar.set(1999, Calendar.DECEMBER, 31);
		System.out.println(calendar.get(Calendar.YEAR) + "");
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
	}

}
