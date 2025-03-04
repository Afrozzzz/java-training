package NewOne;

abstract class Employee {
private String empname;
private int empId;
private String empDept;
 

public String getEmpname() {
	return empname;
}
 
public void setEmpname(String empname) {
	this.empname = empname;
}
 
public int getEmpid() {
	return empId;
}
 
public void setEmpid(int empid) {
	this.empId = empid;
}
 
public String getEmpDept() {
	return empDept;
}
 
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
 
public Employee(String empname, int empid, String empDept) {
	super();
	this.empname = empname;
	this.empId = empid;
	this.empDept = empDept;
}
 
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
 
public void displayEmpDetails() {
	System.out.println(empname);
	System.out.println(empId);
	System.out.println(empDept);
}
abstract double calSalary();
public abstract boolean applyLeave(int days);
 
 
}