package NewOne;
 
public class PartTimeEmp extends Employee {
	private double hourlyRate;
	private int hoursWorked ;
	private int LeaveDays;
	public PartTimeEmp() {
		super();
	}
 
	public PartTimeEmp(String empname, int empid, String empDept,double rate,int hours,int LeaveDays ) {
		super(empname, empid, empDept);
		this.hourlyRate=rate;
		this.hoursWorked=hours;
		this.LeaveDays=LeaveDays;
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
	double calSalary() {
		return hourlyRate *hoursWorked;
	}
	@Override
	public boolean applyLeave(int days) {
		System.out.println("no leave for part time employee");
		return false;
	}
 
	public int getLeaveDays() {
		return LeaveDays;
	}
 
	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
 
 
}