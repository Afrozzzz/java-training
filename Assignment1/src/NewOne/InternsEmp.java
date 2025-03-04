package NewOne;


public class InternsEmp extends Employee {
	private double stipend;
	private int LeaveDays;
	public double getStipend() {
		return stipend;
	}
 
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
 
	public InternsEmp() {
		super();
	}
 
	public InternsEmp(String empname, int empid, String empDept,double stipend, int LeaveDays) {
		super(empname, empid, empDept);
		this.stipend=stipend;
		this.LeaveDays=LeaveDays;
	}
 
	@Override
	double calSalary() {
		return stipend;
	}
 
	public int getLeaveDays() {
		return LeaveDays;
	}
 
	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
	@Override
	public boolean applyLeave(int days) {
		if(days<=3 &&days>0 && days<=LeaveDays) {
			LeaveDays -= days;
			return true;
		}else {
			System.out.println("no leave");
			return false;
		}
	}
	}