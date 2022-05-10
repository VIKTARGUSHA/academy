package by.academy.Test4.Task1;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws InterruptedException, ParseException {
        Year year = new Year(2022);
        Month month = new Month(4);
        Day day = new Day(10);
        Date date = new Date(2022 - 1900, month.month, day.day);
        Calendar calendar = new GregorianCalendar(year.year, month.month, day.day);
        Calendar calendar1 = new GregorianCalendar(2022,4 , 1);
        Calendar calendar2 = new GregorianCalendar(2022, 5, 10);
        Calendar calendar3 = new GregorianCalendar(2023, 5, 10);
        Calendar calendar4 = new GregorianCalendar(2024, 5, 10);
        //  Thread.sleep(2500);
        Task1.getWeek(date, calendar);
        Task1.getDayOfWeek(calendar);
        Task1.getQuantityOfDays(calendar1, calendar2);
        Task1.checkLeapYear(calendar4);
    }
    public Task1(String s) throws ParseException {
        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d-\\d{4}");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches()){
            return;
        }
        SimpleDateFormat sDF = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sDF.parse(s);
        Calendar calendar = new GregorianCalendar() {
        };
        calendar.setTime(date);
Year year = new Year(calendar.get(Calendar.YEAR));
Month month = new Month(calendar.get(Calendar.MONTH));
Day day = new Day(calendar.get(Calendar.DAY_OF_MONTH));


    }

    public static class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static class Month {
        private int month;

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    public static class Day {
        private int day;

        public Day(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }

    public static void getWeek(Date date, Calendar calendar) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E MMMM", Locale.ENGLISH);
//        Date date2 = simpleDateFormat.parse("Tue May");

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        // System.out.println(simpleDateFormat1.format(calendar.getTime()));
        System.out.println(simpleDateFormat1.format(date));

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
//        LocalDate localDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
//                calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(localDate.format(dateTimeFormatter));
    }

    public static void getDayOfWeek(Calendar calendar) {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String s = simpleDateFormat1.format(calendar.getTime());
        DaysOfWeek[] array = DaysOfWeek.values();
        for (DaysOfWeek dOW : array) {
            if (dOW.toString().equals(s)) {
                System.out.println(dOW);
            }
        }
    }
    public static void getQuantityOfDays(Calendar calendar1, Calendar calendar2){
      long startPeriod = calendar1.getTimeInMillis();
      long endPeriod = calendar2.getTime().getTime();
      long diff = endPeriod - startPeriod;
      long dayQuantity = diff/(1000*3600*24);
      int days = (int) dayQuantity;
        System.out.println(days);
    }
    public static void checkLeapYear(Calendar calendar){
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365);
    }
}
