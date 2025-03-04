package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements WorkHours {
private double hourlyRate;
private int hoursWorked;

 
	public PartTimeEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
 
public PartTimeEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays,double hourlyRate,int hoursWorked) {
	super(empname, empId, empDept, basicSalary, leaveDays);
	// TODO Auto-generated constructor stub
	this.hourlyRate = hourlyRate;
	this.hoursWorked = hoursWorked;
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
 
//@Override
//public int getWorkhours() {
//	// TODO Auto-generated method stub
//	return hoursWorked;
//}
 
@Override
double calculateSalary() {
	// TODO Auto-generated method stub
	return hourlyRate*hoursWorked;
}
 
@Override
String employeeType() {
	// TODO Auto-generated method stub
	return "Part time Employee";
}
 
@Override
void provideBenefits() {
	// TODO Auto-generated method stub
}

@Override
public int getWorkHours() {
	// TODO Auto-generated method stub
	return hoursWorked;
}
 
	
 
	
 
	

 
}