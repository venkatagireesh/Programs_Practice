package testclasses;

import java.util.HashSet;

import EmployeeDetials.Employee;

public class HashSetDuplicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> objset = new HashSet<>();
		Employee emp1 = new Employee("100", "svg", "100000");
		Employee emp2 = new Employee("100", "svg", "100000");
		
		objset.add(emp1);
		objset.add(emp2);
		
		System.out.println("object se-->>"+objset.size());

	}

}
