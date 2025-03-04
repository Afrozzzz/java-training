package NewOne;
 
public class PartTimei implements EmployeeInterface {
	 private String empname;
	 private int empId;
	 private String empDept;
	 private double hourlyRate;
		private int hoursWorked ;

		public PartTimei() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PartTimei(String empname, int empId, String empDept, double hourlyRate, int hoursWorked) {
			super();
			this.empname = empname;
			this.empId = empId;
			this.empDept = empDept;
			this.hourlyRate = hourlyRate;
			this.hoursWorked = hoursWorked;
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
		public double getHourlyRate() {
			return hourlyRate;
		}
		public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
		}
		public int getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		@Override
		public void display() {
			// TODO Auto-generated method stub
		}
		@Override
		public double calSalary() {
			return hourlyRate *hoursWorked;
		}
		@Override
		public  void organnisze() {
			 System.out.println("all should follow the policy rules ,work time :flexible");
		 }
}