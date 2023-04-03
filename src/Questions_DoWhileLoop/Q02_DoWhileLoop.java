package Questions_DoWhileLoop;

import java.util.Scanner;

public class Q02_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Bir sayinin rakamlari toplami
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        int sum=0;
        do {
            sum += num % 10;
            num /= 10;
            System.out.println("Num: " +num);
        }while (num>0);
        System.out.println("Sum of the num: " +sum);
        }

    }

