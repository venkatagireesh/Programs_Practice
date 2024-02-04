package java8programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import EmployeeDetials.Employee3;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		
		List<Employee3> emplist = new ArrayList<>();
		
		emplist.add(new Employee3(1, "sakala", "gireesh", 31, 90000));
		emplist.add(new Employee3(2, "sakala", "bhavani", 26,70000));
		emplist.add(new Employee3(3, "sakala", "venkat",32, 65000));
		emplist.add(new Employee3(4, "konidela", "charan",39, 120000));
		emplist.add(new Employee3(5, "konidela", "klinkara", 2, 10000));
		emplist.add(new Employee3(6, "konidela", "upasana",35, 98000));
		emplist.add(new Employee3(7, "sakala", "svg",25, 99000));
		emplist.add(new Employee3(8, "kotha", "srav",26, 87000));
		emplist.add(new Employee3(9, "kotha", "sam", 31, 87500));
		
		//System.out.println(emplist);
		
		//employee's by id
		System.out.println("-----employee's by id-----");
		Map<Integer, Employee3> empMap = emplist.stream()
					.collect(Collectors.toMap(Employee3::getEmpId, Function.identity()));
		System.out.println(empMap);
		System.out.println();
		
		//group by firstname
		System.out.println("----group by firstname----");
		Map<String, List<Employee3>> grpEmpMap = emplist.stream()
					.collect(Collectors.groupingBy(Employee3::getFirstName));
		System.out.println(grpEmpMap);
		System.out.println();
		
		//list all the salaries sorting
		System.out.println("----list all the salaries sorting----");
		List<Double> salariesList = emplist.stream().map(emp->emp.getSalary()).collect(Collectors.toList());
		Collections.sort(salariesList);
		System.out.println(salariesList);
		System.out.println();
		
		//get the nth highest salary from details
		System.out.println("---3rd hihgest salary-----");
		List<Employee3> empsalList = emplist.stream()
				.sorted(Comparator.comparingDouble(Employee3::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(empsalList.get(2));
		System.out.println();
				
		//sort the details by lastname
		System.out.println("---sort the details by lastname----");
		List<Employee3> sortedEmpListByLName = emplist.stream()
				.sorted(Comparator.comparing(Employee3::getLastName))
				.collect(Collectors.toList());
		System.out.println(sortedEmpListByLName);
		System.out.println();
				
				
		//employee details whose first name is same and age>30
		System.out.println("--employee details whose first name is same and age>30---");
		Map<String, List<Employee3>> empMap1 = emplist.stream().filter(emp->emp.getAge()>30)
				.collect(Collectors.groupingBy(Employee3::getFirstName));
		//System.out.println(empMap1);

		Map<String, List<Employee3>> empMap2 = empMap1.entrySet().stream()
				.filter(entry->entry.getValue().size()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(empMap2);
		
		

	}

}
