package by.academy.Test7.Task2;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date date;
    public Person(String firstName, String lastName, int age, Date date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

public Person(){

}

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
