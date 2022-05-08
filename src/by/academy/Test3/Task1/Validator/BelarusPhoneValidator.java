package by.academy.Test3.Task1.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    @Override
    public boolean validate(String s) {
        Pattern pattern = Pattern.compile("\\+375\\d+");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
