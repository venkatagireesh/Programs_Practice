package Assessment;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a ={3,1,10,-1,0,2,30,12,31,7,5};
		
		
		for(int j=0;j<a.length;j++) {
			
			int num = a[j];
			boolean flag=true;
			if(num<=1) {
				flag=false;
			}
			
			for(int i=2;i<num;i++) {
				if(num%i==0) {					
					flag=false;
				}				
			}
			if(flag) {
				System.out.println(num);
			}
			
		}

	}

}
