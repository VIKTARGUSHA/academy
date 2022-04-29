package by.academy.classwork.lesson1;

public class Application {
    public static void main(String[] args) {
Cat cat = new Cat();
Cat cat1 = new Cat("Barsik");
cat1.sleep();
cat1.eat();
cat1.walk();
cat.grow();
cat.grow();
cat.grow();
        System.out.println(cat.age);
    }
}
