//package Models;
package src.Student_features.Models;
import java.util.ArrayList;
//import java.lang;

public class Admin extends User{
    private ArrayList<String> permissions;
//    Default Constructor
    public Admin(){
        super();
        permissions = new ArrayList<>();
    }
//    Parameterized constructor
    public Admin(ArrayList<String> permissions) {
        this.permissions = permissions;
    }
//    Setters & Getters
    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }
}