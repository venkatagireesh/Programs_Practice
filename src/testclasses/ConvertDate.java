package testclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConvertDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();     
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String todaydate = format1.format(date);            
		int year = cal.getTime().getYear();
		
		System.out.println("todaydate-->>"+todaydate);

	}

}
