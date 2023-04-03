package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements06_Interview {
    public static void main(String[] args) {
        /*
        Soru ) Interview Question
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil
        degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen
        yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        double year = scan.nextDouble();
        if (year % 4 != 0) {
            System.out.println("Not leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && (year%400==0)) {
            System.out.println("Leap year");
        }
    }


}

