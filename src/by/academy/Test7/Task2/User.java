package by.academy.Test7.Task2;


import java.util.Date;

public class User extends Person{
private String login;
private String password;
private String email;

    public User(String firstName, String lastName, int age, Date date, String login, String password, String email) {
        super(firstName, lastName, age, date);
        this.login = login;
        this.password = password;
        this.email = email;
    }
    public User(String a, String b){
        super();
        login = a;
        email = b;
    }

    public User(String a, String b, int age){
        super();
        login = a;
        email = b;
    }

    public User(){
        super();
    }

    public String printUserInfo() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private String loginAndEmail(){
        return login + " " + email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
