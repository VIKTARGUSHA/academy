package by.academy.Test6;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 implements Comparator<File>{
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
        String ss = s.replaceAll("\r", "");
        System.out.print(ss.toString());
        System.out.println("\n" + ss.length());
        File [] array;// = new File[ss.length()];
        array = file.listFiles();
      //  Arrays.sort(array, ((o1, o2) -> (int) o1.getName().charAt(0) - (int)(o2.getName().charAt(0)))) ;
Arrays.sort(array, Comparator.comparing((File o) -> (int)(o.getName().charAt(1)))
.thenComparing((File t) ->  (int)(t.getName().charAt(0))));
//        Arrays.sort(array, comparator1
        System.out.println((int)'.');

        for (File fileFile : file.listFiles()) {
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

//    Comparator<File> comparator1 = new Comparator<File>() {
        @Override
        public int compare(File o1, File o2) {
//            if ((int) o1.getName().charAt(0) > (int) o2.getName().charAt(0)) {
//                return 1;
//            }
//            if ((int) o1.getName().charAt(0) < (int) o2.getName().charAt(0)) {
//                return -1;
//            }
//            if ((int) o1.getName().charAt(0) == (int) o2.getName().charAt(0)) {
//                if ((int) o1.getName().charAt(1) > (int) o2.getName().charAt(1)) {
//                    return 1;
//                }
//                if ((int) o1.getName().charAt(1) < (int) o2.getName().charAt(1)) {
//                    return -1;
//                }
//                if ((int) o1.getName().charAt(1) < (int) o2.getName().charAt(1)) {
//                    return 0;
//                }
            return 0;
        }
    Comparator<File> comparator2 = (o1, o2) -> (Integer.valueOf(String.valueOf(o1.getName().charAt(0))).compareTo(Integer.valueOf(String.valueOf(o2.getName().charAt(0)))));
Comparator<File> comparator3 = Comparator.comparing(o-> Integer.valueOf(String.valueOf(o.getName().charAt(0))));
Comparator<File> comparator4 = comparator3.thenComparing(o -> o.getName().charAt(0));

}
