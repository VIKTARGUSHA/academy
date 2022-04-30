package by.academy.Test2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = null;
        int valueMax = 100;
        String str = scanner.nextLine();
        String [] array = str.split(" ");
        for (int i = 0; i < 10; i++){
        char [] arrayChar = array[i].toCharArray();
       char [] arrayUniqChar = new char[arrayChar.length];
       arrayUniqChar[0] = arrayChar[0];
       int counterResembles = 0;
       for (int j = 1; j < arrayChar.length; j++){

           for (int k = 0; k < arrayUniqChar.length; k++){
               if(arrayChar[j] == arrayUniqChar[k]){
                   break;
               }else if(k == arrayUniqChar.length-1){
                   counterResembles++;
                   arrayUniqChar[counterResembles] = arrayChar[i];
               }
           }
        }
       if (counterResembles < valueMax){
           valueMax = counterResembles;
           target = array[i];
       }
    }
        System.out.println(target);
        scanner.close();
    }
}
