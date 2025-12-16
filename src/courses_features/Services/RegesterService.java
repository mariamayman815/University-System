package src.courses_features.Services;
import src.Student_features.Models.Admin;
import src.Student_features.Models.Instructor;
import src.Student_features.Models.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class RegesterService {
    // static method
    static Scanner input = new Scanner(System.in);
    public static void AdminReg(Admin admin){
        String username = input.next();
        String pass = input.next();
        if(admin.isequal(username,pass)){
//            then it will be an action;
        }
        else{
            System.out.println("who are u then?");
        }
    }
    public static void StudentReg(ArrayList<Student> student){
        String username = input.next();
        String pass = input.next();
        boolean found = false;
        for(int i=0;i<student.size();i++){
            if( username.equals(student.get(i).getUsername())&& pass.equals(student.get(i).getPassword()) ){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Who are u nigger?");
        }
    }
    public static void InstructorReg(ArrayList<Instructor> instructor){
        String username = input.next();
        String pass = input.next();
        boolean found = false;
        for(int i=0;i<instructor.size();i++){
            if( username.equals(instructor.get(i).getUsername())&& pass.equals(instructor.get(i).getPassword()) ){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Who are u nigger?");
        }
    }
}
