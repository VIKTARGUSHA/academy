package by.academy.Test4.Task3;

import java.util.Arrays;

public class MainIterator {
    public static void main(String[] args) {
        String [] array = new String []{"H", "e", "l", "l", "o"," " , "W", "o", "r", "l", "d"};
        Iterators <String> iterators = new Iterators(array);
        System.out.println(iterators.hasNext());
        System.out.println(Arrays.toString(array));
        while (iterators.hasNext()){
            String s = iterators.next();
           // System.out.print(s + " ");

            if("l".equals(s)){
                iterators.remove();
            }
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}
