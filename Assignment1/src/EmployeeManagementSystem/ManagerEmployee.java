package EmployeeManagementSystem;

public class ManagerEmployee extends FullTimeEmployee implements BonusProvider {
	 
	public ManagerEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public ManagerEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays, double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays, bonus);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public double calSalary(double salary) {
		// TODO Auto-generated method stub
		return salary *Bonus_Percentage;
	}
 
}