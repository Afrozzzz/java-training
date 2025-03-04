package assigmnent;
import java.util.*;3
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseManagementSystem cms = new CourseManagementSystem();
 
        System.out.print("Enter number of courses: ");
        int n = scanner.nextInt();
        scanner.nextLine();  
 
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nEnter details for Course " + (i + 1) + ":");
                System.out.print("Course ID: ");
                int courseId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
 
                System.out.print("Course Name: ");
                String courseName = scanner.nextLine();
 
                System.out.print("Instructor Name: ");
                String instructor = scanner.nextLine();
 
                System.out.print("Duration (weeks): ");
                int durationWeeks = scanner.nextInt();
 
                System.out.print("Fee: ");
                double fee = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
 
                System.out.print("Course Type (Technical/Non-Technical): ");
                String type = scanner.nextLine();
 
                if (type.equalsIgnoreCase("Technical")) {
                    cms.addCourse(new TechnicalCourse(courseId, courseName, instructor, durationWeeks, fee));
                } else if (type.equalsIgnoreCase("Non-Technical")) {
                    cms.addCourse(new NonTechnicalCourse(courseId, courseName, instructor, durationWeeks, fee));
                } else {
                    System.out.println("Invalid Course Type! Skipping this entry.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " Skipping this entry.");
            }
        }
 
        System.out.println("\nAll Courses:");
        cms.displayCourses();
 
        System.out.println("\nCourses Sorted by Fee:");
        cms.sortCoursesByFee();
        cms.displayCourses();
 
        System.out.println("\nCourses with Duration > 4 weeks:");
        cms.filterLongDurationCourses();
 
        scanner.close();
    }
}