package EmployeeManagementSystem;


import java.util.Scanner;
 
class EMSApplication {
private static Employee[] employees;
private static int employeecount = 0;
	public static void main(String[] args) {
 
		Scanner sc =new Scanner(System.in);
		employees=new Employee[5];
		while (true) {
			System.out.println("\n Bank Application Menu:");
			System.out.println("1. create the Employee");
			System.out.println("2. display all the employess");
			System.out.println("3. Payroll info");
			System.out.println("4. request Leave");
			System.out.println("5.Exit");
			System.out.print("Enter Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				createEmployee(sc);
				break;
			case 2:
				displayEmployess();
				break;
			case 3:
				payRollInfo();
				break;
			case 4:
				requestLeave(sc);
				break;
 
			case 5:
				System.out.println("Thank You for using...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice type");
 
			}
 
		}
	}
	private static void requestLeave(Scanner sc) {
		if(employeecount==0) {
			System.out.println("no employees aviable to request leave");
			return;
		}
		
		try
		{
			System.out.println("enter empid to request leave");
			int id=sc.nextInt();
			System.out.println("enter the number of leave days");
			int days =sc.nextInt();
			boolean found =false;
			for(int i=0;i<employeecount;i++) {
				if(employees[i].getId()==id) {
					employees[i].requestLeaves(days);
					found=true;
					break;
				}
			}
			if(!found)
			{
				throw new Exception ("error:employee with id"+id+"not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("invalid input!"+e.getMessage());
			sc.nextLine();
		}
	}
//		System.out.println("Enter the id:");
//		int id =sc.nextInt();
//		System.out.println("Enter the leave days:");
//		int days =sc.nextInt();
//		for(int i=0;i<employeecount;i++) {
//			if(employees[i].getId()==id) {
//				employees[i].requestLeaves(days);
//				return;
//			}
//		}
//		System.out.println("Employee with id"+id+"not found:");
//	}
	private static void payRollInfo() {
for(int i=0;i<employeecount;i++) {
	 PayrollManager.generatePayroll(employees[i]);
}
	}
	private static void displayEmployess() {
   if(employeecount==0) {
	   System.out.println("no employess found");
	   return;
   }
   for(int i=0;i<employeecount;i++) {
	   employees[i].displayInfo();
   }
	}
	private  static void createEmployee(Scanner sc) {
		if(employeecount >= employees.length) {
			System.out.println("Employee limit reached");
		}
System.out.println("Here the list of Employee types:");
System.out.println("1.Full Time employee");
System.out.println("2.part Time employee");
System.out.println("3.Intern Employee");
System.out.println("4.manager");
System.out.println("choose the type of employee");
int type=sc.nextInt();
 
sc.nextLine();
System.out.println("Enter name:");
String name=sc.nextLine();
 
System.out.println("Enter the id:");
int id =sc.nextInt();
 
System.out.println("Enter department:");
String depart=sc.next();
System.out.println("Enter the basic Salary:");
double sal =sc.nextDouble();
System.out.println("Enter the Leave:");
int leaved =sc.nextInt();
 
 
switch(type) {
case 1:
	System.out.println("Enter the bonus:");
	double bonus=sc.nextDouble();
	sc.nextLine();
	employees[employeecount++] =new FullTimeEmployee(name,id,depart,sal,leaved,bonus);
	break;
case 2:
	System.out.println("Enter the hourly rate:");
	double hourlyRate=sc.nextDouble();
	System.out.println("Enter the hours worked:");
	int hoursWorked=sc.nextInt();
	employees[employeecount++] =new PartTimeEmployee(name,id,depart,sal,leaved,hourlyRate,hoursWorked);
	break;
case 3:
	System.out.println("Enter the stipend:");
	double stipen=sc.nextDouble();
	employees[employeecount++] =new InternEmployee(name,id,depart,sal,leaved,stipen);
	break;
case 4:
	System.out.println("Enter the bonus:");
	double bonusManager=sc.nextDouble();
	employees[employeecount++] =new FullTimeEmployee(name,id,depart,sal,leaved,bonusManager);
	default:
		System.out.println("invalid choice.");
}
System.out.println("Employee added successfulyy..");
 
	}
	}
