package by.academy.Test2;

import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//Если таких слов несколько, найти первое из них.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = null;
        int valueMax = 0;
        String str = scanner.nextLine();
        //n = 5;
        String [] array = str.split(" ");
        for (int i = 0; i < 5; i++){
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
       if (counterResembles > valueMax){
           valueMax = counterResembles;
           target = array[i];
       }
    }
        System.out.println(target);
        scanner.close();
    }
}
