package testclasses;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {3,60,35,2,45,320,5};
		
		int arrLength = input.length;
		int temp;
		for(int i=0;i<arrLength;i++)
		{
			for(int j=i+1;j<arrLength;j++)
			{
				if(input[i]>input[j])
				{
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					
				}			
			}			
		}
		
		for(int i=0;i<arrLength;i++)
		{
			System.out.println(input[i]);
		}
		//System.out.println("Output-->>"+input);

	}

}
