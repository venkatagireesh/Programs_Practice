package testclasses;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String input = in.nextLine();
		
		int len = input.length();
		
		int count = 0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				System.out.println("SubString:"+input.substring(i, j));
				
				String temp = input.substring(i,j);
				StringBuilder sb= new StringBuilder(temp);
				//sb = sb.append(temp);
				sb = sb.reverse();				
				String rev = sb.toString();
				
				//System.out.println("rev-->>"+rev);
				
				if(temp.equals(rev))
				{
					System.out.println("Palindrome subString:"+temp);
					count++;
				}
				
				//sb=null;
			}
			
		}
		System.out.println("Total Palindromes are:"+count);
	}

}
