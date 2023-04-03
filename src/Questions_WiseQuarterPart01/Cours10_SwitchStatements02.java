package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours10_SwitchStatements02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int number = scan.nextInt();
        if (number>=10&&number<100) {
            int units=number%10;
            int tenths=number/10;
            switch (tenths) {
                case 1:
                    System.out.print("ten ");
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("fourty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninty ");
                    break;

            }switch (units){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
            }


        }
    }

