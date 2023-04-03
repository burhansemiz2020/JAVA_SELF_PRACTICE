package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q01_Exceptions_TryCatch {
    public static void main(String[] args) {
       int num1=20;
       int num2=0;
        try {
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(num1+num2);
    }
}
