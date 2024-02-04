package Assessment;


class Person {
	public Person(String name) {
		System.out.println(name);
	}
}

public class Student extends Person{

	public Student(String name) {
		super(name);
	}

	public static void main(String[] args) {

		new Person("Bob");
	}

}
