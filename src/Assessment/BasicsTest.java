package Assessment;

public class BasicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 1.0/0;
		System.out.println("d value: "+d);
		
		//int a=50/0;
		//System.out.println(a);
		
		//System.out.println("");
		
		lable1:
		while(true){
			while(true){
					
				if("raju".equals("raju")){
					System.out.println("inside if");
					break lable1;
				}	
				System.out.println("11");
			}
			//System.out.println("22");
			//break;
		}
		System.out.println("out of while loops");

	}

}
