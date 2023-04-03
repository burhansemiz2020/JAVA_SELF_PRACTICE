package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours14_WhileLoops04 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin
         */

            Scanner input = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            while (true) {
                System.out.print("Enter a positive integer (0 to finish): ");
                int number = input.nextInt();
                if (number == 0) {
                    break;
                } else if (number < 0) {
                    System.out.println("You cannot use negative numbers.");
                    continue;
                }
                sum += number;
                count++;
            }
            System.out.println("Total number of positive integers entered: " + count);
            System.out.println("Sum of positive integers entered: " + sum);
            /*
            In this program, we first import the Scanner class to read input from the user.
            Then, we create two variables to keep track of the sum of positive integers and
            the total number of positive integers entered. We use a while loop to repeatedly
            ask the user to enter a positive integer, and add it to the sum if it's positive.
            If the user enters 0, we break out of the loop. If the user enters a negative number,
            we print an error message and continue with the loop. Finally, we print the total
            number of positive integers entered and their sum. You can run this program and test
            it by entering positive integers one by one, and then entering 0 when you want to finish.
            If you enter a negative number, the program will print an error message and ask you
            to enter a positive integer again.
             */
        }
    }



