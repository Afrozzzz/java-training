package Java8Features;

public class Employee {
	private String name;
	private String empID;
	public Employee(String name) {
		this.name = name;
		System.out.println("Employee Created "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
		System.out.println("---------------------");
	}
 

}