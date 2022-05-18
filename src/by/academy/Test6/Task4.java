package by.academy.Test6;

import java.io.*;

public class Task4  {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\AdmiN\\academy\\src\\directory");
        file.mkdir();
        for (int i = 1; i < 101; i++) {
            File file1 = new File(file.getAbsolutePath(), i + ".txt");
            file1.createNewFile();
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
        for(File fileFile : file.listFiles()){
            int y = (int)(Math.random()*ss.length());
            FileWriter fileWriter = new FileWriter(fileFile);
            FileWriter fileWriter1 = new FileWriter("result.txt", true);
            String sss = ss.substring(0,y);
            fileWriter.write(sss);
            fileWriter.close();
            fileWriter1.write(fileFile.getName() + " " + fileFile.length() + "\n");
           // fileWriter1.write("");
            System.out.println();
            fileWriter1.close();
        }

    }
//    @Override
//    public int compareTo( String str ){
//        if((int)st.charAt(0) > ((int)str.charAt(0))){
//            return 1;
//        }else if((int)st.charAt(0) == ((int)str.charAt(0))){
//            return 0;
//        }else if((int)st.charAt(0) < ((int)str.charAt(0))){
//            return -1;
//        }
//    }

    @Override
    public int compare(String st, String str) {
        return 0;
    }
}