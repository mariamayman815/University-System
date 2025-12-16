//package Models;
package src.Student_features.Models;
import java.util.ArrayList;
//import java.lang;

public class Admin extends User{
//    Default Constructor
    public Admin(){
        super();
        this.role = "Admin";
    }
    public Admin(String username, String password, String role, String email, int id) {
        super(username, password, role, email, id);
    }
    public boolean isequal(String username , String password){
        if(this.username.equals(username) && this.password.equals(password))
            return true;
        else
            return false;
    }

}