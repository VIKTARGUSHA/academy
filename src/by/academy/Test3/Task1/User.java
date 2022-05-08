package by.academy.Test3.Task1;


import java.util.Scanner;

public class User {
    protected String name;
    protected int age;
    protected double money;
    private String dateOfBirth;
    private String phone;
    private String email;

    public User(String name, int age, double money, String dateOfBirth, String phone, String email) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public void getCheckMoney(double totalPrice) {
        if (totalPrice > money) {
            System.out.println("Buyer doesn't have enough money");
            return;
        } else {
            System.out.println("Buyer is rich");
        }
    }

    public double sallerSold(double fullPrice) {
        this.money += fullPrice;
        return money;
    }

    public double buyerPay(double fullPrice) {
        this.money -= fullPrice;
        return money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){this.name = name;}

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


