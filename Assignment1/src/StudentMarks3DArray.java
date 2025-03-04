import java.util.Scanner;

public class StudentMarks3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for dimensions
        System.out.print("Enter the number of students: ");
        int numStu = sc.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSub = sc.nextInt();
        System.out.print("Enter the number of years: ");
        int numYears = sc.nextInt();

        int[][][] marks = new int[numStu][numSub][numYears]; // 3D array to store marks

        // Input marks for each student, subject, and year
        System.out.println("\nEnter the marks for each student:");
        for (int i = 0; i < numStu; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int k = 0; k < numYears; k++) {
                System.out.println("Year " + (k + 1) + ":");
                for (int j = 0; j < numSub; j++) {
                    while (true) {
                        System.out.print("Enter marks for Subject " + (j + 1) + " (0-100): ");
                        int mark = sc.nextInt();
                        if (mark >= 0 && mark <= 100) {
                            marks[i][j][k] = mark;
                            break;
                        } else {
                            System.out.println("Invalid input! Please enter marks between 0 and 100.");
                        }
                    }
                }
            }
        }

        // Display marks and percentages in a structured format
        System.out.println("\nStudent Marks and Percentage Details:");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Year", "Subject 1", "Subject 2", "Subject 3", "Percentage");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < numStu; i++) {
            for (int k = 0; k < numYears; k++) {
                int totalMarks = 0;
                System.out.printf("%-10s %-10s", "Student " + (i + 1), "Year " + (k + 1));

                for (int j = 0; j < numSub; j++) {
                    System.out.printf("%-10d", marks[i][j][k]);
                    totalMarks += marks[i][j][k];
                }

                double percentage = (double) totalMarks / (numSub * 100) * 100;
                System.out.printf("%-10.2f%%\n", percentage);
            }
            System.out.println("----------------------------------------------------------------------------");
        }

        sc.close(); // Close scanner
    }
}