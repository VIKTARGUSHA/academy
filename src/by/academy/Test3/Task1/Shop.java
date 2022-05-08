package by.academy.Test3.Task1;

import by.academy.Test3.Task1.Validator.BelarusPhoneValidator;
import by.academy.Test3.Task1.Validator.Validator;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {
    public static void main(String[] args) throws ParseException {
        Scanner scannerUser = new Scanner(System.in);
        int numberOfGoods = 5;
        String buyerDateOfBirth = null;
        int triger = 0;
        System.out.println("Enter user's date of birth ");
        while (triger == 0) {
            buyerDateOfBirth = scannerUser.next();
            String s = CheckDate.checkDate(buyerDateOfBirth);
            if(!s.equals("Date is wrong")){
                System.out.println(s + "\n Enter next user date of birth");
                triger++;
            }else
            System.out.println(s + "\n One more time please");
        }
        User buyer = new User("Afanasiy", 48, 1000, buyerDateOfBirth,"+374297000824", "victorgusha1@gmail.com" );

        String sallerDateOfBirth = null;
        while (triger == 1) {
            sallerDateOfBirth = scannerUser.next();
            String s = CheckDate.checkDate(sallerDateOfBirth);
            if(!s.equals("Date is wrong")){
                System.out.println(s);
                triger++;
            }else
                System.out.println(s + "\n One more time please");
        }
        User saller = new User("Albert", 33, 200, sallerDateOfBirth, "+375299000990", "post@tut.by");

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
        System.out.println("Enter date of deal please");
        String date = scannerUser.next();
        System.out.println(CheckDate.checkDate(date));
        CheckDate.showDate(date, CheckDate.checkDate(date));
        scannerUser.close();
        class EmailValidator implements Validator {
            @Override
            public boolean validate(String s) {
                Pattern pattern = Pattern.compile("\\w+@\\w*(mail|tut)\\.(com|by)");
                Matcher matcher = pattern.matcher(s);
                return matcher.matches();
            }
        }
        EmailValidator emailValidator = new EmailValidator();
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        System.out.println("Check saller email: " + emailValidator.validate(saller.getEmail()));
        System.out.println("Check buyer email: " + emailValidator.validate(buyer.getEmail()));
        System.out.println("Check saller phone: " + belarusPhoneValidator.validate(saller.getPhone()));
        System.out.println("Check buyer phone: " + belarusPhoneValidator.validate(buyer.getPhone()));

    }
}


