package EmployeeDetials;

public class Employee1 {
	
	private String empName;
	private String id;
	private String gender;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee1 [empName=" + empName + ", id=" + id + ", gender=" + gender + "]";
	}
	
	

}
