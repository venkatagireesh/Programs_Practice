package testclasses;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


import testclasses.*;

public class dates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int day = cal.getTime().getDay();
		
		System.out.println("day--->>"+123+":"+day);
		
		
		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:sss");
        Date date = new Date();
        String sDate = sdf.format(date);	
        
        System.out.println("date--->>>"+sDate);
        DateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd");
        
        Date currentdate = DateConversion.convertDTToYYYYMMDD(DateConversion.getCurrentDateTime("Y", "2018-12-02")); //sanjeev-kumar 28-Dec-2018 fetching nextworkingdate
        
        System.out.println("cc paymentdate-->>"+outputFormatter.format(currentdate));
		
        
	}

}
