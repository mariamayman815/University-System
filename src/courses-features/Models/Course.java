import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Course {

    private int id;
    private String name ;
    private int instructorId;
    private ArrayList<Integer> studentIds;


    public Course() {
        this.name="not set yet";
        this.studentIds = new ArrayList<>();
    }

    public Course(int id , String name , int instructorId) {
        this.id = id;
        this.name = name;
        this.instructorId = instructorId;
        this.studentIds = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(ArrayList<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return " Course Information \n " + id +")" + name+
                "Instructor Id :  " + instructorId;

    }
//    here will be an exceptions if entered course name is null or ids are negatives
}