package com.migration.tool.migration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	
	public Long dateTimeDiff(String dateTime) {
		
		
		Date d1=new Date();
		
		System.out.println("Current date----->"+d1);
		System.out.println("user date--->"+dateTime);
		
		Date d2;
		try {
			d2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(dateTime);
			long diff = d2.getTime() - d1.getTime();
			
			long diffMinutes = diff / (60 * 1000) % 60;
			
			System.out.println("diff--->"+diff);
			return diffMinutes*60;
		} catch (ParseException e) {
			
			e.printStackTrace();
		}		
		return 60L;
	}
}
