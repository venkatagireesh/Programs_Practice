package testclasses;

public class EmailMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "venkata.gireesh@newgen.co.in";			
		
		int at = email.lastIndexOf("@");
		
		String str[] = email.split("@");
		
		String emailID = str[0];
		String symbol = "@";
		String stars = "*";
		String domainName = str[1];
		emailID = emailID+"@";
		String maskedEmail = emailID.replaceAll("(?<=.{1}).(?=[^@]*?.@)", "*");
		//System.out.println("masked first part--->>>"+maskedEmail);
		
		int dot = domainName.indexOf(".");
		String domain = domainName.substring(1, dot-1);		
		//System.out.println("domain--->>"+domain);
		int domainsize = domain.length();		
		for(int i=0;i<domainsize-1;i++)
		{
			stars = stars+"*";
		}		
		
		domainName = domainName.replace(domain, stars);
		//System.out.println("domainName--->>>"+domainName);
		
		maskedEmail = maskedEmail+domainName;
		System.out.println("Email--->>>"+email);
		System.out.println("maskedEmail--->>>"+maskedEmail);
		
		
/*		String domaiName = email.substring(at);
		int dot = domaiName.indexOf(".");
		
		System.out.println("email--->>>"+email);
		String domain = email.substring(at+2, dot-1);
		
		int domainsize = domain.length();
		String stars = "*";
		
		for(int i=0;i<domainsize-1;i++)
		{
			stars = stars+"*";
		}
		
		maskedEmail = maskedEmail.replace(domain, stars);
		System.out.println("masked email--->>>"+maskedEmail);*/

	}

}
