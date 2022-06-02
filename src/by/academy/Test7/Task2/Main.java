package by.academy.Test7.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<User> classUser = User.class;
        Class<Person> classPerson = Person.class;

        User user = new User();
        Person person = new Person();
        Class<? extends User> classUser1 = user.getClass();
        Class<? extends Person> classPerson1 = person.getClass();

        Class<?> classUser2 = null;
        Class<?> classPerson2 = null;
        try {
             classUser2 = Class.forName(classUser.getName());
             classPerson2 = Class.forName("by.academy.Test7.Task2.User");
        } catch (ClassNotFoundException ex) {
            System.out.println("There is ClassNotFoundException");
        }

        Method method = classUser.getMethod("printUserInfo");
        Method [] methodsUser = classUser.getMethods();
        Method methodPerson = classPerson.getMethod("toString");
        Method [] methodsPerson = classPerson.getMethods();

        try{Field fieldUserEmail = classUser1.getField("email");
        Field fieldUserPassword = classUser1.getField("password");
        Field fieldUserLogin = classUser1.getField("login");
        Field [] fieldsUser = classUser1.getFields();
        Field fieldPersonAge = classPerson1.getField("age");
        Field fieldPersonFirstName = classPerson1.getField("firstName");
        Field fieldPersonLastName = classPerson1.getField("lastName");
        Field fieldPersonDate = classPerson1.getField("date");
        Field [] fieldsPerson = classPerson1.getFields();


        for(Field field : fieldsUser ){
            System.out.print( "Fields of user: " + field + " " );
        }

        for(Field field : fieldsPerson){
            System.out.println("Fields of person: " + field + " ");
        }

        fieldUserEmail.setAccessible(true);
        fieldUserEmail.set(user, "mail");
        fieldUserPassword.setAccessible(true);
        fieldUserPassword.set(user, "12345");
        fieldUserLogin.setAccessible(true);
        fieldUserLogin.set(user, "SomeUser");

        fieldPersonAge.setAccessible(true);
        fieldPersonAge.set(person, 18);
        fieldPersonDate.setAccessible(true);
        fieldPersonDate.set(person, LocalDate.now());
        fieldPersonFirstName.setAccessible(true);
        fieldPersonFirstName.set(person, "SomePerson");
        fieldPersonLastName.setAccessible(true);
        fieldPersonLastName.set(person, "SomeLastName");

        for(Field field : fieldsUser ){
            System.out.print( "Fields of user: " + field + " " );
        }

        for(Field field : fieldsPerson){
            System.out.println("Fields of person: " + field + " ");
        }
        }catch (NoSuchFieldException ex){
            System.out.println("There is ex");
        }
        System.out.println("In spite of anything it continious");

        Field fieldUserPrivateEmail = classUser2.getDeclaredField("email");
        Field fieldUserPrivatePassword = classUser2.getDeclaredField("password");
        Field fieldUserPrivateLogin = classUser2.getDeclaredField("login");
        Field [] fieldsDeclairUser = classUser2.getDeclaredFields();

        Field fieldPersonPrivateAge = classPerson.getDeclaredField("age");
        Field fieldPersonPrivateFirstName = classPerson.getDeclaredField("firstName");
        Field fieldPersonPrivateLastName = classPerson.getDeclaredField("lastName");
        Field fieldPersonPrivateDate = classPerson.getDeclaredField("date");
        Field [] fieldsDeclairedPerson = classPerson.getDeclaredFields();

        System.out.println("Fields of User: ");
        for(Field field : fieldsDeclairUser ){
            field.setAccessible(true);
            System.out.print( field.get(user) + " " );
        }

        System.out.println("\n" + "Fields of Person: ");
        for(Field field : fieldsDeclairedPerson){
            field.setAccessible(true);
            System.out.print( field.get(person) + " ");
        }
        System.out.println();

fieldUserPrivateEmail.setAccessible(true);
        fieldUserPrivateEmail.set(user, "@gmail");
        fieldUserPrivateLogin.setAccessible(true);
        fieldUserPrivateLogin.set(user, "SomeLogin");
        fieldUserPrivatePassword.setAccessible(true);
        fieldUserPrivatePassword.set(user, "12345");

        fieldPersonPrivateAge.setAccessible(true);
        fieldPersonPrivateAge.set(person, 18);
        fieldPersonPrivateDate.setAccessible(true);
        fieldPersonPrivateDate.set(person, new Date(22/ 2 /2022));
        fieldPersonPrivateFirstName.setAccessible(true);
        fieldPersonPrivateFirstName.set(person, "SomeName");
        fieldPersonPrivateLastName.setAccessible(true);
        fieldPersonPrivateLastName.set(person, "SomeLastName");

        System.out.println("Fields of User: ");
        for(Field field : fieldsDeclairUser ){
            field.setAccessible(true);
            System.out.print( field.get(user) + " " );
        }

        System.out.println("\n" + "Fields of Person: ");
        for(Field field : fieldsDeclairedPerson){
            field.setAccessible(true);
            System.out.print( field.get(person) + " ");
        }

        Method methodUser1 = classUser1.getMethod("printUserInfo");
        System.out.println("\n" + methodUser1.invoke(user));
        System.out.println(fieldPersonPrivateAge.get(person));
        Method methodPerson1 = classPerson1.getMethod("setAge", int.class);
        methodPerson1.invoke(person, 48);
        System.out.println(fieldPersonPrivateAge.get(person));
        Method methodUser2 = classUser.getDeclaredMethod("loginAndEmail");
        methodUser2.setAccessible(true);
        System.out.println(methodUser2.invoke(user));
        Method personToStringMethod = classPerson.getMethod("toString");
        System.out.println(personToStringMethod.invoke(person));

        Constructor<?> constructorUser = classUser.getConstructor(String.class, String.class, int.class, Date.class, String.class, String.class, String.class);
        Constructor<?> constructorUser2 = classUser.getConstructor(String.class, String.class);
        Constructor<?> constructorUser1 = classUser.getConstructor();
        Constructor<?> constructorUser3 = classUser.getConstructor(String.class, String.class, int.class);
        Date date = new Date(22/2/2022);
        User userReflect = (User)constructorUser1.newInstance();
        User userReflect1 = (User) constructorUser.newInstance("a", "b", 1, date, "c", "d", "e" );
        User userReflect2 = (User) constructorUser2.newInstance("a", "b");
        User userReflect3 = (User) constructorUser3.newInstance("e","d",1);
        Field fieldUser5 = classUser.getDeclaredField("login");
        fieldUser5.setAccessible(true);
        System.out.println(fieldUser5.get(userReflect2) + " " + userReflect.getClass());
fieldUser5.set(userReflect2, "u");
        System.out.println(fieldUser5.get(userReflect2));
        System.out.println(fieldUser5.get(userReflect3));
        Constructor[] constructors = classUser.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
        }
    }
}