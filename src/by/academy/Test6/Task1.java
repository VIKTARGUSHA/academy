package by.academy.Test6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("Test6Task1file.txt");
        while (scanner.hasNext()){
            String s = scanner.next();
            if(!s.equals("stop")){
fileWriter.write(s+" ");
            }else break;
        }
        scanner.close();
        fileWriter.close();
    }
}
