public class Enrollment {
    private int enrollmentid;
    private int courseid;
    private int studentid;

    public Enrollment() {
    }

    public Enrollment(int courseid, int enrollmentid, int studentid) {
        this.courseid = courseid;
        this.enrollmentid = enrollmentid;
        this.studentid = studentid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getEnrollmentid() {
        return enrollmentid;
    }

    public void setEnrollmentid(int enrollmentid) {
        this.enrollmentid = enrollmentid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "courseid=" + courseid +
                ", enrollmentid=" + enrollmentid +
                ", studentid=" + studentid +
                '}';
    }
}