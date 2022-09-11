package oops.practice.exceptionHandlng;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {

        int a = 20;
        int b = 0;
        // int c= a/b;  --> Exception in thread "main" java.lang.ArithmeticException: / by zero


        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getCause());   // null
            System.out.println(e.getMessage());  /// by zero
            System.out.println(e.getLocalizedMessage());  /// by zero
            System.out.println(" Sorry , try again !"); //  Sorry , try again !
        } finally {
            System.out.println("this will always execute"); //this will always execute
            System.out.println(" Thank you"); // Thank you
        }


        NewThrow n1 = new NewThrow("m",24);
        System.out.println(n1.name + " " + n1. age);


        NewThrow n2 = new NewThrow(n1);
        System.out.println(n2.age + " " + n2.name);



    }
}
