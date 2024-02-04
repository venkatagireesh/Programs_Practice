package testclasses;

public class StringReverse {
	public static void main(String[] args) {
		
		String str = "SANJAY";
		int iMax = str.length();
	
		System.out.println("String is-->>>"+str+"\nCount is-->>"+iMax);
		
		for (int i=iMax-1;i>=0;i--) 
		{
			System.out.println("char at "+i+" position--->>>"+str.charAt(i));
			//System.out.println(iMax);
			//String str2=;
		}
		
		String debac = "34543535";
	    String sURL = "https://192.168.10.135/WebRet_retmig/WebRetrieve.dll?Command=LoadForIntegration&&AccType=Account+Numner&AccNo";

	    sURL = sURL+"="+debac;
	    
	    System.out.println("sURL-->>"+sURL);
	    
	    StringBuilder sbcolumns = new StringBuilder();
	    
	    String columnsnames = sbcolumns.toString();
	    
	    System.out.println("columnsnames----->>>"+columnsnames);
	}
}
