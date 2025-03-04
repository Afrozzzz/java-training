package EmployeeManagementSystem;



public class InternEmployee extends Employee {

private double stipend;
 
	public InternEmployee() {

	super();

	// TODO Auto-generated constructor stub

}
 
public InternEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays,double stipend) {

	super(empname, empId, empDept, basicSalary, leaveDays);

	// TODO Auto-generated constructor stub

	this.stipend=stipend;

}
 
@Override

public String getName() {

	// TODO Auto-generated method stub

	return empname;

}
 
@Override

public int getId() {

	// TODO Auto-generated method stub

	return empId;

}
 
@Override

double calculateSalary() {

	// TODO Auto-generated method stub

	return stipend;

}
 
@Override

String employeeType() {

	// TODO Auto-generated method stub

	return "Intern Emploee";

}
 
@Override

void provideBenefits() {

	// TODO Auto-generated method stub

}
 
	

}

 