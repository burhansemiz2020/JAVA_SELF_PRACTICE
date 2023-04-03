package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours14_WhileLoops05 {
    /*
    Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculateExponent(number, exponent);

        System.out.println(number + " raised to the power of " + exponent + " is " + result);
    }

    public static double calculateExponent(double number, int exponent) {
        double result = 1;
        int i = 1;

        while (i <= exponent) {
            result *= number;
            i++;
        }

        return result;
    }
}

