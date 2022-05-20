package by.academy.Test6;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 implements Comparator<File>{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\AdmiN\\academy\\src\\directory");
        file.mkdir();

        for (int i = 1; i < 101; i++) {
            if (i < 10) {
                File file1 = new File(file.getAbsolutePath(), "0" + i + ".txt");
                 file1.createNewFile();
            } else {
                File file2 = new File(file.getAbsolutePath(), i + ".txt");
                file2.createNewFile();
           }
            }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\AdmiN\\academy\\src\\Test6Task2file.txt"));
        String s = "";
        int x;
        while ((x = bufferedReader.read()) != -1) {
            s += String.valueOf((char) x);
        }
        bufferedReader.close();
        String ss = s.replaceAll("\r", "");
        System.out.print(ss.toString());
        System.out.println("\n" + ss.length());
        File [] array;// = new File[ss.length()];
        array = file.listFiles();
      //  Arrays.sort(array, ((o1, o2) -> (int) o1.getName().charAt(0) - (int)(o2.getName().charAt(0)))) ;
Arrays.sort(array, Comparator.comparing((File o) -> o.getName().substring(0,3).replaceAll("[^\\d]", "").length())//(int)(o.getName().charAt(0)))
.thenComparing((File t) ->  (int)(t.getName().charAt(0))).thenComparing((File t) ->  (int)(t.getName().charAt(1))));

        System.out.println((int)'.');
        System.out.println(Arrays.toString(array));
        FileWriter fileWriter2 = new FileWriter("result.txt", false);
        fileWriter2.write("");
        for (File fileFile : array) {
            int y = (int) (Math.random() * ss.length());
            FileWriter fileWriter = new FileWriter(fileFile);
            FileWriter fileWriter1 = new FileWriter("result.txt", true);
            String sss = ss.substring(0, y);
            fileWriter.write(sss);
            fileWriter.close();
            fileWriter1.write(fileFile.getName() + " " + fileFile.length() + "\n");
            // fileWriter1.write("");
            System.out.println();
            fileWriter1.close();
        }
    }

        @Override
        public int compare(File o1, File o2) {
            return 0;
        }
}
