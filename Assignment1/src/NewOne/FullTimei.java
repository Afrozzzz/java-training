package NewOne;

public class FullTimei implements EmployeeInterface {
	 private String empname;
	 private int empId;
	 private String empDept;
	 private double basicSal;
		private double bonus;

		public FullTimei(String empname, int empId, String empDept, double basicSal, double bonus) {
			super();
			this.empname = empname;
			this.empId = empId;
			this.empDept = empDept;
			this.basicSal = basicSal;
			this.bonus = bonus;
		}
		public FullTimei() {
			super();
			// TODO Auto-generated constructor stub
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
		public double getBasicSal() {
			return basicSal;
		}
		public void setBasicSal(double basicSal) {
			this.basicSal = basicSal;
		}
		public double getBonus() {
			return bonus;
		}
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		@Override
		public void display() {
System.out.println("running..");			
		}
		@Override
		public double calSalary() {
			return basicSal+bonus;
		}
		 public void organnisze() {
			 System.out.println("all should follow the policy rules ,work time 9 to 6");
		 }
}