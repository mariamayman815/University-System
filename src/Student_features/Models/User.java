package src.Student_features.Models;

public class User {
    protected String username;
    protected String email;
    protected String password;
    protected String role;

//    Default Constructor
   public  User(){
        username="Unkown";
        password = "";
        email = "unknown@example.com";
    }
//    Parametarized Constructor
    User(String username,String password,String role,String email){
        this.username=username;
        this.password=password;
        this.role=role;
    }
//    Copy Constructor
    User(User u){
        this.username=u.username;
        this.password=u.password;
        this.email=u.email;
        this.role=u.role;
    }

//    Setters & Getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}