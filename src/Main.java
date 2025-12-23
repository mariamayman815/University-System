package src;
import src.Student_features.Models.Admin;
import src.Student_features.Models.Instructor;
import src.Student_features.Models.Student;
import src.courses_features.Services.RegesterService;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
//    public static void AdminReg(Admin admin){
//        String username = input.next();
//        String pass = input.next();
//        if(admin.isequal(username,pass)){
////            then it will be an action;
//        }
//        else{
//            System.out.println("who are u then?");
//        }
//    }
//    public static void StudentReg(ArrayList<Student> student){
//        String username = input.next();
//        String pass = input.next();
//        boolean found = false;
//        for(int i=0;i<student.size();i++){
//            if( username.equals(student.get(i).getUsername())&& pass.equals(student.get(i).getPassword()) ){
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println("Who are u nigger?");
//        }
//    }
//
//    public static void InstructorReg(ArrayList<Instructor> instructor){
//        String username = input.next();
//        String pass = input.next();
//        boolean found = false;
//        for(int i=0;i<instructor.size();i++){
//            if( username.equals(instructor.get(i).getUsername())&& pass.equals(instructor.get(i).getPassword()) ){
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println("Who are u nigger?");
//        }
//    }

//    1 ) Amal 555
//    get(id-1) => get(0) , student.get(0).getName()
    public static void main(String[] args){
        // lists for people
        ArrayList<Student>student = new ArrayList<>();
//        student.get().;
        ArrayList<Instructor>instructor = new ArrayList<>();
        Admin admin = new Admin("Admin123","123","Admin","admin@example.com",1);
        System.out.println("\t\tWelcome to Uni System");
        System.out.println("\t\t---------------------");
        System.out.println("who are u?");
        System.out.println("1)Admin");
        System.out.println("2)Student");
        System.out.println("3)Instructor");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                RegesterService.AdminReg(admin);
                break;
            case 2:
                RegesterService.StudentReg(student);
                break;
            case 3:
                RegesterService.InstructorReg(instructor);
                break;
            default:
                System.out.println("wrong choice nigger !");
        }


    }
}
