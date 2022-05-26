package by.academy.Test7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        User user = new User();
        Class<User> reflection1 = User.class;
        Class<? extends Person> reflection2 = user.getClass();
        Class<?> reflection3 = null;
        try {
            System.out.println(user.getClass());
            reflection3 = Class.forName("Task2.User");

        } catch (ClassNotFoundException e) {
            System.out.println("User class is not founded");;
        }
        Method method = reflection1.getMethod("printUserInfo");
        Method[] methodArray = reflection3.getMethods();
        Field field = reflection2.getField("age");
        Field [] fieldsArray1 = reflection1.getFields();
        Method method1 = reflection2.getDeclaredMethod("getLogin");
        Method[] methodDeclairArray = reflection1.getDeclaredMethods();
        Field field1 = reflection1.getField("password");
        Field [] fieldsArray2 = reflection3.getDeclaredFields();

    }
}