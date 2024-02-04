package testclasses;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal ageval = new BigDecimal(0);
		String ageinmonths = "321.35483870967741";
		
		ageval = ageval.add(new BigDecimal(ageinmonths),MathContext.DECIMAL32);
		ageval = ageval.divide(new BigDecimal("12"),MathContext.DECIMAL32);
		ageval = ageval.setScale(0, RoundingMode.CEILING);
		System.out.println("ageval-->>"+ageval);
		
		
		BigDecimal tenor = new BigDecimal(0);
		
		//tenor = tenor.add(new BigDecimal(452));
		//tenor = tenor.setScale(0);
		//System.out.println("tenor-->>"+tenor);
		
		String val = "48000.0";
		
		
		val = val.replaceAll("\\.0*$", "");
		
		System.out.println("val-->>"+val);

	}

}
