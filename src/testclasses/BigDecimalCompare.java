package testclasses;

import java.math.BigDecimal;

public class BigDecimalCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal odOutstandingamt = new BigDecimal(0);
		
        if(odOutstandingamt.compareTo(new BigDecimal(0))<=0)
        {
        	System.out.println("negative or 0");
        }
        else
        {
        	System.out.println("Greater than 0");
        }

	}

}
