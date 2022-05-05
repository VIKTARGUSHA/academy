package by.academy.Test3.Task1;

import java.util.regex.Pattern;

public class CheckDate {
    String date;
    public CheckDate(String date){
        this.date = date;
    }
    Pattern pattern = Pattern.compile(("\\d{2}(/|-)\\d{2}(/|-)\\d{4}"));
}
