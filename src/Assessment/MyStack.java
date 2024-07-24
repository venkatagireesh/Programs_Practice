package Assessment;

public class MyStack {
	
	
	//push(10),pop(),isEmpty()
	private int arr[];
	private int size;
	
	public MyStack(int[] arr, int size) {
		super();
		this.arr = arr;
		this.size = size;
	}

	
	public void push(int number) {
		arr[size] = number;				
	}
	
	public int pop() {
		
		
		int number = arr[arr.length];
		
		
		return number;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		
		for(int i=0;i<10;i++) {
			
				
			}
		

		
		return result;
		
	}
	
	

}
