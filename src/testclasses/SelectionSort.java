package testclasses;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {9,14,3,2,43,11,58,22};
		
		for(int i=0;i<input.length-1;i++)
		{
			int index = i;
			
			for(int j=i+1;j<input.length;j++)
			{
				if(input[j]<input[index])
				{
					index = j;
				}				
			}
			int smallnum = input[index];
			input[index] = input[i];
			input[i] = smallnum;					
		}
		System.out.print("Sorted array:");
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}		
	}

}
