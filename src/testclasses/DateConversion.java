package testclasses;


import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;





public class DateConversion {
	
	
    public static String getCurrentDateTime(String getNextWorkingDateFromHolidayCaledar, String holidaycalendarDate) {
        //sanjeev-kumar 28-Dec-2018 below if condition is added to handle holiday date
        String sdate = "";
        getNextWorkingDateFromHolidayCaledar = "N";
        if (getNextWorkingDateFromHolidayCaledar != null && getNextWorkingDateFromHolidayCaledar.equalsIgnoreCase("Y"))
        {
            try 
            {
        		System.out.println("getCurrentDateTime going to fetch date from holiday table");
                if (holidaycalendarDate != null && !holidaycalendarDate.equalsIgnoreCase("") && !holidaycalendarDate.equalsIgnoreCase("null")) 
                {
                	System.out.println("1");
                    sdate = ConvertddMMMyyyy(holidaycalendarDate);
                }
                else
                {
                	System.out.println("2");
                    DateConversion dc = new DateConversion();

                    sdate = ConvertddMMMyyyy("2018-12-02");//format input yyyy-MM-dd
                    // Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(holidayCalendarDate);
                    // CommonUtilities.DebugMsg(holidayCalendarDate + "\t" + date1);
                    dc = null;
                }

            } 
            catch (Exception e) 
            {
            	System.out.println("Error while converting date "+ e);
            }

        } else {
            try {
            	SimpleDateFormat sdf1 = null;            
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
                sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                sdate = dateFormat.format(date);
                System.out.println("getCurrentDateTime:" + dateFormat.format(date));
            } catch (Exception e) {
            	System.out.println("Error while converting date-->>"+e);
            }
        }
        System.out.println("getCurrentDateTime returning:" + sdate);
        return sdate;
    }
    
    
 
    
    
    public static Date convertDTToYYYYMMDD(String datetime) {
        SimpleDateFormat sdf = null;
        SimpleDateFormat sdf1 = null;
        String convertedDate = "";
        Date newDate = null;
        try {
            sdf = new SimpleDateFormat("dd-MMM-yyyy");
            sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(datetime);
            convertedDate = sdf1.format(date);
            System.out.println("convertDTToYYYYMMDD convertedDate:" + convertedDate);
            newDate = sdf1.parse(convertedDate);
            System.out.println("convertDTToYYYYMMDD newDate:" + newDate);
        } catch (Exception e) {
        	System.out.println(e.toString());
        } finally {
            sdf = null;
            sdf1 = null;
        }
        return newDate;
    }    
    
    public static Date fetchDate(String datetime) {
        SimpleDateFormat sdf = null;
        SimpleDateFormat sdf1 = null;
        String convertedDate = "";
        Date newDate = null;
        try {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            Date date = sdf.parse(datetime);
            convertedDate = sdf1.format(date);
            newDate = sdf1.parse(convertedDate);

        } catch (Exception e) {
           System.out.println(e.toString());
        } finally {
            sdf = null;
            sdf1 = null;
        }
        return newDate;
    }    
    
    public static String ConvertddMMMyyyy(String datetime) {
        SimpleDateFormat sdf = null;
        SimpleDateFormat sdf1 = null;
        String convertedDate = "";
        try {
            sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(datetime);
            convertedDate = sdf1.format(date);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            sdf = null;
            sdf1 = null;
        }
        return convertedDate;
    }    
	
}
