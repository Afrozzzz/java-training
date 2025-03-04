package NewOne;
 
public class EmployeeManagmentSystem {
 
	public static void main(String[] args) {
//  Employee em=new Employee();
		FullTimei f1=new FullTimei("rahul",7203,"IT",50000,3000);
		f1.organnisze();
		EmployeeInterface.companyTagLine();
//		System.out.println("leave for full time is:"+f1.calSalary());
//		PartTimeEmp p1=new PartTimeEmp("rahul",7203,"IT",20,6,0);
//		System.out.println("leave for part time is:"+p1.applyLeave(0));
//		InternsEmp i1=new InternsEmp("rahul",7203,"IT",50000,3);
//		System.out.println("leave for intern  is:"+i1.applyLeave(3));
		PartTimei p1=new PartTimei("rahul",7203,"IT",20,6);
		p1.organnisze();
		internsi i1=new internsi("rahul",7203,"IT",50000);
		i1.organnisze();
	}
}