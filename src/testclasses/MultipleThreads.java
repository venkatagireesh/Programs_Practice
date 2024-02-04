package testclasses;

public class MultipleThreads extends Thread {

	public void run()
	{
		System.out.println("Inside Thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		while(true)
		{
			for(int i=0;i<4;i++)
			{
				MultipleThreads t1 = new MultipleThreads();
				System.out.println("Thread # "+i);
				t1.start();
				System.out.println("thread ends-->>"+i);
			}

		}

	}

}
