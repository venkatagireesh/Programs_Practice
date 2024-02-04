package java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import EmployeeDetials.Employee1;
import EmployeeDetials.MaleObject;

public class Java8MapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 emp1 = new Employee1();
		emp1.setEmpName("name1");
		emp1.setGender("Male");
		emp1.setId("1");
		
		Employee1 emp2 = new Employee1();
		emp2.setEmpName("name2");
		emp2.setGender("Female");
		emp2.setId("2");
		
		Employee1 emp3 = new Employee1();
		emp3.setEmpName("name3");
		emp3.setGender("Male");
		emp3.setId("3");
		
		Employee1 emp4 = new Employee1();
		emp4.setEmpName("name4");
		emp4.setGender("Female");
		emp4.setId("4");	
		
		List<Employee1> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);

		
		List<MaleObject> malelist = emplist.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male")).
				map(maleobj->new MaleObject(maleobj.getEmpName(),maleobj.getGender(),maleobj.getId())).collect(Collectors.toList());									
				
		System.out.println(malelist);
	}

}
