package testclasses;

import java.io.FileNotFoundException;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("before throw");
			
			throw new FileNotFoundException ("while throw");
			
			//System.out.println("after throw");
		}

		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFoundException-");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}		

	}

}
