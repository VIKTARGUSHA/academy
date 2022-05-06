package by.academy.Test3.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {

    public static String checkDate(String date){
        Pattern pattern = Pattern.compile(("\\d{2}(/)\\d{2}(/)\\d{4}"));
        Pattern pattern1 = Pattern.compile(("\\d{2}(-)\\d{2}(-)\\d{4}"));
        Matcher matcher = pattern.matcher(date);
        Matcher matcher1 = pattern1.matcher(date);
        if (matcher.matches()){
            return 1 + " Date has format dd/MM/yyyy";
        }else if (matcher1.matches()){
            return 2 + " Date has format dd-MM-yyyy";
        }else return "Date is wrong";
    }
}
