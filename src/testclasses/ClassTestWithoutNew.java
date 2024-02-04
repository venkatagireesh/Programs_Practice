package testclasses;

public class ClassTestWithoutNew {
	
	private ClassTestMethod classtestmethod;
	
	public ClassTestWithoutNew(ClassTestMethod classtestmethod) {
		
		this.classtestmethod = classtestmethod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method-->>");
		
		//ClassTestMethod classtestmethod = new ClassTestMethod();
		
		//classtestmethod.testmethod();
		
	}

}
