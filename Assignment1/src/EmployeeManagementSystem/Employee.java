package EmployeeManagementSystem;


abstract class Employee implements Person {
	protected String empname;
	protected int empId;
	 protected String empDept;
	 protected double basicSalary;
	 protected int leaveDays;
	 public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empname, int empId, String empDept, double basicSalary, int leaveDays) {
		super();
		this.empname = empname;
		this.empId = empId;
		this.empDept = empDept;
		this.basicSalary = basicSalary;
		this.leaveDays = leaveDays;
	}
 
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	abstract double calculateSalary();
	 abstract String employeeType();
	 abstract void provideBenefits();
	 public boolean requestLeaves(int days) {
			if(days>0 && days<=leaveDays) {
				leaveDays -= days;
				System.out.println("Leaves approved "+days);
				return true;
			}else {
				System.out.println("No Leaves provided for u");
				return false;
			}

		}

     @Override
	public void displayInfo() {
		 System.out.println("------------------------");
		 System.out.println("EmpName:"+empname+"EmpId:"+empId+"Employee Department:"+empDept);
		 System.out.println("EmployeeType:"+employeeType());
		 System.out.println("Employee salary:"+calculateSalary());
		 System.out.println("Leave balance:"+leaveDays);
		 provideBenefits();
	 }


}