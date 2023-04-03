package Questions_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int islem= scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("1. islem");
                break;
            case 2:
                System.out.println("2. islem");
                break;
            case 3:
                System.out.println("3. islem");
                break;
            default:
                System.out.println("Gecersiz Islem");
                break;
        }
    }
}
