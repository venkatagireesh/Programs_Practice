package Assessment;



public class ThreadExample extends Thread{
	
	public void run() {
		System.out.println("isnide run method");
		int i=0;
		int num=0;
		for( i=0;i<100;i++) {
			
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}				
			}
			if(count==2) {
				System.out.print(i +" ,");
			}
		}		
	}

	public static void main(String[] args) {
		//System.out.println("inside main method...");
		ThreadExample t = new ThreadExample();
		t.start();

	}

}
