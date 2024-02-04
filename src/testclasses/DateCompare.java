package testclasses;

public class DateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chkdate = "2015-12-27"; 
		String creationdate = "2018-06-19";
		
		if(creationdate.compareTo(chkdate)>0)
		{
			System.out.println("after");
		}
		else
		{
			System.out.println("before");
		}
	}

}
