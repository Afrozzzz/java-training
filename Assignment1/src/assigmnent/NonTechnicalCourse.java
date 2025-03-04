package assigmnent;

class NonTechnicalCourse extends Course {
    public NonTechnicalCourse(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
        super(courseId, courseName, instructor, durationWeeks, fee);
    }
 
    @Override
    public double calculateDiscount() {
        return (fee > 15000) ? fee * 0.05 : 0;
    }
}
 