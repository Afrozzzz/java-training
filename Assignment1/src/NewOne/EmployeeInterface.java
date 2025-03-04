package NewOne;

public interface EmployeeInterface {
void  display();
double calSalary();
default void organnisze() {
	 System.out.println("all should follow the policy rules ,work time 9 to 6");
}
static void companyTagLine() {
	 System.out.println("tag line here ...");
}

}