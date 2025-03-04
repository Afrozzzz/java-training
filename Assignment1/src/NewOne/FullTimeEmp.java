package NewOne;

public class FullTimeEmp extends Employee {
	private double basicSal;
	private double bonus;
	private int LeaveDays;
	public FullTimeEmp() {
		super();
	}
 
	public FullTimeEmp(String empname, int empid, String empDept,double basicSal,double bonus,int LeaveDays) {
		super(empname, empid, empDept);
		this.basicSal=basicSal;
		this.bonus=bonus;
		this.LeaveDays=LeaveDays;
	}
 
	public int getLeaveDays() {
		return LeaveDays;
	}
 
	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
 
	@Override
	double calSalary() {
		return basicSal+bonus;
	}
	@Override
	public boolean applyLeave(int days) {
		if(days>0 && days<=getLeaveDays()) {
			setLeaveDays(getLeaveDays() - days);
			return true;
		}
		return false;
	}
 
}