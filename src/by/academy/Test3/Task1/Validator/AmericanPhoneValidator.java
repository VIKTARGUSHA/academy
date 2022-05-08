package by.academy.Test3.Task1.Validator;

import by.academy.Test3.Task1.Validator.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    @Override
    public boolean validate(String s) {
        Pattern pattern = Pattern.compile("\\+1\\d+");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
