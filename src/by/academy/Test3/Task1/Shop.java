package by.academy.Test3.Task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) throws ParseException {
        int numberOfGoods = 5;
        User buyer = new User("Afanasiy", 48, 1000);
        User saller = new User("Albert", 33, 200);
        Product[] basket = new Product[numberOfGoods];
        basket[0] = new Vine(12, "Vine", 10, "Burgunskoe", "red", "semiDry", 100);
        basket[1] = new Vine(5, "Vine", 15, "Shampanskoe", "white", "semiSweet", 48);
        basket[2] = new Chocolate(12, "Chocolate", "Alpengolt", 5, "bitter", 100);
        basket[3] = new Bread(1, "Black", "Bread", "Narochanskiy", 55);
        Deal deal = new Deal("12:48", buyer, saller, basket, false, numberOfGoods);
        deal.deal();
        buyer.getCheckMoney(deal.fullPrice);
        buyer.buyerPay(deal.fullPrice);
        saller.sallerSold(deal.fullPrice);
        deal.setDone(true);

        //   BillPrint billPrint = new BillPrint(deal);
        System.out.println(Arrays.toString(basket));
        deal.addProduct(new Vine(12, "Vine", 10, "charlic", "red", "semiDry", 148));
        System.out.println(Arrays.toString(basket));
        deal.removeProduct(1);
        System.out.println(Arrays.toString(basket));
        BillPrint billPrint1 = new BillPrint(deal);
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        System.out.println(CheckDate.checkDate(date));
        CheckDate.showDate(date, CheckDate.checkDate(date));
        scanner.close();
    }

    // sDF.toPattern(date);
}

