package assigmnent;

import java.util.*;

abstract class Course {
    protected int courseId;
    protected String courseName;
    protected String instructor;
    protected int durationWeeks;
    protected double fee;
 
    public Course(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
        if (durationWeeks <= 0) throw new IllegalArgumentException("Duration must be greater than 0.");
        if (fee <= 0) throw new IllegalArgumentException("Fee must be greater than 0.");
 
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
        this.fee = fee;
    }
 
    public abstract double calculateDiscount();
 
    @Override
    public String toString() {
        return courseId + " - " + courseName + " | Instructor: " + instructor +
               " | Duration: " + durationWeeks + " weeks | Fee: $" + fee +
               " | Discounted Fee: $" + (fee - calculateDiscount());
    }
}