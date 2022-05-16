package by.academy.Test6;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("result.txt");
        FileReader fileReader = new FileReader("C:\\Users\\AdmiN\\academy\\src\\Test6Task2file.txt");
        FileWriter fileWriter = new FileWriter(file);
        String s = String.valueOf((char)fileReader.read());

        int i;
        while ((i = fileReader.read()) != -1){
            s += String.valueOf((char) i);
        }
        String s1 = s.replaceAll(" ", "");

        fileWriter.write(s1);

        fileWriter.close();
        fileReader.close();
    }
}
