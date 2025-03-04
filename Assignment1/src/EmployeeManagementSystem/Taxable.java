package EmployeeManagementSystem;

public interface Taxable {
	
	double Tax_Rate = 0.20;
	
	double calculatedTax(double salary);
	

}
