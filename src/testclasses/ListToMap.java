package testclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import EmployeeDetials.Employee;

public class ListToMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Employee emp1 = new Employee ("1000","Gireesh","2000");
		Employee emp2 = new Employee ("1001","Alekhya","3000");
		Employee emp3 = new Employee ("1002","Sandeep","4000");
		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);

		HashMap<String,Employee> bmrlos = new HashMap<String,Employee>();
		
		for(Employee empdata: emplist)
		{
			bmrlos.put(empdata.getId(), empdata);
		}
		

		Employee e = bmrlos.get("1002");
		System.out.println(e.getName());
	}

}
