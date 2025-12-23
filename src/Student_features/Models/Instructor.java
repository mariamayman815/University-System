//package Models;
package src.Student_features.Models;
import java.util.ArrayList;

public class Instructor extends User{
    private int officeNumber;
    private ArrayList<String> coursesTaught;

//    Default constructor
    public Instructor() {
        super();
        this.role="Instructor";
        coursesTaught = new ArrayList<>();
        officeNumber = 0;
    }
//    Parameterized constructor
    public Instructor(User user,int officeNumber,ArrayList<String> coursesTaught){
        super(user);
        this.officeNumber=officeNumber;
        this.coursesTaught=coursesTaught;
    }
//    Setters & Getters
    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public ArrayList<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}