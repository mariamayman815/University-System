package Models;

public class Student extends User{
    private String major;
    private int level;
    private int GPA;
    private int CGPA;

//    Default Constructor
    Student(){
        super();
        major="Unkown";
        level=0;
        GPA=0;
        CGPA=0;
    }

//    Parametraized Constructor
    public Student(User user,int level, String major, int GPA, int CGPA) {
        super(user);
        this.level = level;
        this.major = major;
        this.GPA = GPA;
        this.CGPA = CGPA;
    }

//    Setters & Getters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCGPA() {
        return CGPA;
    }

    public void setCGPA(int CGPA) {
        this.CGPA = CGPA;
    }
}