package by.academy.Test2.Task4;

//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n
//игроков (по 5 карт каждому) из рассортированной колоды.
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] cardDeck = new String[]{"Two C", " Two B", "Two P", "Two T", "Three C", "Three B", "Three P", "Three T",
                "Four C", "Four B", "Four P", "Four T", "Five C", "Five B", "Five P", "Five T", "Six C", "Six B", "Six P",
                "Six T", "Seven C", "Seven B", "Seven P", "Seven T", "Eight C", "Eight B", "Eight P", "Eight T",
                "Nine C", "Nine B", "Nine P", "Nine T", "Ten C", "Ten B", "Ten P", "Nine T", "Valet C", "Valet B", "Valet P",
                "Valet T", "Lady C", "Lady B", "Lady P", "Lady T", "King C", "King B", "King P", "King T",
                "Ace C", "Ace B", "Ace P", "Ace T"};
        for (int i = 0; i < n; i++){
                int counter = 0;
                while (counter < 5) {
                    int index = (int) (Math.random() * 52);
                    if (cardDeck[index] != null) {
                        System.out.print(cardDeck[index] + ", ");
                        cardDeck[index] = null;
                    counter++;
                }
            }
            System.out.println("\n");
        }
        scanner.close();
    }
}
