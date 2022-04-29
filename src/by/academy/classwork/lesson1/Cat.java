package by.academy.classwork.lesson1;

public class Cat {
    int age;
    String name;
    double money;
    String initials;
    boolean isHomeAnimal;
    public void grow(){
        age++;
    }
    public void sleep(){
        System.out.println("The cat assleep");
    }
    public void eat(){
        System.out.println("The cat is eating");
    }
    public void walk(){
        System.out.println("The cat is walking");
    }
    public Cat(){

    }
    public  Cat(String name){
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }
}
