package by.academy.Test6.Task3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Ivan", "Ivanov", 18));
        arrayList.add(new User("Petr", "Petrov", 19));
        arrayList.add(new User("Christ", "Grozev", 48));
        arrayList.add(new User("Pavel", "Pavlov", 49));
        arrayList.add(new User("Igor", "Talkov", 110));
        arrayList.add(new User("Andrei", "Vorobei", 11));
        arrayList.add(new User("Jack", "Vorobei", 35));
        arrayList.add(new User("Jack", "Dowsun", 20));
        arrayList.add(new User("Patrick", "Suazy", 33));
        arrayList.add(new User("Danila", "Bodrov", 22));
        File file = new File("C:\\Users\\AdmiN\\academy\\users");
        file.mkdir();
        for (User user : arrayList){
            File file1 = new File("C:\\Users\\AdmiN\\academy\\users", user.getName()+user.getSurName()+".txt");
            file1.createNewFile();
        }
    }
}
