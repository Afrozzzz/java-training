import java.util.Scanner;

public class EmployeeRecords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Arrays to store employee data
        String[] names = new String[numEmployees];
        String[] addresses = new String[numEmployees];
        double[] salaries = new double[numEmployees];

        // Input employee details
        System.out.println("Enter employee details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Address: ");
            addresses[i] = sc.nextLine();
            System.out.print("Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine(); // Consume newline character
            System.out.println();
        }

        // Calculate and display salary after 3 months
        System.out.println("\nEmployee Salary Details (After 3 Months):");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-25s %-10s %-10s\n", "Name", "Address", "Salary", "Total");
        System.out.println("--------------------------------------------------");

        double totalSalaryPaid = 0;
        for (int i = 0; i < numEmployees; i++) {
            double salaryAfter3Months = salaries[i] * 3;
            System.out.printf("%-15s %-25s %-10.2f %-10.2f\n", names[i], addresses[i], salaries[i], salaryAfter3Months);
            totalSalaryPaid += salaryAfter3Months;
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("Total salary paid: %.2f\n", totalSalaryPaid);

        sc.close();
    }
}