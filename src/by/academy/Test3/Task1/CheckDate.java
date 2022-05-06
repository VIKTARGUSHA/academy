package by.academy.Test3.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {

    public static String checkDate(String date) {
        Pattern pattern = Pattern.compile(("\\d{2}(/)\\d{2}(/)\\d{4}"));
        Pattern pattern1 = Pattern.compile(("\\d{2}(-)\\d{2}(-)\\d{4}"));
        String date1 = date;
            Matcher matcher = pattern.matcher(date1);
            Matcher matcher1 = pattern1.matcher(date1);

            if (matcher.matches()) {
                return "a" + " Date has format dd/MM/yyyy";
            }
            if (matcher1.matches()) {
                return "b" + " Date has format dd-MM-yyyy";
            }
        return "Date is wrong";
    }
    public static void showDate(String date, String s){
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sDF1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdF2 = new SimpleDateFormat("dd");
        SimpleDateFormat sdF3 = new SimpleDateFormat("MM");
        SimpleDateFormat sdF4 = new SimpleDateFormat("yyyy");
        String[] array = s.split(" ");
        try {
            if (array[0].equals("a")) {
                Date date1 = sDF.parse(date);
                System.out.println("День: " + sdF2.format(date1) + "\n"
                        + "Месяц: " + sdF3.format(date1) + "\n" + "Год: " + sdF4.format(date1));
            }
            else if (array[0].equals("b")) {
                Date date2 = sDF1.parse(date);
                System.out.println("День: " + sdF2.format(date2) + "\n" + "Месяц: "+ sdF3.format(date2)
                        + "\n" + "Год: " + sdF4.format(date2));
            }
        } catch (ParseException e) {
            System.out.println("Hello parse exc");
        }

    }
}
