package by.academy.Test6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VAbukhovich\\IdeaProjects\\academy\\src\\directory");
        file.mkdir();
        for (int i = 1; i < 101; i++) {
            File file1 = new File(file.getAbsolutePath(), i + ".txt");
            file1.createNewFile();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\VAbukhovich\\IdeaProjects\\academy\\src\\Test6Task2file.txt"));
        String s = "";
        int x;
        while ((x = bufferedReader.read()) != -1) {
            s += String.valueOf((char) x);
        }
        bufferedReader.close();
        System.out.print(s.replace("\r", "O").toString());
        System.out.println(s.length());
    }
}