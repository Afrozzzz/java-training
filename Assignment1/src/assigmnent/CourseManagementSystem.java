package assigmnent;
import java.util.*;

class CourseManagementSystem {
    private List<Course> courses = new LinkedList<>();
 
    //  here we are Adding Course (Technical / Non-Technical)
    public void addCourse(Course course) {
        courses.add(course);
    }
 
    //  now lets Sort courses by Fee (Ascending Order)
    public void sortCoursesByFee() {
        courses.sort(Comparator.comparingDouble(c -> c.fee));
    }
 
    //  Filter courses with duration > 4 weeks using Lambda & Streams
    public void filterLongDurationCourses() {
        courses.stream()
               .filter(course -> course.durationWeeks > 4)
               .forEach(System.out::println);
    }
 
    // Display all courses here
    public void displayCourses() {
        courses.forEach(System.out::println);
    }
}