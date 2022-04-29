package by.academy.Test1;

import java.util.Scanner;

//Ввести с консоли сумму покупки в магазине и возраст покупателя,
//        в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.
//
//        Скидки:
//        1) Сумма до 100 рублей -> 5%
//        2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
//        3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
//        4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
//        5) Сумма покупки больше 400 рублей включая -> 20%
//
//        В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая)
//        и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = scanner.nextDouble();
        int age = scanner.nextInt();
        if (totalPrice < 100) {
            System.out.println(totalPrice * 0.95);
        } else if (totalPrice < 200) {
            System.out.println(totalPrice * 0.93);
        } else if (totalPrice < 300 && age > 18) {
            System.out.println(totalPrice * 0.84);
        } else if (totalPrice < 300) {
            System.out.println(totalPrice * 0.91);
        } else if (totalPrice < 400) {
            System.out.println(totalPrice * 0.85);
        } else System.out.println(totalPrice * 0.8);
scanner.close();
    }
}