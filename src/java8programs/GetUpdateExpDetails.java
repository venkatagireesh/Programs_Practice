package java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetUpdateExpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 3));
        employees.add(new Employee(2, "Alice", 5));

        List<Experience> experiences = new ArrayList<>();
        experiences.add(new Experience(1, 5));
        experiences.add(new Experience(2, 7));
        
        Map<Integer, Integer> empMap = experiences.stream()
        		.collect(Collectors.toMap(Experience::getEmpId, Experience::getUpdatedExperience));
        System.out.println("Id&updated experience:"+empMap);
        
        List<Employee> updatedExpList = employees.stream()
        		.map(employee->{
        			int updateExp = empMap.get(employee.getId());
        			return new Employee(employee.getId(), employee.getName(), updateExp);})
        		.collect(Collectors.toList());
        System.out.println("updatedExpList:"+updatedExpList);
        		
        
        
        

	}
}

class Employee {
    private int id;
    private String name;
    private int oldExperience;

    public Employee(int id, String name, int oldExperience) {
        this.id = id;
        this.name = name;
        this.oldExperience = oldExperience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOldExperience() {
        return oldExperience;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", oldExperience=" + oldExperience + "]";
	}
    
    
    
}

class Experience {
    private int empId;
    private int updatedExperience;

    public Experience(int empId, int updatedExperience) {
        this.empId = empId;
        this.updatedExperience = updatedExperience;
    }

    public int getEmpId() {
        return empId;
    }

    public int getUpdatedExperience() {
        return updatedExperience;
    }
}
