package EmployeeDetials;

public class Employee3 {
	
	private int empId;
	private String firstName;
	private String LastName;
	private int age;
	private double salary;

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
			
	
	public Employee3(int empId, String firstName, String lastName, int age, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee3 [empId=" + empId + ", firstName=" + firstName + ", LastName=" + LastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}

	
	
	

}
