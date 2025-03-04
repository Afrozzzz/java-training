package assigmnent;

class TechnicalCourse extends Course {
    public TechnicalCourse(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
        super(courseId, courseName, instructor, durationWeeks, fee);
    }
 
    @Override
    public double calculateDiscount() {
        return (fee > 20000) ? fee * 0.10 : 0;
    }
}
 