package Assessment;


class Employee {
	public void display() {
		System.out.println(" display ");
	}
	public void print(int age) {
		System.out.println(" Employee ");
	}
}


public class Trainee extends Employee {
	
	public void display (String name) {
		System.out.println(name);
	}
	
	public void print (int age) {
		System.out.println(" Trainee ");
		//return age;
	}

	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		trainee.display();
		trainee.display("Bob");
		trainee.print(10);

	}

}
